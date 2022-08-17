/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Acumulador {
    
    public static void main(String[] args) {
            
        Scanner leitor = new Scanner(System.in);
        
         System.out.println("Informe um número:");
         Integer numero = leitor.nextInt();
         Integer soma = 0;
        
        while (numero !=0) {            
          soma = soma + numero;
          System.out.println("Informe um número(para sair digite 0):");
          numero = leitor.nextInt();
          
        }
        
        System.out.println("Soma dos números:");
        System.out.printf("%d",soma);
        
    }   
}
