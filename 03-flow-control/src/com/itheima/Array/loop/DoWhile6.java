package com.itheima.Array.loop;

public class DoWhile6 {
    public static void main(String[] args) {
        //目标:搞清楚do-while循环的写法,并理解其特点
    }

    public static void test() {
        int i = 1;
        //do-while循环至少会执行一次
        do {
            System.out.println("你好!");
            i++;
        } while (i <= 5);
    }
}
//三种循环的使用
//1,for循环和while循环(先判断后执行),do-while循环(先执行后判断)
//2,for循环和While循环的执行流程是一模一样的,功能上无区别,for能做的while也能做,反之不一定.
//3,使用规范,如果已知循环次数建议使用for循环,如果循环次数不确定建议使用while循环
//其他区别,for循环中,控制循环的变量只在循环中使用,while循环中,控制循环的变量可以在循环后继续使用,