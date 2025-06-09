package com.itheima.capsulation;

public class Test {
    public static void main(String[] args) {
        //目标:搞清楚封装的设计思想,合理隐藏合理暴露,学会如何隐藏,学会如何暴露
        Student s1 = new Student();
        s1.setAge(18);
        System.out.println(s1.getAge());//取值
        s1.setChinese(100);
        System.out.println(s1.getChinese());
        s1.setMath(100);
        System.out.println(s1.getMath());
    }
}
//封装就是用类设计对象处理某一个事物的数据时,应该把要处理的数据,以及处理这些数据的方法,设计到一个对象中去
//面相对象的三大特征:封装,继承,多态
//封装的设计规范是合理隐藏,合理暴露
//公开成员,可以使用public进行修饰
//隐藏成员,可以使用private进行修饰

