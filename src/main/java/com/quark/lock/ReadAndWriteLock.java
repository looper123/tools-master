package com.quark.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by ZhenpengLu on 2018/4/2.
 */
public class ReadAndWriteLock {

    private volatile ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public  void read(){
//        获取读锁
        reentrantReadWriteLock.readLock().lock();
        System.out.println("获取读锁---"+Thread.currentThread().getName());
        try {
//            保证当前读锁的持有状态 验证读锁不具有互斥性 （如果具有互斥性 ，当前线程的sleep操作会让下一个线程拿到锁的时间延后）
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }


    public  void write(){
        //        获取写锁
        reentrantReadWriteLock.writeLock().lock();
//        保证当前写锁的持有状态 验证写锁具有互斥性 （如果具有互斥性 ，当前线程的sleep操作会让下一个线程拿到锁的时间延后）
        System.out.println("获取写锁---"+Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
