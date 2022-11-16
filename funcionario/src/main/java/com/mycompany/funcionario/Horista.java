package com.mycompany.funcionario;

public class Horista extends Funcionario {

    private Integer qtdHora;
    private Double valorHora;

    public Horista(Integer qtdHora, Double valorHora, String cpf, String nome) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario: ").append(super.getNome()).append("\n");;
        sb.append("CPF: ").append(super.getCpf()).append("\n");;
        sb.append("Salário: ").append(this.calcSalario()).append("\n");;
        
        return sb.toString();
    }

}
