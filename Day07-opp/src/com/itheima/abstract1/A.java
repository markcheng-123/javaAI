package com.itheima.abstract1;
//抽象类
public  abstract class A {
    private String name;
    private int age;

    public A() {
        System.out.println("A的无参构造器");
    }

    public A(String name,int age) {
        this.name= name;
        this.age= age;
    }
    //抽象方法:必须用abstract修饰,没有方法体,只有方法声明
    public abstract void show();

    public void show1(){
        System.out.println("show1方法");
    }
}
