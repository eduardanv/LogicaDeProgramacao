package com.mycompany.lista1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class PaisQuisto {
    
        public static void main(String[] args) {
        
            Scanner leitorNumerico = new Scanner(System.in);
            
            System.out.println("Quantos filhos de 0 a 3 anos você possui?");
            Integer filhos1 = leitorNumerico.nextInt();
            
            System.out.println("Quantos filhos de 4 a 16 anos você possui?");
            Integer filhos2 = leitorNumerico.nextInt();
            
            System.out.println("Quantos filhos de 17 a 18 anos você possui?");
            Integer filhos3 = leitorNumerico.nextInt();
            
            Double total = (filhos1 * 25.12) + (filhos2 * 15.88) + (filhos3 * 12.44);
            Integer totalFilhos = filhos1 + filhos2 + filhos3;
          
            String frase = String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",
                    totalFilhos, total);
            
            System.out.println(frase);
            
    }
}
