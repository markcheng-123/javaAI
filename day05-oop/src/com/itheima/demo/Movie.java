package com.itheima.demo;

public class Movie {
    private String name;
    private int id;//编号
    private double price;
    private String actor;

    //无参构造方法
    public Movie() {
    }

    //定义一个有参构造方法
    public Movie(String name, int id, double price, String actor) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
