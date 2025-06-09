package com.itheima.Array.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        receive(20, 30);
        receive(70);
        System.out.println(getMax(20, 30, 40));
//        三元运算符
    }

    public static void receive(int a, int b) {

        int max = a > b ? a : b;
        System.out.println("较大值" + max);
    }

    //    需求:判断成绩是否通过或者挂科
    public static void receive(int b) {
        String result = b >= 60 ? "通过" : "挂科";
        System.out.println(result);
    }

    //    需求:求三个整数的最大值返回
    public static int getMax(int a, int b, int c) {
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        return max;
    }
}
