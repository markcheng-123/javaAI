package com.itheima.object;

public class Test1 {
    public static void main(String[] args) {
        //目标:创建学生的对象存储学生数据,并操作学生数据
        Student s1 = new Student();
        s1.name = "小明";
        s1.chinese = 100;
        s1.math = 90;
        s1.printAllScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "小红";
        s2.chinese = 80;
        s2.math = 100;
        s2.printAllScore();
        s2.printAverageScore();
    }
}
