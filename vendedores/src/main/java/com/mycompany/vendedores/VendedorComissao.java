package com.mycompany.vendedores;

public class VendedorComissao {
    
    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double calcularSalario() {
        return vendas *  (taxa/100.0);
    }
    
    @Override
    
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Vendedor Comissão: ").append("\n");
        sb.append("\n").append("Código: ").append(codigo).append("\n");
        sb.append("\n").append("Nome:  ").append(nome).append("\n");
        sb.append("\n").append("Vendas: R$ ").append(vendas).append("\n");
        
        sb.append("Taxa:").append(taxa).append("\n");
        sb.append("Salário: R$").append(this.calcularSalario()).append("\n");
        
        
        return sb.toString();
    }
}
