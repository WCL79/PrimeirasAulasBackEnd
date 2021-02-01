package com.catalisa;
import java.util.Scanner;
public class ConversorDeMoeda {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double real = 1.00;
        double dolar = 5.33;
        double totalDaCotacao;

        System.out.println("Informe a quantidade em Reais:");
        real = scan.nextDouble();

        System.out.println("O total é:"+(totalDaCotacao = real / dolar));
    }

}
