package com.itheima.entends2modifier;

public class Fu {
    //1,private:只能在当前类中访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    //2,缺省:只能在当前类和同一个包下的类中访问
    void Method(){
        System.out.println("Method");
    }

    //3,protected:只能在当前类、同一个包下的类、子类,孙子类中访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    //4,public:可以在当前类、同一个包下的类、子类、任意类中访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu  fu = new Fu();
        fu.privateMethod();
        fu.Method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
