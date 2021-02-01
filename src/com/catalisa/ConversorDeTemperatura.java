package com.catalisa;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {

        double Celsius, Fahrenheit,Reaumur, Rankine;
        System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = entrada.nextDouble();
        Fahrenheit = ( 9 * Celsius + 160 ) / 5;
        Reaumur = (Celsius * 0.8);
        Rankine = (Celsius * 1.8 + 32 + 459.67);

        System.out.print("\n A medida convertida em Fahrenheit:\n" + Fahrenheit + "ºF\n");
        System.out.print("\n A medida convertida em Reaumur:\n" +  Reaumur+ "ºRe\n");
        System.out.print("\n A medida convertida em Rankine:\n" +  Rankine+ "ºRa\n");

    }
}
