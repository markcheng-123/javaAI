package com.itheima.Array.demo;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        guess();
        //目标:随机生成一个1-100的数字,让用户去猜这个数字是多少,猜大提示过大,
    }
    public static void guess() {
        //得到一个随机数对象
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        //定义一个死循环让用户一直猜,直到用户猜对才结束循环
        Scanner sc = new Scanner(System.in);
        while (true) {
            //让用户输入猜测的数据
            System.out.println("请输入一个1-100的数字:");
           int guess = sc.nextInt();

            //判断用户输入的数据是否正确
            if (guess > number) {
                System.out.println("猜大了!");
            } else if (guess < number) {
                System.out.println("猜小了!");
            } else {
                System.out.println("恭喜你猜对了!");
                break;
            }
        }
    }
}
