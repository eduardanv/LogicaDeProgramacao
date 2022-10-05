package com.sptech.atividade.com.testes;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;

    public Hospital(String nome) {
        quantidadeDePagamentos = 0;
        quantidadeDeHoraExtra = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }
    
    
    public void realizarPagamento (Medico medico, Double valorPago, Double horaExtra){
        if(medico != null && valorPago != null){
           
    }

}
