package com.itheima.Array.branch;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
//    目标:搞清楚switch分支结构和应用场景,理解执行流程.
        test();
    }

    //    需求:输入相对应的季节,然后推荐对应季节的优美诗句
    public static void test() {
//        用户选择一个自己喜欢的季节
        System.out.println("请输入季节:");
        Scanner sc = new Scanner(System.in);
        String season = sc.next();
//        根据喜欢的季节,判断该季节的优美诗句
        switch (season) {
            case "春":
                System.out.println("春眠不觉晓，处处闻啼鸟。");
                break;
            case "夏":
                System.out.println("夏日不候，春去秋来。");
                break;
            case "秋":
                System.out.println("秋分之日，胜过春望之月。");
                break;
            case "冬":
                System.out.println("冬去春来，江水共洗。");
                break;
            default:
                System.out.println("季节输入有误!");
        }
    }
}
