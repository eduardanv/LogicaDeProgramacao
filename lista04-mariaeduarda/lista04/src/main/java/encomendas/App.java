package encomendas;

public class App {

    public static void main(String[] args) {

        Encomenda compra1 = new Encomenda("Pequeno", "Rua Santos da Glória, 18", "Av Dr. Pedro, 255", 42.2,87.50);
        compra1.calcularFrete("P",42.2, 87.50);
        compra1.emitirEtiqueta();
    }
}
