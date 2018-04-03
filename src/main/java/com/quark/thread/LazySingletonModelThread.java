package com.quark.thread;

/**
 * Created by ZhenpengLu on 2018/4/2.
 */
public class LazySingletonModelThread implements Runnable {


    @Override
    public void run() {
//        使用dcl双检查锁
        System.out.println("双检查锁机制"+LazySingletonWithSyn.getStudent().hashCode());
//        使用静态内部类
        System.out.println("静态内部类"+LazySingletonWithStatic.InnerStatic.getStudent().hashCode());
    }
}
