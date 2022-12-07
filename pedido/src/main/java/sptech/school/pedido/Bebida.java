package sptech.school.pedido;

public enum Bebida {
    REFRIGERANTE(1, 5.0, "Refrigerante"), AGUA(2, 1.0, "Água"), LEITE(3, 2.50, "Leite"), SUCO_LARANJA(4, 3.0, "Suco de laranja"), SUCO_UVA(5, 3.0, "Suco de uva");

    private final Integer id;
    private final Double preco;
    private final String nome;

    private Bebida(Integer id, Double preco, String nome) {
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
        for (Bebida opcao : Bebida.values()) {
            System.out.println(i + ": " + opcao.toString());
            i++;
        }
    }

    public static Bebida buscarPorId(Integer id) {
        for (int i = 0; i < Lanche.values().length; i++) {
            if (Bebida.values()[i].getId().equals(id)) {
                return Bebida.values()[i];
            }

        }
        throw new IllegalArgumentException("O id " + id + " não existe.");
    }
}

