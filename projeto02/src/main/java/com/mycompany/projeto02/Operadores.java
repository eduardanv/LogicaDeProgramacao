/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Operadores {
    
    public static void main(String[] args) {
        
        
        /*
        == comparar números
        !=
        <
        >
        >=
        <=
        ! negação
        
        .equals(): sempre que o intuito for comparar textos. 
        Serve tbm para os demais tipos;
        */
           
        Integer n1 = 10;
        Integer n2 = 42;
                 
        
        if(n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        }
        
        else if(n1 < n2){
            System.out.println(n1 + " é menor que " + n2);
        }
        
        else{
            System.out.println(n1 + " é igual a " + n2);
        }
        
        Boolean isProfessor = true;
        
        if(!isProfessor){
            System.out.println("É professor");
        }
        
        else{
            System.out.println("Não é professor");
        }
        
        Scanner leitor = new Scanner (System.in);
        
        String nome1 = "Diego";
        
        
        System.out.println("Digite o nome:");
        String nome2 = leitor.nextLine();
        
        if (!nome1.equalsIgnoreCase(nome2)){
            System.out.println("São iguais...");
        }
        
        else{
            System.out.println("É diferente...");
        }
    }
}
