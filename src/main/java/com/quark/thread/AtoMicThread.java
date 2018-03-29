package com.quark.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ZhenpengLu on 2018/3/29.
 */
public class AtoMicThread implements Runnable {

    private   volatile  boolean  flag = true ;

    private AtomicInteger a = new AtomicInteger(100);

    public void run() {
        while(flag){
            int i = a.decrementAndGet();
            if(i == 1){
                flag = false;
            }
            System.out.println(Thread.currentThread().getName()+"-------"+i);
        }
    }
}
