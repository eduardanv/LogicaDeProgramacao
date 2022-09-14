package com.mycompany.projeto.poo;

public class ExemploConstrutor {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(
        "#001", "Richard");
        
        ContaCorrente contaCorrente2 = new ContaCorrente();
        
        System.out.println("Cheio " + contaCorrente.getTitular());
        System.out.println("Vazio: " + contaCorrente2.getTitular());
    }
}

