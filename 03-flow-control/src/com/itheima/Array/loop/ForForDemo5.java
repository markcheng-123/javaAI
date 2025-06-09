package com.itheima.Array.loop;

public class ForForDemo5 {
    public static void main(String[] args) {
        test();
        //目标:搞清楚循环套路的流程
    }

    public static void test() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");//print不换行打印
            }
            System.out.println();
        }
    }
}
