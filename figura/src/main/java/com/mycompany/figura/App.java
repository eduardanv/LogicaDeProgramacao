package com.mycompany.figura;

public class App {

    public static void main(String[] args) {
        Imagem img = new Imagem();

        Quadrado quadrado = new Quadrado(2.6, "Rosa", 2);

        Retangulo retangulo = new Retangulo(2.5, 2.4, "Verde", 1);

        Triangulo triangulo = new Triangulo(1.5, 3.1, "Amarelo", 3);

        Circulo circulo = new Circulo(2.5, "Branco", 4);

        img.adicionaFigura(circulo);
        img.adicionaFigura(retangulo);
        img.adicionaFigura(triangulo);
        img.adicionaFigura(quadrado);
        
        img.exibeFiguras();
        img.exibeFiguraAreaMaior20();
        img.exibeQuadrado();
        img.exibeSomaArea();
    }

}
