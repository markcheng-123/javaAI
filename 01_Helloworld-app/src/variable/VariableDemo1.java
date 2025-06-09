package variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        // 认识变量
        printVariable();
    }

    //定义一个方法,来学习变量的定义
    public static void printVariable() {
        //定义变量:数据类型 变量名称 = 初始值;
        int a = 10;
        System.out.println(a);

        //定义一个小数变量,存储一个学生的Java成绩
        double score = 99.5;
        System.out.println(score);

        //为什么要用变量记住数据呢
        int num = 18;
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);
        System.out.println(num);

        System.out.println("================");
//        需求:钱包微信有15,花了4元,又收到了8元,请实时输出钱包金额,每次金额改变都要输出money
        int money = 15;
        System.out.println(money);
        money = money - 4;
        System.out.println(money);
        money = money + 8;
        System.out.println(money);

        System.out.println("==============");

    }
}
