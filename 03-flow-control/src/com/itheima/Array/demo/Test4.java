package com.itheima.Array.demo;

public class Test4 {
    public static void main(String[] args) {
        findPrimesInRange(100, 200);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void findPrimesInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i); // 每个素数单独一行输出
                count++;
            }
        }
        System.out.println("素数的总个数: " + count);
    }

}
