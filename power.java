package com.practice;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class power {
    public static int power(int x , int n){
        if(x == 0){
            return 0;
        } else if (n == 0) {
            return 1;
        }
       int y = power(x,n-1) * x;
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X:");
        int x = sc.nextInt();
        System.out.print("Enter the value of power:");
        int n = sc.nextInt();
        System.out.print(power(x, n));

    }
}
