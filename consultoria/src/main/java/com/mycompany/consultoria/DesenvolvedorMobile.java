package com.mycompany.consultoria;

public class DesenvolvedorMobile extends Desenvolvedor {

    private Integer qtdHoraTrabalhada;
    private Double valorHoraTrabalhada;
    private Double salario = 0.0;
    public DesenvolvedorMobile(String nome, Integer qtdHoraTrabalhada, Double valorHoraTrabalhada, Integer qtdHorasTrabalhadas, Double salario) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhada = qtdHoraTrabalhada;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.salario = this.qtdHoraTrabalhada * this.valorHoraTrabalhada;
    }
    
        @Override
        public Double getSalario(){
           Double salarioDevMobile = super.getSalario() + salario;
           
           return salarioDevMobile;
        }
        
        @Override
         public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n").append("Nome:").append(getNome()).append("\n");
        sb.append("\n").append("Horas trabalhadas: ").append(getQtdHorasTrabalhadas()).append("\n");
        sb.append("\n").append("Valor horas trabalhadas: ").append(getValorHoraTrabalhada()).append("\n");
        sb.append("\n").append("Salário: R$ ").append(this.getSalario()).append("\n");
 
        return sb.toString();
    }
}
