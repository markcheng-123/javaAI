package com.itheima.Array.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //掌握方法的定义和调用
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println(result);

        printHelloWorld();

        System.out.println(getCode(4));
    }

    //定义一个方法,求任意两个整数的和并返回
    public static int sum(int a, int b) {
        return a + b;
    }

    //需求:打印3行HelloWorld,不需要参数,也不需要返回值
    //注意:如果方法没有返回值结果,返回值类型必须声明是void,void意思是空
    //void:空,无,无参数,无返回值类型
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //需求三,获取一个指定位数的验证码返回
    //掌握方法的定义格式
    //需要接受数据,接受位数 int len
    //需要返回数据,返回验证码 String
    public static String getCode(int len) {
        String code = "";
        for (int i = 0; i < len; i++) {
            int num = (int) (Math.random() * 10);
            code += num;
        }
        return code;
    }
}

