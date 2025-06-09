package com.itheima.entends2modifier;

public class Test {
    public static void main(String[] args) {
        //目标:认识四种权限修饰符范围
        Fu fu = new Fu();
        fu.publicMethod();
        fu.protectedMethod();
        fu.Method();
        //fu.privateMethod();//私有的只能在本类中访问
    }
}
