package com.itheima.extends4feature;

public class Test2 {
    public static void main(String[] args) {
        //目标2:继承后子类访问的特点,就近原则.
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu {
    String name = "fu的name";

    public void run() {
        System.out.println("Fu类run的方法");
    }
}

class Zi extends Fu {
    String name = "zi的name";

    public void show() {
        String name = "zi的name";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        run();

    }
}
