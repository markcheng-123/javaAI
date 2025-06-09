package com.itheima.extends6constructor;

public class Test {
    public static void main(String[] args) {
        //目标:认识子类构造器的特点,再看应用场景
        //子类构造器都会先调用父类的无参构造器,在执行自己的构造器
        Zi z = new Zi();
    }
}
class Zi extends Fu {
    public  Zi(){
        System.out.println("子类构造器执行了");
    }

}

class Fu {
    public Fu() {
        System.out.println("父类构造器执行了");
    }
}
