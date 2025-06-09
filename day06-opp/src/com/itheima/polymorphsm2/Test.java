package com.itheima.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        // 目标:认识多态代码
        //1,多态的好处,右边对象是解耦合的
        Animal a1 = new Tortoise();
        a1.run();


        Wolf w = new Wolf();
        go(w);

        Tortoise t = new Tortoise();
        go(t);
    }

    //宠物游戏,所有动物都可以送给这个方法开始跑步.
    //2,父类类型的对象作为参数,可以接收一切子类对象
    public static void go(Animal a) {
        System.out.println("开始");
        a.run();
    }
}
