package com.practice;
import java.util.Scanner;
public class Sum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s = n+sum(n-1);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}