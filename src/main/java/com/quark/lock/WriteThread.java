package com.quark.lock;

/**
 * Created by ZhenpengLu on 2018/4/2.
 */
public class WriteThread implements  Runnable {

    private ReadAndWriteLock readAndWriteLock ;

    public WriteThread(ReadAndWriteLock readAndWriteLock) {
        this.readAndWriteLock = readAndWriteLock;
    }

    @Override
    public void run() {
        readAndWriteLock.write();
    }
}
