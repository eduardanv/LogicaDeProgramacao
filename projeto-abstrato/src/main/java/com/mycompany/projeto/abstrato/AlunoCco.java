package com.mycompany.projeto.abstrato;


public class AlunoCco extends Aluno {
    
    private Double notaIntegrada;
    private Double notaMonografia;
    
     public AlunoCco(String ra, String nome, 
             Double notaIntegrada, Double notaMonografia) {
         
        super(nome, ra);
        this.notaIntegrada = notaIntegrada;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double getMedia() {
        return (notaIntegrada * 0.4) + (notaMonografia * 0.6);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Aluno: ").append(super.getNome());
        sb.append("RA: ").append(super.getRa());
        sb.append("Nota Monografia: ").append(notaMonografia);
        sb.append("Nota Integrada: ").append(notaIntegrada);
        return sb.toString();
    }
}
