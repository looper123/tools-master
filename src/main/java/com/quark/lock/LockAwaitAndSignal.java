package com.quark.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * 可重入锁实现等待唤醒
 */
public class LockAwaitAndSignal implements Runnable {

    private int num = 100;

    private ReentrantLock reentrantLock = new ReentrantLock();

    private Condition condition = reentrantLock.newCondition();

//    可以对一个lock创建多个condition对象 实现不同情况的监视 & 唤醒部分线程（而不是使用该锁的所有线程）
//    唤醒部分线程（取决于该现场是由哪一个condition来等待）
    private Condition condition1 = reentrantLock.newCondition();
    private Condition condition2 = reentrantLock.newCondition();

    @Override
    public void run() {
        reentrantLock.lock();
        while(num > 0){
            if(num == 50 && !"Thread_3".equals(Thread.currentThread().getName())){
                try {
                    System.out.println(Thread.currentThread().getName()+"停止了");
//                    线程被唤醒后 会继续往下执行代码 而不是从头开始
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                num--;
                System.out.println(Thread.currentThread().getName()+"============"+num);
                condition.signalAll();
            }
        }
        reentrantLock.unlock();
    }
}
