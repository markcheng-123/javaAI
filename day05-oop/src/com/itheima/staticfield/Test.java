package com.itheima.staticfield;

public class Test {
    public static void main(String[] args) {
        //目标:认识static修饰成员变量,特点,访问机制,搞清楚作用域
        //1,类名,静态变量(推荐)
        Student.name = "袁华";
        System.out.println(Student.name);

        //2,对象名,静态变量(不推荐)
        Student s1 = new Student();
        s1.name = "马冬梅";

        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name);//秋雅
        System.out.println(s2.name);//秋雅

        s1.age = 18;
        s2.age = 19;
        System.out.println(s1.age);//18
    }
}
//static叫做静态修饰符,可以修饰成员变量,成员方法
//静态变量,数据只需要一份,且需要被共享时(访问,修改)
//实例变量,每个对象有自己一份数据,数据各不相同(如:name,age)
//访问自己类中的类变量,可以省略类名不写
