package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标:加油站支付小程序
        //1,创建卡片类,以便创建金卡或者银卡对象,封装车主的数据
        //2,定义一个卡片父类,Card,定义金卡和银卡共同的属性和方法
        //3,定义一个金卡类,继承Card,金卡必须重写消费方法(8折优惠),独有功能打印洗车票
        //4,定义一个银卡类,继承Card,银卡必须重写消费方法(9折优惠),
        //5,办一张金卡,创建金卡对象,交给一个独立的业务(支付机)来完成存款,消费
        GoldCard goldCard = new GoldCard("京Q51X98","程博远","15342214937",5000);
        pay(goldCard);
        //6,办一张银卡,创建银卡对象,交给一个独立的业务(支付机)来完成存款,消费
        SliverCard sliverCard = new SliverCard( "鄂A860MM","dilei","18665616520",2000);
        pay(sliverCard);
    }
    //支付机:用一个方法来刷卡,可以接受金卡,也可能接收银卡.
    public static void pay(Card c){
        System.out.println("请刷卡:输入您当前的消费金额:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }
}
