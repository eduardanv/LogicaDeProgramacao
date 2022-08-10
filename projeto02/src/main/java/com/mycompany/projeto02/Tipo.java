package com.mycompany.projeto02;

/**
 *
 * @author aluno
 */
public class Tipo {

    //O método main é o ponto de partida
    public static void main(String[] args) {

        //  Para exibir informações no console, utilizaremos o método println
        //  da Classe System
        //System.out.println("Hello World!");

        /*  Os principais tipos que utilizaremos:
        
            Classes Wrapper
            String: para textos;
            Integer: para números inteiros;
            Double: para números com casas decimais;
            Boolean: para verdadeiro ou falso;
        
         */
        String nome = "Madu";

        Integer idade = 20;

        Double altura = 1.53;

        //is ou has facilita o entedimento do objeto
        Boolean isAluno = true;

        System.out.println(
                "Meu nome é " + nome + " e minha idade é " + idade);
        
        
        String frase = null;
        
        System.out.println(frase);
        
    }
}