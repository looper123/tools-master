package com.quark.entity;

/**
 * Created by 311198 on 2017/2/16.
 */
public class Student2 implements Comparable {

    private int age;
    private int score;
    private String name;

    public Student2(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student2))
            throw new RuntimeException("类型不匹配！！");
//        强转类型
        Student2 s = (Student2)o;
        int temp=this.age-s.age;
        return temp == 0? this.score-s.score:temp;
    }
}
