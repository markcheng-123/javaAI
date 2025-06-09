package com.itheima.Array.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        System.out.println("1-10之间的奇数和:" + sum(10));
        //目标:求1-10之间的奇数和,并且把求和结果打出来.
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
