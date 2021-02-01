package com.catalisa.aula270121;

import java.util.Scanner;

public class ExerCalcuAula270121 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com a operação (+ - / *): ");
            String operacao = scan.next();

            System.out.println("Entre com o primeiro número:");
            double num1 = scan.nextDouble();

            System.out.println("Entre com o segundo número:");
            double num2 = scan.nextDouble();

            double result = 0;

            if (operacao.equals("+")) {
                result = num1 + num2;
            } else if (operacao.equals("-")) {
                result = num1 - num2;
            } else if (operacao.equals("/")) {
                result = num1 / num2;
            } else if (operacao.equals("*")) {
                result = num1 * num2;
            }
            System.out.println("O resultado é:" + result);
        }

}
