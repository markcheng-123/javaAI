package com.itheima.Array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //目标:完成数组求最值
        int []scores = {15,9000,10000,20000,9588,-5};
        int max = getMax(scores);
        System.out.println("最大值是:"+max);
    }

    //设计一个方法,求数组中的最大值
    public static int getMax(int[] arr) {
        //arr = [15,9000,10000,20000,9588,-5]
        //        0   1     2     3     4   5
        //定义一个变量用于记录最大值
        int max = arr[0];
        //从数组的第二个位置开始遍历
        for (int i = 1; i < arr.length; i++) {
            int data =  arr[i];
            if (data > max){
                max = arr[i];
            }
        }
        //返回最大值
        return max;
    }
}

