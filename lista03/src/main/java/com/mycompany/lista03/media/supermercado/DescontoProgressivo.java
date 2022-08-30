package com.mycompany.lista03.media.supermercado;

import java.util.Scanner;

public class DescontoProgressivo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        CalcularDesconto calcular = new CalcularDesconto();

        System.out.println("Bem-vindo ao supermercado!");

        System.out.println("Digite o valor unitário do produto:");
        Double valor = leitor.nextDouble();

        System.out.println("Digite a quantidade:");
        Integer quantidade = leitor.nextInt();

        Double desconto = calcular.calcularDesconto(valor, quantidade);
        calcular.exibirNotaFiscal(desconto, valor, quantidade);
    }
}
