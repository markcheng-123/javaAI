package com.itheima.Array;

public class ArrayTest4 {
    public static void main(String[] args) {
        //目标:完成斗地主的做牌和洗牌的功能
        start();
    }

    public static void start() {
        //1,做牌,创建一个动态初始化的数组存储54张牌
        String[] poker = new String[54];
        //poker[0] = "[null,null,null,...] ";
        //                0     1   2

        //2,准备四种花色,还有点数,再开始做牌存入数组中去,
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //3,遍历点数,再遍历花色
        int index = 0;//定义一个变量记录牌在数组中的索引位置
        for (int i = 0; i < numbers.length; i++) {
            //当前点数,numbers[i]
            for (int j = 0; j < colors.length; j++) {
                //将牌存入数组中去
                poker[index++] = colors[j] + numbers[i];
            }
        }
        //4,将大小王存入数组中去
        poker[index++] = "小王";
        poker[index] = "大王";

        //5,打印出数组
        System.out.println("新牌");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();//换行

        //6,洗牌
        for (int i = 0; i < 100; i++) {
            int index1 = (int)(Math.random()*poker.length);
            int index2 = (int)(Math.random()*poker.length);
            String temp = poker[index1];
            poker[index1] = poker[index2];
            poker[index2] = temp;
        }
        System.out.println("洗牌后的牌");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
    }
}
