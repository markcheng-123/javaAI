package com.itheima.interface1;
//接口:使用interface关键字定义的类,接口中的成员都是抽象的
public interface A {
    //JDK 8 之前,接口中只能定义常量和抽象方法
    //1,常量,接口中定义常量可以省略public static final,默认会加上去
    String SCHOOL_NAME = "itheima";
    //public static final String SCHOOL_NAME = "itheima";
    //2,抽象方法,接口中定义抽象方法可以省略public abstract,默认会加上去
    //public abstract void run ();
    void show();
    String go();
}
