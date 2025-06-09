package com.itheima.Array.Scanner;

import java.util.Scanner;//导包

public class ScannerDemo1 {
    public static void main(String[] args) {
        printUserInfo(args);

    }

    //    我是一个零基础小白,请你帮我写一下程序,可以让用户键盘输入用户名和年龄,并打印出来
    public static void printUserInfo(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //获取用户输入
        System.out.println("请输入用户名:");
        String name = sc.next();//让程序在这一行暂停,等待用户输入数据,输入数据后,会返回一个字符串,赋值给name变量
        System.out.println("请输入年龄:");

        int age = sc.nextInt();
        //打印
        System.out.println();
    }

}
