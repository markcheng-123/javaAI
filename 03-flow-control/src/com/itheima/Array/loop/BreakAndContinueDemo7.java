package com.itheima.Array.loop;

public class BreakAndContinueDemo7 {
    public static void main(String[] args) {
        test();
        test2();
        //目标:搞清楚break和continue的作用
    }

    public static void test() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("------------------------");
    }

    public static void test2() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
