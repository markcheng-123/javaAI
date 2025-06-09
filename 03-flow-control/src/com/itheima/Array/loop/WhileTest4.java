package com.itheima.Array.loop;

public class WhileTest4 {
    public static void main(String[] args) {
        System.out.println("需要折" + test() + "次");
        //需求:珠穆朗玛峰高度是8848860,纸张的厚度是0.1,折多少次才可以到达山峰.
    }

    public static int test() {
        double height = 8848860;
        double thickness = 0.1;
        int count = 0;
        while (thickness < height) {
            count++;
            thickness *= 2;
        }
        return count;
    }
}
