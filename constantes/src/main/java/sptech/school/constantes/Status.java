package sptech.school.constantes;

public enum Status {

    ONLINE("Online",120.0), OFFLINE("Offline",60.0), AUSENTE("Ausente",30.0);

    private final String nome;
    private final Double tempoMax;

    private Status(String nome, Double tempoMax) {
        this.nome = nome;
        this.tempoMax = tempoMax;
    }
    
    public static Status buscarPorTempoMaximo(Double tempoMax){
        for (int i = 0; i < Status.values().length; i++) {
            if (Status.values()[i].getTempoMax().equals(tempoMax)){
                return Status.values()[i];
            }
        }
        throw new IllegalArgumentException("O tempo máximo " + tempoMax + " não existe!");
    }

    public String getNome() {
        return nome;
    }

    public Double getTempoMax() {
        return tempoMax;
    }



}
