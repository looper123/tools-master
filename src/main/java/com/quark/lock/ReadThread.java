package com.quark.lock;

/**
 * Created by ZhenpengLu on 2018/4/2.
 */
public class ReadThread implements  Runnable {

    private ReadAndWriteLock readAndWriteLock ;

    public ReadThread(ReadAndWriteLock readAndWriteLock) {
        this.readAndWriteLock = readAndWriteLock;
    }

    @Override
    public void run() {
        readAndWriteLock.read();
    }
}
