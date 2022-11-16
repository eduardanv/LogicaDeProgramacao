package com.mycompany.funcionario;

public class Vendedor extends Funcionario {

    private Double vendas;
    private Double taxa;

    public Vendedor(String nome, String cpf, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return vendas * (taxa /100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario: ").append(super.getNome());
        sb.append("CPF: ").append(super.getCpf());
        sb.append("Vendas: ").append(vendas);
        sb.append("Taxa: ").append(taxa);
        sb.append("Salário: ").append(this.calcSalario());
        
        return sb.toString();
    }

}
