
package com.mycompany.lista03.media.numeros.primos;

import java.util.Scanner;

public class NumerosPrimos {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        VerificarPrimo verificar = new VerificarPrimo();
        
        System.out.println("Digite o número para verificação: ");
        Integer numero = leitor.nextInt();
        
        
        while(numero > 0)
        {
            verificar.verificarPrimo(numero);
            System.out.println("Digite o número para verificação: ");
            numero = leitor.nextInt();
        }
    }   
}
