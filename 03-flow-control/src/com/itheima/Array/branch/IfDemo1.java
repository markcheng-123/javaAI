package com.itheima.Array.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
//        目标,认识if语句,搞清楚其写法和应用场景,(独立功能,独立成方法)
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int age = 20;
        if (age > 18) {
            System.out.println("可以上网");
        }
    }

    //    需求:假如你的钱包的金额是100元,现在要转出去50元,请用if分支实现
//    钱够就显示转账成功,不够就显示余额不足
    public static void test2() {
        int money = 100;
        if (money >= 50) {
            System.out.println("转账成功");
        } else {
            System.out.println("余额不足");
        }
    }

    public static void test3() {
        System.out.println("请录入你的的分数,并查看您本月的绩效等级:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}


