package com.mycompany.lista03.media.peso.ideal;

import java.util.Scanner;

public class PesoIdeal {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        CalcularPeso calcular = new CalcularPeso();
        
        Double peso = null;
        System.out.println("Informe seu sexo: 'F' ou 'M'");
        String sexo = leitor.nextLine();
        
        System.out.println("Informe sua altura: (em metros)");
        Double altura = leitor.nextDouble();
        
        calcular.calculaPesoIdeal(sexo, altura, peso);
    }
}
