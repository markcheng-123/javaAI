package com.itheima.Array.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //目标:简易版计算器开发
        //键盘录入两个数字,以及一个运算符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();
        System.out.println("请输入运算符:");
        String operator = sc.next();
        int result = calculate(a, b, operator);
        System.out.println("计算结果为:" + result);
    }

    //2,把这个数据交给独立的计算方法,帮我计算结果并返回给我
    public static int calculate(int a, int b, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("运算符有误!");
        }
        return result;
    }
}
