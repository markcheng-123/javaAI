package com.itheima.javabean;

//实体类
public class Student {
    //1,私有成员变量
    private String name;
    private double chinese;//语文成绩
    private double math;//数学成绩

    //必须提供无参数的构造器,因为创建完有参数的构造器后,无参数的构造器会丢失
    public Student() {
    }

    //提供一个有参数的构造器
    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    //提供公开的setter和getter方法
    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
