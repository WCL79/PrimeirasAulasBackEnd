package com.catalisa.aula01022021;

import java.util.*;

public class ListaDeAnimais {

    public static void main(String[] args) {
        // Programa que cadastra cada animal de cada zoologico de cada cidade.

        Map<String, List<String>> dicionarioAnimais = new HashMap<>();

        boolean continuar = true;
        while (continuar){
            System.out.println("Digite: \n1 para cadastrar");
            int resposta = new Scanner(System.in).nextInt();

            if(resposta == 1){
                System.out.println("Qual zoologico vc vai CADASTRAR? ");
                String zoologico = new Scanner(System.in).nextLine();
                List<String> animais = new ArrayList<>();
                String retorno = "";
                do{
                    System.out.println("Digite o nome do animal para cadastrar ou sair para finalizar");
                    retorno = new Scanner(System.in).nextLine();
                    if(!retorno.equalsIgnoreCase("sair")){
                        animais.add(retorno);
                    }
                }while (!retorno.equalsIgnoreCase("sair"));

                dicionarioAnimais.put(zoologico, animais);
            }

        }

    }
}