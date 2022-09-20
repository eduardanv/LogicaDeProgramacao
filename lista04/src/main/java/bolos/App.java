
package bolos;

public class App {
    public static void main(String[] args) {
        
       Bolo boloMorango = new Bolo("Morango", 45.00, 0);
       Bolo boloChocolate = new Bolo("Chocolate", 30.00, 0);
       Bolo boloAbacaxi = new Bolo ("Abacaxi", 35.00, 0);
       
       boloMorango.comprarBolo(20);
       boloChocolate.comprarBolo(34);
       boloAbacaxi.comprarBolo(10);
    }
}

