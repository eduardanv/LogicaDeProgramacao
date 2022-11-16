package com.mycompany.figura;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList();;
    }

    public void adicionaFigura(Figura f) {
        figuras.add(f);
    }

    public void exibeFiguras() {
        for (Figura figura : figuras) {
            System.out.println(figura);
        }
    }

    public void exibeSomaArea() {

        Double totalArea = 0.0;
        for (Figura figura : figuras) {
            totalArea += figura.calculaArea();
        }

        System.out.println(totalArea);
    }

    public void exibeFiguraAreaMaior20() {

        for (Figura figura : figuras) {
            if (figura.calculaArea() > 20) {
                System.out.println(figura);
            }
        }
    }

    public void exibeQuadrado() {
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                System.out.println(figura);
            }
        }

    }
}
