package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
        //目标;认识类的构造器,搞清楚其特点和常见应用场景
        //构造器的特点:创建对象时,对象会立即自动调用构造器
        Student s1 = new Student();
        Student s2 = new Student("程博远");

        System.out.println("===========================");

        Student t1 = new Student();
        t1.name = "小王";
        t1.age = 18;
        t1.sex = '男';
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.sex);

        //对象的一种常见应用场景:创建对象,并给对象成员变量赋值
        Student t2 = new Student("小李", 19, '女');
        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.sex);
    }
}
