package com.itheima.staticmethod;

public class Test {
    public static void main(String[] args) {
        //目标:认识static修饰和不修饰的区别
        //1,类名.静态方法(推荐);
        Student.print();

        //2,对象,静态方法(不推荐)
        Student s = new Student();
        s.print();

        //3,对象名,实例方法
        //Student.show();
        s.setScore(69.5);
        s.show();

        //规范,如果这个方法只是为了做一份功能且不需要直接访问的数据,这个方法直接定义成静态法法
        //如果这个方法是对象的行为,需要访问对象的数据,这个方法必须定义实例方法.
    }
}
