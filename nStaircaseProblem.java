package com.practice;

import java.util.Scanner;

public class nStaircaseProblem {
    public static int count(int n){
        if(n==1){
            return 1;
        } else if (n==2) {
            return 2;
        }
        return count(n-1)+count(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));
    }
}
