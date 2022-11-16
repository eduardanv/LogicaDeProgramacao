package com.mycompany.figura;

public class Quadrado extends Figura {

    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: ").append("Quadrado").append("\n");;
        sb.append("Área: ").append(this.calculaArea()).append("\n");;
        return sb.toString();
    }

}
