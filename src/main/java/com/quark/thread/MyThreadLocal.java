package com.quark.thread;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * ThreadLocal 相关特性
 */
public class MyThreadLocal {

    public static  ThreadLocal  threadLocal = new ThreadLocal();

//    让子线程在从父线程获取值
    public static  MyInheritableThreadLocal inheritableThreadLocal = new MyInheritableThreadLocal();

    public static void main(String[] args) {
//        threadLocal.set("initial value");
//        System.out.println("main线程初始值"+threadLocal.get());
        inheritableThreadLocal.set("put it main thread ");
//        创建子线程
        Thread inheritableThread = new Thread(new InheritableMainThread());
        Thread inheritableThread2 = new Thread(new InheritableMainThread());
        inheritableThread.start();
        System.out.println("父线程---"+inheritableThreadLocal.get());
    }
}
