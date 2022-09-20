
package com.mycompany.lista04.mariaeduarda;

public class App {
    public static void main(String[] args) {
        
       Bolo boloChocolate = new Bolo();
       Bolo boloMorango = new Bolo();
       Bolo boloAbacaxi = new Bolo();
       
        boloChocolate.sabor = "Chocolate";
        boloChocolate.valor = 30.0;
        
        boloMorango.sabor = "Morango";
        boloMorango.valor = 45.0;
        
        boloAbacaxi.sabor = "Abacaxi";
        boloAbacaxi.valor = 36.0;
        
        boloChocolate.setSabor("Chocolate");
        boloChocolate.setValor(30.0);
         
        boloMorango.setSabor("Morango");
        boloMorango.setValor(45.0);
    }
}
