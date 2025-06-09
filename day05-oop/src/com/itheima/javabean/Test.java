package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        //目标:搞清楚实体类是啥,搞清楚其基本作用和应用场景
        //实体类的基本作用:创建他的对象,存储数据(封装数据)
        Student s = new Student();
        s.setName("小明");
        s.setChinese(100);
        s.setMath(90);
        System.out.println(s.getName() + " " + s.getChinese() + " " + s.getMath());

        System.out.println("================");

        Student s2 = new Student("小明", 59, 80);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        // 
    }
}
