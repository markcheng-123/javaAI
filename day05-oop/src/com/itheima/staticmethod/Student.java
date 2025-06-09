package com.itheima.staticmethod;

public class Student {
    private double score;
    //静态方法,有static访问,属于类持有.

    public static void print() {
        System.out.println("student print");
        System.out.println("student print");
        System.out.println("student print");
    }

    //实例方法,无static访问,属于对象持有.
    public void show() {
        System.out.println(score >= 60 ? "及格" : "不及格");

    }

    public void setScore(double score) {
        this.score = score;
    }
}
