package com.catalisa.aula280121;

import java.util.*;

public class Mapa {
    public static void main(String[] args) {

        Map<String, Integer> contasDois1 = new TreeMap<>();
        contasDois1.put("vinicius", 856);
        contasDois1.put("camila", 123);

        System.out.println(contasDois1);
        Map<String, Integer> contas = new HashMap<>();
        contas.put("camila", 134);
        contas.put("vinicius", 865);

        System.out.println("Hasmap" + contas);

        Map<String, Integer> contasDois = new TreeMap<>();
        contasDois.put("vinicius", 856);
        contasDois.put("camila", 123);

        System.out.println("TreeMap "+contasDois);

    }

}
