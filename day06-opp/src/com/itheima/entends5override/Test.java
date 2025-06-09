package com.itheima.entends5override;

public class Test {
    public static void main(String[] args) {
        //目标:认识方法重写,再搞清楚场景.
        Cat c = new Cat();
        c.eat();
    }
}
class Cat extends Animal{
    //方法重写:方法名称,形参列表必须相同,这个方法就是方法重写
    @Override//方法重写的校验注解(标志),要求方法名称和形参列表必须与被重写方法一致,否则报错!
    public void eat(){
        System.out.println("吃粑粑");
    }
}
class Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
}
//方法重写的注意事项:
//1,子类重写父类方法时,访问权限必须大于或者等于父类该方法的权限(public>protected>default>private)
//2,重写的方法返回类型值,必须与被重写方法的返回值一致,或者范围更小
//3,私有方法,静态方法不能被重写,如果重写会报错.