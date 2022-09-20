
package bolos;


public class Bolo {

    public String sabor;
    public Double valor;
    public Integer qtdVendida = 0;

    public Bolo(String sabor, Double valor, Integer qtdVendida) {
        this.sabor = sabor;
        this.valor = valor;
        this.qtdVendida = qtdVendida;
    }

    public void setSabor(String sabor) {
        if (sabor.equals("Morango") || sabor.equals("Chocolate") || sabor.equals("Abacaxi")) {
            this.sabor = sabor;
        } else {
            System.out.println("Sabor não disponível. Sabores disponíveis: Morango, Chocolate ou Abacaxi.");
        }
    }

    public void setValor(Double valor) {
        if (valor >= 30.0 || valor <= 50.0) {
            this.valor = valor;
        } else {
            System.out.println("Valor inválido. Valor deve estar entre R$30 E R$50.");
        }

    }

    public Integer getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(Integer qtdVendida) {
        if (qtdVendida <= 100) {
            this.qtdVendida = qtdVendida;
        }
        else{
            System.out.println("Quantidade excede a 100.");
        }
    }

    void comprarBolo(Integer qtdBoloComprado) {
        if (qtdBoloComprado > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {
            this.qtdVendida += qtdBoloComprado;
            exibirRelatorio(sabor, qtdVendida, valor);
        }

    }

    void exibirRelatorio(String sabor, Integer qtdVendida,Double valor) {
        Double valorTotal = valor * qtdVendida;
        String frase
                = String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor, qtdVendida, valorTotal);
        System.out.println(frase);
    }

}
