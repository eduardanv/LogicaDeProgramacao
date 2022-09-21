
package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NovoLaco {
    
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        List<String> filmes = new ArrayList<>();
        
        System.out.println("Digite um filme 01: ");
        filmes.add(in.nextLine());
        
        System.out.println("Digite um filme 02: ");
        String filmeDigitado = in.nextLine();
        filmes.add(filmeDigitado);
        
        System.out.println("Titanic");
        
        System.out.println(filmes);
        
        
        //For aprimorado - Enhanced for
        //Para cada filme do tipo string contido dentro da listagem de filmes, faça o que está
        //dentro das chaves
        for (String filme : filmes) {
            System.out.println("Nome: " + filme);
            System.out.println("");
        }
        //Iterator
        
        filmes.forEach(filmeAtual -> {
            System.out.println("Nome: " + filmeAtual);
            System.out.println("");
        });
    }
}
