package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public void add(Integer valor) {

        if (valor != null) {
            inteiros.add(valor);
        }

    }

    public void remove(Integer valor) {

        if (valor != null) {
            inteiros.remove(valor);
        }
    }

    public Integer count() {
        Integer contador = 0;
        for (Integer i : inteiros) {
            contador++;
        }

        return contador;
    }

    public Integer countPares() {
        Integer pares = 0;
        for (Integer i : inteiros) {
            if (i % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public Integer countImpares() {
        Integer impares = 0;
        for (Integer i : inteiros) {
            if (i % 2 != 0) {
                impares++;
            }
        }

        return impares;
    }

    public Integer somar() {
        Integer soma = 0;
        for (Integer i : inteiros) {
            soma += i;
        }

        return soma;
    }

    public Integer getMaior() {
        Integer maiorNumero = 0;
        for (Integer i : inteiros) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }

    public Integer getMenor() {
        Integer menorNumero = 0;
        for (Integer i : inteiros) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        return menorNumero;
    }

    public Boolean hasDuplicidade() {
        for (Integer inteiro : inteiros) {
            Integer contador = 0;
            for (int i = 0; i < inteiros.size(); i++) {
                if (contador >= 1 || contador == 0) {
                    if (inteiro.equals(inteiros.get(i))) {
                        contador++;
                    }
                }
                if(contador > 1){
                    return true;
                }
            }

        }

        return false;
    }
}
