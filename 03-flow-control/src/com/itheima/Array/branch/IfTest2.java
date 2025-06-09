package com.itheima.Array.branch;

public class IfTest2 {
    public static void main(String[] args) {
//        目标:完成自动驾驶汽车程序的书写,以便可以根据红绿灯状态正确行驶.
        test();

    }

    public static void test() {
//        假设现在摄像头获取了三种灯的信息状态如下
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        if (red) {
            System.out.println("红灯停");
        } else if (yellow) {
            System.out.println("黄灯等");
        } else if (green) {
            System.out.println("绿灯行");
        } else {
            System.out.println("请检查红绿灯");
        }
    }
}
