package com.itheima.extends6constructor;

public class Test2 {
    public static void main(String[] args) {
        //目标:子类构造器调用父类构造器的应用场景
        Teacher t =new Teacher("dlei","java",'男');
        System.out.println(t.getSkill());
        System.out.println(t.getName());
        System.out.println(t.getSex());
    }
}
