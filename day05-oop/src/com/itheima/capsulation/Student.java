package com.itheima.capsulation;

public class Student {
    String name;
    //如何隐藏,使用private关键字(私有,隐藏)修饰成员变量,就只能在本类中直接访问了
    //其他任何地方不能直接访问.
    private int age;
    private double chinese;
    private double math;

    //2,如何暴露,使用public修饰(公开)的get和set方法合理暴露.
    //成员变量的取值和赋值
    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("请输入正确的年龄");
        }
    }

    public int getAge() {
        return age;
    }

    public void setChinese(double chinese) {
        if (chinese >= 0 && chinese <= 100) {
            this.chinese = chinese;
        } else {
            System.out.println("请输入正确的成绩");
        }
    }

    public double getChinese() {
        return chinese;
    }

    public void setMath(double math) {
        if (math >= 0 && math <= 100) {
            this.math = math;
        } else {
            System.out.println("请输入正确的成绩");
        }
    }

    public double getMath() {
        return math;
    }
}
