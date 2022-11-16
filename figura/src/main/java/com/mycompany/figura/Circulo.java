package com.mycompany.figura;

public class Circulo extends Figura {

    private Double raio;

    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return Math.PI * raio * raio;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: ").append("Circulo").append("\n");;
        sb.append("Área: ").append(this.calculaArea()).append("\n");;
        return sb.toString();
    }
    
    
    
}
