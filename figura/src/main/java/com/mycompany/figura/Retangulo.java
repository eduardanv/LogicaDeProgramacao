package com.mycompany.figura;

public class Retangulo extends Figura {

    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: ").append("Retangulo").append("\n");;
        sb.append("Área: ").append(this.calculaArea()).append("\n");;
        return sb.toString();
    }

}
