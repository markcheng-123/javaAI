package com.itheima.Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标:认识数组的定义,使用数组的好处,访问数组元素
        callStudent();
    }
    //我是一名java初学者,请帮我开发一个随机点名的方法,假设有十名学生,
    public static void callStudent(){
        //1.定义一个数组,保存10个学生姓名
        String[] names = {"小王","小李","小张","小赵","小钱","小孙","小李","小王","小王","小王"};

        //2.随机获取一个索引值,通过索引值获取对应的学生姓名
        int index = (int)(Math.random()*10);

        //3.打印学生姓名
        System.out.println(names[index]);
    }
}
