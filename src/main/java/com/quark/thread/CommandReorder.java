package com.quark.thread;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by ZhenpengLu on 2018/7/3.
 * 指令重排序问题
 */
public class CommandReorder {

    private volatile  static boolean flag ;

    public static void main(String[] args) {
         new Thread(new Runnable() {
            @Override
            public void run() {
                while(!flag){
                    System.out.println("new thread is running....");
                }
            }
        }).start();
        try {
            Thread.sleep(3000);
            flag = true;
            System.out.println("main thread is end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
