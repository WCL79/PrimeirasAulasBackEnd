package com.catalisa.aula270121;

import java.util.Scanner;

public class MaiorNumComTernario {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Entre com o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();

        int maiorNumero = (num1 < num2)  ? num2 : num1;

        System.out.println("O maior numero é"+maiorNumero);

    }

}