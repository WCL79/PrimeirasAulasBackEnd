package com.catalisa.aula270121;

import java.util.Scanner;

public class CadastrarNomesDiversos {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        System.out.println("Qual nome você quer cadastar: Cachorro, Gato ou Praia?");
        String nome = scan.next();

        String nomeObjeto = " ";
        if(nome == "Cahorro" ){
            nomeObjeto.equalsIgnoreCase("cachorro");
        }else if(nome == "Gato"){
            nomeObjeto.equalsIgnoreCase("gato");
        }else if(nome == "Praia"){
            nomeObjeto.equalsIgnoreCase("praia");
        }
        System.out.println("Nome gitado é"+nome);


    }


}
