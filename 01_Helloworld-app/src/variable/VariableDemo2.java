package variable;


public class VariableDemo2 {
    //目标,掌握8种基本数据类型定义变量
    public static void main(String[] args) {
        printVariable();
    }

    //请帮我设计一个方法,打印出8种基本数据类型的变量
    public static void printVariable() {
        byte b = 127;
        System.out.println(b);
        short s = 32767;
        System.out.println(s);
        int i = 2147483647;
        System.out.println(i);
        long l = 9223372036854775807L;
        System.out.println(l);
        float f = 3.14F;
        System.out.println(f);
        double d = 3.14;
        System.out.println(d);
        char c = 'a';
        System.out.println(c);
        boolean b1 = true;
        System.out.println(b1);
        System.out.println("================");

    }
}
