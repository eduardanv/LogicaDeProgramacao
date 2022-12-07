package sptech.school.album.copa;

public enum TipoRaridadeEnum {
    LENDARIA("Lendária", 1000.0), MITICA("Mítica", 300.0), RARA("Rara", 45.0), COMUM("Comum", 2.99);

    String nome;
    Double precoRevenda;

    private TipoRaridadeEnum(String nome, Double precoRevenda) {
        this.nome = nome;
        this.precoRevenda = precoRevenda;
    }
        public String getNome() {
        return nome;
    }

    public Double getPrecoRevenda() {
        return precoRevenda;
    }

    public TipoRaridadeEnum SortearRaridade() {

        return TipoRaridadeEnum.values()[(int)Math.floor (Math.random() * 4)];
    }
}


