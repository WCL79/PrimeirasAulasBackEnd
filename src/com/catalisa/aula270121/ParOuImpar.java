package com.catalisa.aula270121;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Entre um número:");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("resultado par");
        }else {
            System.out.println("resultado ímpar");
        }

    }
}
