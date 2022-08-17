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
public class NumerosImpares {
        
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Exibindo todos os números ímpares de 0 a 90");
        
        for (int i = 0; i <= 90; i++) {
            
            if (i % 2 != 0) {
                System.out.println(i);
        }
            
        }
    }
}
