package com.itheima.Array.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
//        目标:搞清楚基本的算数运算符
        int a = 10;
        int b = 3;
        print(a, b);
        System.out.println("--------------------------");
        print2();

    }

    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    //    需求,研究+符号做连接符还是运算符
    public static void print2() {
        int a = 5;
        System.out.println("abc" + a);
        System.out.println(a + 5);
        System.out.println("itheima" + a + 'a');
        System.out.println(a + 'a' + "itheima");
    }
}
