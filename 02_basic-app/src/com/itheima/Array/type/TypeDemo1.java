package com.itheima.Array.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        byte a = 127;
        print(a);
        print2(a);

        System.out.println("------------------------");

        int i = 10;
        //print3(i);//类型范围大的变量不能赋给类型范围小的变量,会报错

        //强制类型的转换,告诉编译器,我确定类型范围大的变量,可以赋给类型范围小的变量,类型 变量2 = (类型)变量1;
        byte j = (byte) i;
        print3(j);
    }

    public static void print(int b) {
        System.out.println(b);

    }

    public static void print2(double c) {

        System.out.println(c);
    }


    public static void print3(byte j) {
        System.out.println(j);
    }
}
