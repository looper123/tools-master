package com.quark.thread;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/29.
 */
public class ProviderThread implements Runnable {

    private MyProvider  myProvider;

    List<String> pList;

    private ReentrantLock lock;

    public ProviderThread(MyProvider myProvider, List<String> pList, ReentrantLock lock) {
        this.myProvider = myProvider;
        this.pList = pList;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            myProvider.provide(pList,lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
