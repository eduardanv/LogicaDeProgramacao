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
public class SpTech {
    
    public static void main(String[] args) {
            
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu nome de usuário:");
        String login = leitor.nextLine();
        
        System.out.println("Informe sua senha:");
        String senha = leitor.nextLine();
        
             while (!login.equals("admin") || !senha.equals("#SPTech2022")) {            
                System.out.println("Login e/ou senha inválidos. Tente novamente.");
            
                System.out.println("Informe seu nome de usuário:");
                login = leitor.nextLine();

                System.out.println("Informe sua senha:");
                senha = leitor.nextLine();
             }
             
             System.out.println("Login realizado com sucesso!");
        
    }
}
