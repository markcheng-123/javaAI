package com.itheima.Array.method;

public class MethodDemo2 {
    public static void main(String[] args) {
//     目标,掌握无返回值的方法单独使用return,提前结束方法.
        div(10, 2);
    }

    //    设计一个除法的功能
    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return;// return结束方法,返回结果
        }
        System.out.println(a / b);
    }
}
