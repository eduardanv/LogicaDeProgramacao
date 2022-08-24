
package com.mycompany.lista03.media.supermercado;

import java.util.Scanner;


public class DescontoProgressivo {
    public static void main(String[] args) {
        
        CalcularDesconto calcular = new CalcularDesconto();
        
        System.out.println("Bem-vindo ao supermercado!");
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor unitário do produto:");
        
        Double valorUnitario = leitor.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Double quantidade = leitor.nextDouble();
        
        
        calcular.calcularDesconto()
    }
}
