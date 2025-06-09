package com.itheima.entends1demo;

public class People {
    //父类
    //继承的好处:子类可以拥有父类的属性和方法.冗余代码减少了
    private String name;
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
