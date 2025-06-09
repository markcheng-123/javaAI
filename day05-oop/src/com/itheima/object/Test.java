package com.itheima.object;

public class Test {
    public static void main(String[] args) {
        //目标,学会创建对象
        //创建对象的格式,类名 对象名 = new 类名();
        Star s1 = new Star();
        s1.name = "刘德华";
        s1.age = 50;
        s1.height = 1.8;
        s1.weight = 70.5;
        s1.country = "中国";

        //创建对象,储存迪丽热巴的信息
        Star s2 = new Star();
        s2.name = "迪丽热巴";
        s2.age = 30;
        s2.height = 1.6;
        s2.weight = 50.5;
        s2.country = "中国";
    }
}
