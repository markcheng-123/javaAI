package com.itheima.interface3;

public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] students;//记住送来的全班学生对象信息
    public ClassDataInterImpl1(Student[] students){
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("打印学生信息如下");
        for(int i = 0;i<students.length;i++){
            Student s = students[i];
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        System.out.println("打印平均分如下");
        double sum = 0;
        for(int i = 0;i<students.length;i++){
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("平均分是"+sum/students.length);
    }
}
