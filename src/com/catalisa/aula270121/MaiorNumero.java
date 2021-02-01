package com.catalisa.aula270121;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Entre com o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número é maior");
        }else if(num1 < num2){
            System.out.println("O segundo número é menor");
        }
    }
}
