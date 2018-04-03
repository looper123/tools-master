package com.quark.entity;

import java.io.Serializable;

/**
 * Created by ZhenpengLu on 2018/4/3.
 */
public class SingletonObject implements Serializable {

    private final static long serialVersionUID = 3131L;

    static class InnerClass{

        private static final SingletonObject singletonObject = new SingletonObject();
    }
    public  static  SingletonObject getInstance(){
        return InnerClass.singletonObject;
    }

//    在序列化创建实例的时候被引用 （解决了序列化单例对象时 对象的单例变为多例的问题）
    protected  Object readResolve(){
        System.out.println("调用了readResolve方法");
        return InnerClass.singletonObject;
    }


}
