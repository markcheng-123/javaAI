package com.itheima.entends1demo;

public class Test {
    public static void main(String[] args) {
        //目标:认识继承,好处
        //1,创建对象,封装老师数据
        //子类可以继承父类的非私有成员变量和成员方法
        //子类对象其实是由子类和父类多张设计图共同创建出来的对象,所以子类对象是完整的

        Teacher t1 = new Teacher();
        t1.setName("小美");
        t1.setSex('女');
        t1.setGetSkill("java");
        System.out.println(t1.getName() + " " + t1.getSex() + " " + t1.getGetSkill());
    }
}
