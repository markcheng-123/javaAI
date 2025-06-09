package com.itheima.Array;

public class ArrayTest5 {
    public static void main(String[] args) {
        //完成数字华融道的初始化和随机乱序
     start(4);
    }
    public static void start(int n){
        //1,定义一个二维数组存储数字华容道
        int[] [] arr = new int[n][n];

        //2,遍历二维数组,给二维数组赋值
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        printArray(arr);
        //3,打乱数字华容道
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //获取随机行和列
                int randomRow = (int) (Math.random() * arr.length);
                int randomCol = (int) (Math.random() * arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = temp;
            }
        }
        System.out.println("----------------");
        printArray(arr);
    }
    public static void printArray(int[][] arr){
        for (int[] row : arr) {
            for (int data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
