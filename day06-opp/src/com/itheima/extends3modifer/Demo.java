package com.itheima.extends3modifer;

import com.itheima.entends2modifier.Fu;

public class Demo {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.publicMethod();//只有public方法可以访问
        //fu.Method();
        //fu.protectedMethod();
        //privateMethod();
    }
}
