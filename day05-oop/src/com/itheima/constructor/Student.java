package com.itheima.constructor;

public class Student {
    String name;
    int age;
    char sex;

    //1,构建无参数的值
    //构造器:是一种特殊方法,不能写返回值类型,方法名与类名相同,可以有多个,可以重载
    public Student() {
        System.out.println("=======无参构造器执行了=======");
    }

    //2,构建有参数的构造器
    public Student(String n) {
        System.out.println("=======有参构造器执行了=======");
    }

    public Student(String n, int a, char s) {
        name = n;
        age = a;
        sex = s;
    }
}
