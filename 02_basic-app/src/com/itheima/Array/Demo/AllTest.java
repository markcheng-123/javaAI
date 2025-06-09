package com.itheima.Array.Demo;

import java.util.Scanner;

public class AllTest {
    //目标:开发一个简单的健康计算器,
    public static void main(String[] args) {
        //先让用户输入自己的身高,体重,年龄,性别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高(m):");
        double height = sc.nextDouble();
        System.out.println("请输入您的体重(kg):");
        double weight = sc.nextDouble();
        System.out.println("请输入您的年龄:");
        int age = sc.nextInt();
        System.out.println("请输入您的性别(m/f):");
        char sex = sc.next().charAt(0);

        double bmi = getBMI(height, weight);
        System.out.println("您的BMI值是:" + bmi);
        double bmr = getBMR(height, weight, age, sex);
        System.out.println("您的基础代谢量是:" + bmr);
        //根据个人信息,计算出用户的BMR值,交给一个独立的方法来计算并返回结果
    }

    public static double getBMI(double height, double weight) {
        return weight / (height * height);
    }

    //根据个人信息,计算出用户的BMI值,交给一个独立的方法来计算并返回结果
    public static double getBMR(double height, double weight, int age, char sex) {
        double bmr = 0;
        if (sex == 'm') {
            bmr = 88.4 + (13.7 * weight + 4.799 * height - 5.677 * age);
        } else {
            bmr = 447.6 + (9.247 * weight + 3.098 * height - 4.330 * age);
        }
        return bmr;
    }
}
