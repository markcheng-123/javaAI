package com.itheima.Array.loop;

public class WhileTest3 {
    public static void main(String[] args) {
        //目标:完成while循环的需求,复利计算
        System.out.println("要" + test() + "年后可以实现本金翻倍");
    }

    //复利计算,本金是10000,年利率是17%,求要多少年才能实现本金翻倍
    public static int test() {
        //定义变量记录程序需要的处理数据,
        double money = 10000;
        double yearRate = 0.017;
        int year = 0;
        //控制循环,只要发现本金没有翻倍,就继续循环
        //注意:不能确定循环次数的时候用while循环.
        while (money < 20000) {
            year++;
            money = money * (1 + yearRate);
        }
        return year;
    }
}
