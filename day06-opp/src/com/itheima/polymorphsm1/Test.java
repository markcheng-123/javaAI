package com.itheima.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        // 目标:认识多态
        //1,对象多态,行为多态
        Animal animal = new Wolf();
        animal.run();//编译看左边(去找Animal里面的run),运行看右边(找狼里面的run进行输出)
        System.out.println(animal.name);//成员变量,编译看左边,运行也看左边(都是找的Animal里面的动物)

        Animal animal2 = new Tortoise();
        animal2.run();//编译看左边(去找Animal里面的run,没有找到run是会报错的),运行看右边
        System.out.println(animal2.name);//成员变量,编译看左边,运行也看左边(都是找的Animal里面的动物)
    }
}
