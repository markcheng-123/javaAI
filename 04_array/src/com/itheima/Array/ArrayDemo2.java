package com.itheima.Array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标:掌握数组的另一种定义形式,动态初始化数组
        inputScore(); // You need to call the method to execute it
    }

    //设计一个方法,录入学生的成绩.
    public static void inputScore() {
        //1.你需要一个数组来存储8名学生的成绩
        //动态初始化数组.只确定数组的类型和存储数据的容量,不事先存储具体的数据
        //数据类型[] 数组名 = new 数据类型[长度];
        double[] scores = new double[8];
        //scores = [0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0]
        //           0   1   2   3   4   5   6   7

        //录入8名学生的成绩,存到数组中去
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩:");
            scores[i] = sc.nextDouble();
        }

        //3,遍历数组,统计总分,统计最高分,最低分
        double sum = 0;
        double max = scores[0];
        double min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            sum += score;

            if (score > max) {
                max = score;
            }

            if (score < min) {
                min = score;
            }
        }
        double average = sum / scores.length; // 计算平均分

        System.out.println("总分: " + sum);
        System.out.println("平均分: " + average); // 新增平均分输出
        System.out.println("最高分: " + max);
        System.out.println("最低分: " + min);

        sc.close(); // Don't forget to close the Scanner
    }
}