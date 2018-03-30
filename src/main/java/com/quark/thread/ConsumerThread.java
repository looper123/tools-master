package com.quark.thread;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/29.
 */
public class ConsumerThread implements Runnable {

    private MyConsumer myConsumer;

    List<String> pList;

    private ReentrantLock lock;

    public ConsumerThread(MyConsumer myConsumer, List<String> pList, ReentrantLock lock) {
        this.myConsumer = myConsumer;
        this.pList = pList;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            myConsumer.consumer(pList,lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
