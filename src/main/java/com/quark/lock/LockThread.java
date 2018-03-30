package com.quark.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * 使用锁实现多线程的同步
 */
public class LockThread implements Runnable {

    private int num = 100;

    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        reentrantLock.lock();
        while (num > 0) {
            //        加锁
            num--;
            System.out.println(Thread.currentThread().getName() + "executing...." + num);
        }
        reentrantLock.unlock();
    }
}
