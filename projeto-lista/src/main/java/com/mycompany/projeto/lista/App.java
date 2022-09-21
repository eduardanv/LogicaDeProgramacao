package com.mycompany.projeto.lista;

public class App {
    
    public static void main(String[] args) {
        
        String[] nomes = new String[3];
        Double[] notas = new Double[100];
        
        nomes[0] = "Diego";
        nomes[1] = "Raíssa";
        nomes[2] = "Giuliana";
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("índice: " + i);
            System.out.println("Nome: " + nomes[i]);
            System.out.println("");
        }
        
    }
}
