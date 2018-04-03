package com.quark.thread;

import com.quark.entity.Student;

/**
 * Created by ZhenpengLu on 2018/4/2.
 * 解决多线程单例懒汉模式的 线程安全&效率问题
 * 静态内部类
 */
public class LazySingletonWithStatic {

    private static Student student;

    static class InnerStatic{

        public static Student getStudent() {
//        当没有student 对象时 去创建 当有了对象后 就不再去同步代码块中执行 提升了效率
            if (student == null) {
//                保证student对象的同步性
                        student = new Student(11,"looper",100);
                }
            return student;
        }
    }


}
