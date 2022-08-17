/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class Loteria {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número de 0 a 10:");
        
        Integer numero = leitor.nextInt();
        Integer numeroGerado = ThreadLocalRandom.current().nextInt(0,10);
        Integer i = 1;
        
        while (numeroGerado != numero) {  
          i++;
          System.out.println("Numero gerado: " + numeroGerado);  
          numeroGerado = ThreadLocalRandom.current().nextInt(0,10);
          
        }
        System.out.println("Numero gerado: " + numeroGerado);  
        System.out.println("Acertou na " + i +"ª rodada!!");
        if (i <=3) {
            System.out.println("Você é MUITO sortudo!!!!");
        } else if (i >=4 && i <= 10) {
            System.out.println("Você é sortudo!");  
        } else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
    }
}
    

