package com.itheima.interface1;

public class Test {
    public static void main(String[] args) {
        //目标:认识接口,搞清楚接口的特点,基本使用
        System.out.println(A.SCHOOL_NAME);
        //注意:接口不能创建对象
        //接口是用来被实现(implements)的,实现接口的类被称为实现类,一个类可以实现多个接口,相当于干爹
    }
}
//C被称为实现类,同时实现了多个接口.
//实现类实现多个接口,必须重写完全部接口的全部抽象方法,否则这个类必须定义成抽象方法.
class C implements B,A{

    @Override
    public void show() {
        System.out.println("C类重写了show方法");
    }

    @Override
    public String go() {
        return "姆巴佩牛逼!";
    }

    @Override
    public void play() {
        System.out.println("C类重写了play方法");

    }
}
