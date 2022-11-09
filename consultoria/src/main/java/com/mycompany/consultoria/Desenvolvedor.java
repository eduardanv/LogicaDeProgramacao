package com.mycompany.consultoria;

public class Desenvolvedor {

    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada = 0.0;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getSalario(){
        
        Double salario = qtdHorasTrabalhadas * valorHoraTrabalhada;
        
        return salario;
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Nome:").append(nome).append("\n");
        sb.append("\n").append("Horas trabalhadas: ").append(qtdHorasTrabalhadas).append("\n");
        sb.append("\n").append("Valor horas trabalhadas: ").append(valorHoraTrabalhada).append("\n");
        sb.append("\n").append("Salário: R$ ").append(getSalario()).append("\n");
 
        return sb.toString();
    }

}
