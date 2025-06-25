package com.itheima.interface3;

public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;//记住送来的全班学生对象信息
    public ClassDataInterImpl2(Student[] students){
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {

    }

    @Override
    public void printAverageScore() {

    }
}
