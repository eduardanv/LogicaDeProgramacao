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
public class Sorteio {
    
        public static void main(String[] args) {
            
            Scanner leitor = new Scanner(System.in);
            
            System.out.println("Informe um número de 0 a 100: ");
            
            
            Integer numero = leitor.nextInt();
            Integer numeroGerado = ThreadLocalRandom.current().nextInt(1,100);
            Integer pares = 0;
            Integer impares = 0;
            Integer contador = 0;
            Integer primeiroSorteio = 0;
            Integer primeiraTentativa = 0;
            
            for (int i = 0; i < 200; i++) {
                numeroGerado = ThreadLocalRandom.current().nextInt(1,101);
                System.out.println(numeroGerado);
                contador++;
                
                if(numero == numeroGerado && primeiroSorteio == 0){
                   primeiroSorteio = 1;
                   primeiraTentativa = contador;
                }
                
                if(numeroGerado % 2 == 0){
                    pares++;
                }
                
                else{
                    impares++;
                }
            }
            
            System.out.println("O número foi sorteado pela primeira vez na tentativa " + primeiraTentativa + "\n" +
                    "Quantidade de números pares sorteados: " + pares + "\n" + "Quantidade de números ímpares sorteados: " + impares);
    }
}

