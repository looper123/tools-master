package com.quark.thread;

/**
 * Created by 311198 on 2017/2/27.
 */
public class ThreadMethod implements Runnable {

    private Object lock = new Object();

    //  定义初始值
    private  int i = 0;

    //定义线程量  存储线程名称
    private String tName = "t1";

    @Override
    public void run() {
        while (i <= 100) {
            synchronized (lock) {
                if (tName.equals(Thread.currentThread().getName())) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                for (int j = 0; j < 1; j++) {
                    System.out.println("当前线程" + Thread.currentThread().getName() + "-----------" + i);
                    i++;
//                }
                tName = Thread.currentThread().getName();
                lock.notify();
            }

        }
    }



}
