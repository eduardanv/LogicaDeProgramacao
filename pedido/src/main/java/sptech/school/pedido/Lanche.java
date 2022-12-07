package sptech.school.pedido;

import java.util.Scanner;

public enum Lanche {
    XBACON(1, 30.0, "X-Bacon"), XBURGUER(2, 20.0, "X-Burguer"), XEGG(3, 15.0, "X-Egg"), XSALADA(4, 17.50, "X-Salada");

    private static Scanner menu = new Scanner(System.in);

    private final Integer id;
    private final Double preco;
    private final String nome;

    private Lanche(Integer id, Double preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public static void mostrarOpcoes() {
        int i = 1;
        System.out.println("Escolha uma opção:");
        for (Lanche opcao : Lanche.values()) {
            System.out.println(i + ": " + opcao.toString());
            i++;
        }
    }

    public static Lanche buscarPorId(Integer id) {
        for (int i = 0; i < Lanche.values().length; i++) {
            if (Lanche.values()[i].getId().equals(id)) {
                return Lanche.values()[i];
            }

        }
        throw new IllegalArgumentException("O id " + id + " não existe.");
    }
}
