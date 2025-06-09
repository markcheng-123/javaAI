package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Card {
    public Card(){}
    private String cardId;//车牌号码
    private String cardName;//车主姓名
    private String phone;//电话号码
    private Double money;//余额
    public Card(String cardId, String cardName, String phone, double money) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.phone = phone;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    //预存金额
    public void deposit(double money){
        this.money += money;
    }
    //消费金额
    public void consume(double money){
        this.money -= money;
    }
}
