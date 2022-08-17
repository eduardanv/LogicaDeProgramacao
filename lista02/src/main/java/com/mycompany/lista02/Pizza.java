/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Pizza {
        
        public static void main(String[] args) {
        
            Scanner leitor = new Scanner(System.in);
            
            Integer mussarela = 0;
            Integer calabresa = 0;
            Integer quatroQueijos = 0;
            String saborFavorito;
                
              System.out.println("Digite 5 para votar no sabor mussarela" + "\n" +"Digite 25 para votar no sabor calabresa" + "\n" + 
                    "Digite 50 para votar no sabor quatro queijos.");
                System.out.println("Vote em seu sabor de pizza favorito:");
                
            for (int i = 0; i < 10; i++) {
                
                Integer voto = leitor.nextInt();
                
                switch (voto) {
                    case 5:
                        mussarela++;
                        break;
                    case 25:
                        calabresa++;
                    case 50:
                        quatroQueijos++;
                    default:
                        System.out.println("Voto inválido.");
                    break;
                }
            }
            
                System.out.println("Votos em mussarela: " + mussarela + "\n" + "Votos em calabresa: " + calabresa + "\n" +
                        "Votos em Quatro Queijos: " + "\n" + quatroQueijos);
                System.out.println("Sabor favorito entre os estudantes: " + saborFavorito);
    }
}
