package com.itheima.Array.HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        // 输出HelloWorld
        System.out.println("HelloWorld");

        // 调用add方法
        int sum = add(10,20);
        System.out.println(sum);
    }
    //    我要求任意两个整数的和
    public static int add(int a,int b){
        return a+b;
    }
}