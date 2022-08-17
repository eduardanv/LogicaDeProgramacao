/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

/**
 *
 * @author aluno
 */
public class NumerosPares {
    
    public static void main(String[] args) {
        
        System.out.println("Exibindo todos os números ímpares de 0 a 90");
        
        Integer i = 0;
        while (i <=40) {
            i++;
            if(i % 2 == 0){
                System.out.println(i);
            }
         
        }
    }
}
