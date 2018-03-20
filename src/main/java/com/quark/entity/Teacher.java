package com.quark.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 311198 on 2017/3/1.
 * 使用ThreadLocal解决多线程单例成员变量的线程安全问题
 */
public class Teacher {

    int age;

    String name;

    private ThreadLocal<Map<String, Object>> tl = new ThreadLocal();

    public int getAge() {
        Map<String, Object> map = tl.get();
        if(tl.get() !=null) {
            return (int) map.get("age");
        }
        return 0;
    }

    public void setAge(int age) {
        if (tl.get() == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("age", age);
            tl.set(map);
        } else {
            tl.get().put("age", age);
        }
    }

    public String getName() {
        Map<String, Object> map = tl.get();
        if(tl.get() !=null){
        return tl.get() == null ? null : (String) map.get("name");
        }
        return null;
    }

    public void setName(String name) {
        if (tl.get() == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", name);
            tl.set(map);
        } else {
            tl.get().put("name", name);
        }

    }

    private Teacher() {
    }

    ;

    private static Teacher teacher;

    public static Teacher getInstance() {
        if (teacher == null) {
            teacher = new Teacher();
        }
        return teacher;
    }

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "age=" + getAge() +
//                ", name='" + getName() + '\'' +
//                '}';
//    }
}
