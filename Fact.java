package com.practice;
import java.util.Scanner;

public class Fact {
    public static int fact(int n){
        if (n == 1 || n == 0 ){
            return 1;
       }
        int y = n * fact(n-1);
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));

    }
}
