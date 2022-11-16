package com.mycompany.projeto.abstrato;

public class AlunoAds extends Aluno {

    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoAds(String nome, String ra, Double notaContinuada, Double notaIntegrada) {
        super(nome, ra);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public Double getMedia() {

        return (notaContinuada + notaIntegrada) / 2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Aluno: ").append(super.getNome());
        sb.append("RA: ").append(super.getRa());
        sb.append("Nota Continuada: ").append(notaContinuada);
        sb.append("Nota Integrada: ").append(notaIntegrada);
        return sb.toString();
    }

}
