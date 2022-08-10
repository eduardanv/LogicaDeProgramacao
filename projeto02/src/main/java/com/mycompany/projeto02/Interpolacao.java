/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto02;

/**
 *
 * @author aluno
 */
public class Interpolacao {
    public static void main(String[] args) {
        
        String nome = "Diego";
        Integer idade = 29;
        Double altura = 1.83;
        
//        System.out.println("\tNome: " + nome + "\n" + "Idade: "
//                + idade + "\n" + "Altura: " + altura);
    
    String frase = 
            String.format("Nome:%s \nIdade:%d \nAltura:%.2f", 
                    nome,idade, altura);
    
        System.out.println(frase);
        
        
        System.out.println(String.format("Nome:%s \nIdade:%d \nAltura:%.2f", 
                    nome,idade, altura));
        
        System.out.printf("Nome:%s \nIdade:%d \nAltura:%.2f", 
                    nome,idade, altura);
        
    }
}
