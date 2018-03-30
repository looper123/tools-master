package com.quark.thread;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/29.
 * 等待唤醒 --消费者
 */
public class MyConsumer {

    //    消费产品
    public void consumer(List<String> pList, ReentrantLock lock) throws InterruptedException {

        synchronized (lock) {
            while (true) {
                if (pList.size() == 0) {
                    lock.wait();
                }
                pList.remove("product");
                System.out.println(Thread.currentThread().getName() + "----consumer----" + pList.size());
                lock.notifyAll();
            }
        }
    }


}
