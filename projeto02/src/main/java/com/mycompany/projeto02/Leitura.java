package com.mycompany.projeto02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Leitura {

    public static void main(String[] args) {
        
        String nome;
        
        //Não é boa prática deixar o código na horizontal.
        Integer numero1, numero2, numero3;
        Integer numero4;
        
        //  Assistente para captura de dados inseridos na execução
        Scanner leitorTexto= new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        Integer idade = leitorNumerico.nextInt();

        System.out.println("Digite seu nome:");
        nome = leitorTexto.nextLine();
        
        System.out.println("Digite sua altura:");
        Double altura = leitorNumerico.nextDouble();

        System.out.println("Olá " + nome);
        System.out.println("Idade digitada: " + idade);
        System.out.println("Altura digitada: " + altura);
    }
}
