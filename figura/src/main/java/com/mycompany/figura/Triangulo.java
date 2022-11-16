package com.mycompany.figura;

public class Triangulo extends Figura {

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: ").append("Triângulo").append("\n");;
        sb.append("Área: ").append(this.calculaArea()).append("\n");;
        return sb.toString();
    }

}
