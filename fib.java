package com.practice;

import java.util.Scanner;

public class fib {
    public static int fibo(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        int a = fibo(n-1);
        int b = fibo(n-2);
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
