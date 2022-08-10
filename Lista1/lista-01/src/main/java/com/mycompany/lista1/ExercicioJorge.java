/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExercicioJorge {

    public static void main(String[] args) {

        Scanner leitorMinutos = new Scanner(System.in);

        System.out.println("Digite o tempo, em minutos, que você se aqueceu:");
        Integer tempoAquecimento = leitorMinutos.nextInt();

        System.out.println("Digite o tempo, em minutos, que você fez exercícios aeróbicos:");
        Integer tempoAerobico = leitorMinutos.nextInt();

        System.out.println("Digite o tempo, em minutos, que você fez exercícios "
                + "de musculação:");
        Integer tempoMusculacao = leitorMinutos.nextInt();

        Integer totalMinuto = tempoAquecimento + tempoAerobico + tempoMusculacao;
        Integer totalCaloria = (tempoAquecimento * 12) + (tempoAerobico * 20) + (tempoMusculacao * 25);

        String frase = String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e "
                + "perdeu cerca de %d calorias.", totalMinuto, totalCaloria);
        
        System.out.println(frase);
    }
}
