package com.challenges;

import java.util.Scanner;

public class FirstFactorial {

    public static int FirstFactorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        num = fact;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(FirstFactorial(i));


    }
}
