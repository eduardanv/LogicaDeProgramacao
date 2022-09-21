
package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;


public class TesteFilme {
    
    public static void main(String[] args) {
        
        List<Filme> filmes = new ArrayList();
        
        Filme filme1 = new Filme("Titanic", 1996, "James Cameron");
        
        System.out.println(filme1);
//    
//        System.out.println("Nome: " + filme1.getNome()); 
//        System.out.println("Ano: " + filme1.getAno()); 
//        System.out.println("Diretor: " + filme1.getDiretor()); 
    }
   
}
