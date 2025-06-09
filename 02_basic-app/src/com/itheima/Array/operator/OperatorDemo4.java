package com.itheima.Array.operator;

public class OperatorDemo4 {

    public static void main(String[] args) {
        System.out.println(isMatch(180, 18, '女'));
        System.out.println(isMatch2(180, 18));
    }

    //    需求,判断某个人的条件是否满足择偶条件,如果满足返回True,如果不满足返回False
//    条件是:身高高于179、年龄在18之间、性别为女
//    &运算符:要求前后条件都满足,返回true
    public static boolean isMatch(int height, int age, char sex) {
        boolean result = height > 179 & age >= 18 & sex == '女';
        return result;
    }

    //    找一个男朋友,要求是身高要么高于180cm,要么收入大于400000,
//    |只要前后条件满足一个就可以
    public static boolean isMatch2(int height, int income) {
        boolean result = height >= 180 | income > 400000;
        return result;
    }
}

