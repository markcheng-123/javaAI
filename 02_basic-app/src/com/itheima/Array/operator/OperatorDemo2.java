package com.itheima.Array.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        receive(20);
//        掌握拓展的赋值运算 += -= *= /= %=
    }

    //    需求:收红包
    public static void receive(int b) {
        int a = 100;
        a = a + b;
        System.out.println("收红包成功,剩余金额:" + a);

        byte j = 10;
        byte k = 20;
        j += k; //等于j = (byte)(j+k);
        System.out.println(j);
    }
}
