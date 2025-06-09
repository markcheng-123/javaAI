package com.itheima.Array.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
//        目标:搞清楚switch分支结构和应用场景,理解执行流程.
        test();
        test2();
    }

    //    1,表达式类型只能是byte,short,char,int,JDK5开始支持枚举,JDk7开始支持String类型.不支持float,double,long类型
    public static void test() {
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("1月");
                break;
            case 2:
                System.out.println("2月");
                break;
            case 3:
        }
        System.out.println("3月");
    }

    //    2,case给出的值不允许重复,且是字面量,不能是变量.
//   正常使用switch的时候,不要忘记break,否则会继续执行下面的代码.实现穿透现象.
    public static void test2() {
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("1月");
            case 2:
                System.out.println("2月");
            case 3:
                System.out.println("3月");
                break;
            default:


                System.out.println("没有这个月");
        }
    }
}
