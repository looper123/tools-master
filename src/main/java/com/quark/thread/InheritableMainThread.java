package com.quark.thread;

/**
 * Created by ZhenpengLu on 2018/3/30.
 */
public class InheritableMainThread implements Runnable {

    @Override
    public void run() {
        System.out.println("inheritable thread get from"+MyThreadLocal.inheritableThreadLocal.get());
    }
}
