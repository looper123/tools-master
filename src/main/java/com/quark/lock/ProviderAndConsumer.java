package com.quark.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * 多对多 生产-消费者模式 使用不同condition
 */
public class ProviderAndConsumer {

    private int num;

    private ReentrantLock reentrantLock = new ReentrantLock();

    private Condition providerCondition = reentrantLock.newCondition();
    private Condition consumerCondition = reentrantLock.newCondition();




    public void providerAllAwait() {
        try {
            reentrantLock.lock();
            System.out.println("provider--"+Thread.currentThread().getName()+"begin  await");
//            等待中
            providerCondition.await();
//        note ：当providerCondition没有全部进入await状态时 下面的代码还会执行，但是当所有的providerCondition进入
//              await状态后 代码会从被唤醒且拿到锁的方法的await下（上次await的地方）继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void consumerAllAwait() {
        try {
            reentrantLock.lock();
            System.out.println("consumer--- "+Thread.currentThread().getName()+"begin  await");
//            等待中
            consumerCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void providerAllSignal() {
        try {
            reentrantLock.lock();
            providerCondition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void consumerAllSignal() {
        try {
            reentrantLock.lock();
            consumerCondition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    //    生产
    public void provider() {
        try {
            reentrantLock.lock();
            while (true) {
                if (num > 100) {
//                生产者等待
                    providerAllAwait();
//                    获取当前锁对象下 绑定了指定condition 并且在await的线程数
                    System.out.println("是否有等待获取锁的线程" + reentrantLock.hasQueuedThreads());
                    System.out.println("给定condition下是否有await的线程" + reentrantLock.hasWaiters(
                            providerCondition)+"数量是"+reentrantLock.getWaitQueueLength(providerCondition));
                } else {
                    num++;
                    System.out.println(Thread.currentThread().getName() + "---is providing---" + num);
//              让消费者处在唤醒状态 但是没有锁
                    consumerAllSignal();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    //   消费
    public void conusmer() {
        try {
            reentrantLock.lock();
            while (true) {
                if (num <= 0) {
//                消费者等待
                    consumerAllAwait();
//                    获取当前线程下 绑定了指定condition 并且在并且在await的线程数
                    System.out.println("是否有等待获取锁的线程" + reentrantLock.hasQueuedThreads());
                    System.out.println("给定condition下是否有await的线程" + reentrantLock.hasWaiters(
                            consumerCondition)+"数量是"+ reentrantLock.getWaitQueueLength(consumerCondition));
                } else {
                    num--;
                    System.out.println(Thread.currentThread().getName() + "---is consuming---" + num);
//                    让生产者处于唤醒状态 但是没有锁
                    providerAllSignal();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
