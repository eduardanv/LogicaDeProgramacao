package com.mycompany.lista04.mariaeduarda;

import java.util.Scanner;

public class Bolo {

    Scanner in = new Scanner(System.in);

    public String sabor;
    public Double valor;
    public Integer qtdVendida = 0;

    void comprarBolo(Integer qtdBoloComprado) {
        if (qtdBoloComprado > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }
        
        else{
            qtdVendida += qtdBoloComprado;
        }

    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
     
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    void exibirRelatorio(){
        String frase = 
            String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor, qtdVendida,valor);
         System.out.println(frase);
        
    }

}
