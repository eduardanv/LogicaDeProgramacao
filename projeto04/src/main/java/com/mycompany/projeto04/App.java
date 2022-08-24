package com.mycompany.projeto04;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
     
//        Utilitaria util = new Utilitaria();
        
          Calculadora calc = new Calculadora();
        
//        util.exibirLinha();
//        System.out.println("Eduarda");
//        util.exibirLinha();
//        System.out.println("Neves");
        
//        util.exibirNome("Eduarda");
        
          Scanner in = new Scanner(System.in);
        
//        System.out.println("Digite seu nome:");
//        String nome = in.nextLine();
//      
//        util.exibirNomeComLinha(nome);        
          System.out.println("Digite um número:");
          Double numero1 = in.nextDouble();
            
          System.out.println("Digite outro número:");
          Double numero2 = in.nextDouble();
          
          //Integer resultadoRetornado = calc.somar(numero1,numero2);
          
          System.out.printf("Resultado: " + calc.somar(numero1,numero2));
          
          
    }   
    
}
