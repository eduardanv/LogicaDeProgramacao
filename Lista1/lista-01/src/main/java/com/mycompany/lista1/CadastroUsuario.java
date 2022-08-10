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
public class CadastroUsuario {
    
        public static void main(String[] args) {
        
            Scanner leitorTexto = new Scanner(System.in);
            Scanner leitorNumerico = new Scanner(System.in);
            
            System.out.println("Digite seu login:");
            String login = leitorTexto.nextLine();
            
            System.out.println("Digite sua senha:");
            String senha = leitorTexto.nextLine();
            
            System.out.println("Quantas vezes aceita errar "
                    + "antes do bloqueio de sua senha?");
            Integer vezes = leitorNumerico.nextInt();
            
            String frase = String.format("Seu login é: %s e sua senha é %s. Você tem %d "
                    + "tentativas antes de ser bloqueado.", login, senha, vezes);
            
            System.out.println(frase);
    }
    
}
