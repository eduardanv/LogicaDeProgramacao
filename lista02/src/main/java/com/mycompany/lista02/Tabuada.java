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
public class Tabuada {
        
        public static void main(String[] args) {
            
            Scanner leitor = new Scanner(System.in);
            
            System.out.println("Qual tabuada deseja ver?");
            Integer numero = leitor.nextInt();
            System.out.println("Tabuada do: " + numero);
            for (int i = 0; i <= 10; i++) {
                
                System.out.printf(i + "X" + numero + " = ");
                System.out.println(i * numero);
            }
            
    }
}
