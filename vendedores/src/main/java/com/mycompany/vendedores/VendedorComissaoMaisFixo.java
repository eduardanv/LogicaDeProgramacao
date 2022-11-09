package com.mycompany.vendedores;

public class VendedorComissaoMaisFixo extends VendedorComissao {

    private Double salarioFixo = 0.0;

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + salarioFixo;
    }
    
      @Override
    
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Vendedor Comissão: (+ fixo):").append("\n");
        sb.append("\n").append("Código: ").append(getCodigo()).append("\n");
        sb.append("\n").append("Nome:  ").append(getNome()).append("\n");
        sb.append("\n").append("Vendas: R$ ").append(getVendas()).append("\n");
        
        sb.append("Taxa:").append(getTaxa()).append("\n");
        sb.append("Salário: R$").append(this.calcularSalario()).append("\n");
        
        
        return sb.toString();
    }
}
