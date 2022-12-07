package sptech.school.pedido;

public enum Acompanhamento {

    BATATA_FRITA(1, 13.50, "Batata frita"), SALADA(2, 5.50, "Salada"), TORTA(3, 7.00, "Torta");

    private final Integer id;
    private final Double preco;
    private final String nome;

    private Acompanhamento(Integer id, Double preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
    
      public static void mostrarOpcoes() {
        int i = 1;

        System.out.println("Escolha uma opção:");
        for (Acompanhamento opcao : Acompanhamento.values()) {
            System.out.println(i + ": " + opcao.toString());
            i++;
        }
    }

    public static Acompanhamento buscarPorId(Integer id) {
        for (int i = 0; i < Acompanhamento.values().length; i++) {
            if (Lanche.values()[i].getId().equals(id)) {
                return Acompanhamento.values()[i];
            }

        }
        throw new IllegalArgumentException("O id " + id + " não existe.");
    }
}

