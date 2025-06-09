package com.itheima.thisdemo;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.print();
        System.out.println("s1");

        System.out.println("------------------------");

        Student s2 = new Student();
        s2.print();
        System.out.println("s2");

        System.out.println("------------------------");

        Student s3 = new Student();
        s3.name = "易烊千玺";
        s3.printHobby("唱歌");
    }
}
//this就是一个变量,可以在方法中,用来拿到当前对象;哪个对象调用这个方法,this就拿到哪个对象
//this关键字在实际开发中用来解决对象的成员变量与方法内部变量的名称一致时,导致访问冲突问题的.
