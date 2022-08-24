
package com.mycompany.lista03.media;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        CalcularMedia calc = new CalcularMedia();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a 1ª nota:");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a 2ª nota:");
        Double nota2 = leitor.nextDouble();
    
        System.out.printf("Média: " + calc.calcularMedia(nota1,nota2));
    }
}
