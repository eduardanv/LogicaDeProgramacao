package sptech.school.pedido;

public class Pedido {

    public static final Double TAXA_TRIBUTO = 0.1;

    private Lanche lanche;
    private Bebida bebida;
    private Acompanhamento acompanhamento;

    public Pedido(Lanche lanche, Bebida bebida, Acompanhamento acompanhamento) {
        this.lanche = lanche;
        this.bebida = bebida;
        this.acompanhamento = acompanhamento;
    }

    public Double getTotal() {
        Double total = 0.0;

        total = bebida.getPreco() + lanche.getPreco() + acompanhamento.getPreco();
        total = total + (total * TAXA_TRIBUTO);

        return total;
    }
}
