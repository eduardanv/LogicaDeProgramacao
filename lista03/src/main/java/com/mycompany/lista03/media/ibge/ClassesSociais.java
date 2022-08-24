
package com.mycompany.lista03.media.ibge;

import java.util.Scanner;

public class ClassesSociais {
    
    public static void main(String[] args) {
        
        CalcularRenda calc =  new CalcularRenda(); 
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe sua renda:");
        
        Double renda = leitor.nextDouble();
        
        Double qtdSalario = calc.calcularRenda(renda);
        
        String frase = calc.retornaClasseSocial(qtdSalario);
        
        System.out.println(frase);
    }
}
