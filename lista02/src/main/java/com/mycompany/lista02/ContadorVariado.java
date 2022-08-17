/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

/**
 *
 * @author aluno
 */
public class ContadorVariado {
    
        public static void main(String[] args) {
            
            for (Double i = 0.15; i < 5; i = i + 0.15) {
                String frase = 
                        String.format("Número: %.2f", i);
                
                System.out.println(frase);
            }
    }
}
