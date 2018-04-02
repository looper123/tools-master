package com.quark.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * 场景：消费者 和生产者使同一把锁
 * 生产者 消费者线程使用各自的 condition
 */
public class PartConditionSignal {

    private ReentrantLock reentrantLock = new ReentrantLock();
//    定义两个condition对应消费者 和 生产者
    private Condition conditionA = reentrantLock.newCondition();
    private Condition conditionB = reentrantLock.newCondition();

//    让所有的conditionA处于等待状态
    public  void awaitAllThreadA(){
        try {
            System.out.println("conditionA thread all in await");
            reentrantLock.lock();
            conditionA.await();
            System.out.println("conditionA thread are in alive----"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    //    让所有的conditionB处于等待状态
    public  void awaitAllThreadB(){
        try {
            System.out.println("conditionB thread all in await");
            reentrantLock.lock();
            conditionB.await();
            System.out.println("conditionB thread are in alive----"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }


//    唤醒所有condition1相关线程
    public  void  signalAllConditionA()  {
                try {
                    reentrantLock.lock();
                    conditionA.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    reentrantLock.unlock();
                }

    }


    //    唤醒所有condition2相关线程s
    public  void  signalAllConditionB()  {
        try {
            reentrantLock.lock();
            System.out.println(Thread.currentThread().getName()+"----is wake up");
            conditionB.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }

    }

}
