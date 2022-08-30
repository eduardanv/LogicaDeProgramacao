package com.mycompany.lista03.media.numeros.primos;

public class VerificarPrimo {

    void verificarPrimo(Integer numero) {

        Integer numerosDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                numerosDivisores++;
            }
        }

        if (numerosDivisores == 2) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }

    }
}
