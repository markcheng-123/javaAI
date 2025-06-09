package com.itheima.polymorphsm3;

public class Wolf extends Animal {
    @Override
    public void run() {
        System.out.println("狼跑的贼快~~~");

    }
    public void eatSheep(){
        System.out.println("狼吃羊~~~");
    }
}
