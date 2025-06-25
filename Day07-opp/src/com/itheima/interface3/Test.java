package com.itheima.interface3;

public class Test {
    public static void main(String[] args) {
        //目标:完成接口的小案例
        //1,定义学生类,创建学生对象,封装学生数据,才能交给别人处理学生的数据
        //2,准备学生数据,自己造一些测试数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 90);
        allStudents[1] = new Student("李四", '女', 80);
        allStudents[2] = new Student("王五", '男', 70);
        allStudents[3] = new Student("赵六", '女', 60);
        allStudents[4] = new Student("钱七", '男', 50);
        allStudents[5] = new Student("孙八", '女',40);
        allStudents[6] = new Student("周九", '男',30);
        allStudents[7] = new Student("吴十", '女',20);
        allStudents[8] = new Student("赵敏", '女', 100);
        allStudents[9] = new Student("周芷若", '女', 10);

        //3,提供两套业务实现方案,支持灵活切换,(解耦合),面向接口编程
        //   --定义一个接口(规范思想),必须完成打印全班学生信息,打印平均分.(ClassDataInter)
        //   --定义一套实现类,实现接口,实现打印学生信息,实现打印平均分
        //   --定义一套实现类,实现接口,实现打印学生信息(男女人数),实现打印最高分(去掉最高最低分)
        ClassDataInter cdi = new ClassDataInterImpl1(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
