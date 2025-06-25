package com.itheima.abstract1;
//一个类继承抽象类,必须重写完集继承的全部抽象方法,否则这个类也必须定义成抽象

public  class B extends A {
    @Override
    public void show() {
        System.out.println("B类重写抽象方法");
    }
}
