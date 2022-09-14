package com.mycompany.projeto.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
//        ContaCorrente conta2 = new ContaCorrente();
//        
//        conta1.numero = "001";
//        conta1.titular = "Brandão";
//        conta1.saldo = 1_000.0;
//        
//        
//        conta2.numero = "002";
//        conta2.titular = "Frizza";
//        conta2.saldo = 50000.0;
//        
//        
//        System.out.println("Número da conta: "+ conta1.numero);
//        System.out.println("Titular 1: " + conta1.titular);
//        System.out.println("Conta 01 " + conta1.saldo);
//        System.out.println("--------".repeat(10));
//        
//        System.out.println("Número da conta: "+ conta2.numero);
//        System.out.println("Titular 2: " + conta2.titular);
//        System.out.println("Conta 02 " + conta2.saldo);
//        Aluno aluno1 = new Aluno();
//
//        aluno1.setRa("#000");
//        aluno1.setNome("Richard");
//        aluno1.setNotaAc1(6.0);
//        aluno1.setNotaAc2(3.0);
//
//        System.out.println("Ra: " + aluno1.getRa());
//        System.out.println("Nome: " + aluno1.getNome());
//        System.out.println("Nota 1: " + aluno1.getNotaAc1());
//        System.out.println("Nota 2: " + aluno1.getNotaAc2());
//
//        Double mediaObtida = aluno1.getNotaAc1();
//
//        mediaObtida = 10.0;
//
//        System.out.println("Nota real: " + aluno1.getNotaAc1());
//        System.out.println("Nota fora do objeto: " + mediaObtida);

          conta1.depositar(90.0);
          System.out.println("Saldo " + conta1.getSaldo());
          
          conta1.sacar(-43.5);
          System.out.println("Saldo " + conta1.getSaldo());
           
    }
}
