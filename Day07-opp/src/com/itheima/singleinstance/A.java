package com.itheima.singleinstance;
//设计单例类模式
public class A {
    //2,定义一个静态变量,用于记录本类的一个唯一对象.
    public static A a = new A();
    //相当于public static int a = 20;

    //1,私有化构造器:确保单例类不能对外创建太多对象,单例才有可能性
    private A() {
    }

    //3,提供一个公开的静态方法,返回这个类的唯一对象.
    public static A getInstance() {
        return a;
    }
}
