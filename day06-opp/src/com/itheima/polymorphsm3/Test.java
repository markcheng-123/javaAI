package com.itheima.polymorphsm3;

public class Test {
    public static void main(String[] args) {
        // 目标:认识多态代码
        //1,多态的好处,右边对象是解耦合的
        Animal a1 = new Tortoise();
        a1.run();
        //a1,shrinkHead();//多态下的一个问题,多态下不能调用子类独有功能

        //强制类型转换
        Tortoise t1 = (Tortoise) a1;
        t1.shrinkHead();

        System.out.println("===================");

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
        //a1,shrinkHead();//报错,多态下不能调用子类独有功能
        //java建议强制转化前,应该判断对象的真实类型,在进行强制转换
        if (a instanceof Wolf) {
            Wolf w1 = (Wolf) a;
            w1.eatSheep();
        }else if (a instanceof Tortoise) {
                Tortoise t1 = (Tortoise) a;
                t1.shrinkHead();
        }
    }
}
