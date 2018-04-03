package com.quark.thread;

import com.quark.entity.Student;

/**
 * Created by ZhenpengLu on 2018/4/2.
 * 解决多线程单例懒汉模式的 线程安全&效率问题
 * 双检查锁机制
 */
public class LazySingletonWithSyn {

    private static Student student;

    public static Student getStudent() {
//        当没有student 对象时 去创建 当有了对象后 就不再去同步代码块中执行 提升了效率
        if (student == null) {
            synchronized (LazySingletonWithSyn.class) {
//                保证student对象的同步性
                if (student == null) {
                    student = new Student(11,"looper",100);
                }
            }
        }
        return student;
    }


}
