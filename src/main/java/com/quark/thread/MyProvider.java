package com.quark.thread;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/29.
 * 等待唤醒 ----生产者
 */
public class MyProvider {

    String lock = "1";
    //生产产品
     public  void  provide(List<String>  pList, ReentrantLock lock) throws InterruptedException {
         synchronized (lock){
             while(true){
                 if(pList.size() >=100){
                     lock.wait();
                 }
                 pList.add("product");
                 System.out.println(Thread.currentThread().getName()+"----provider----"+pList.size());
                 lock.notifyAll();
             }
         }
     }
}
