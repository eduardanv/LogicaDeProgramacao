package com.mycompany.projeto.abstrato;

public class TesteCalculadora {

    public static void main(String[] args) {

        Integer resultado = Calculadora.somar(2, 2);

        teste();

    }

    public static void teste() {
        System.out.println("Você testou!");
    }
}
