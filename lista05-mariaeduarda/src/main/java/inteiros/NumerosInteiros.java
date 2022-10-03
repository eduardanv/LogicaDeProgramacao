package inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosInteiros {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer numeroDigitado = 1;
        Integer soma = 0;

        List<Integer> inteiros = new ArrayList<>();

        while (numeroDigitado != 0) {
            System.out.println("Digite um número inteiro:");
            numeroDigitado = in.nextInt();

            if (numeroDigitado == 0) {
                System.out.println("Fim do programa!");
                break;
            } else {
                inteiros.add(numeroDigitado);
            }
        }

        System.out.println("Números pares:");
        for (int i = 0; i < inteiros.size(); i++) {

            if (inteiros.get(i) % 2 == 0) {
                System.out.println(inteiros.get(i));
            }
        }

        System.out.println("Números ímpares:");
        for (int i = 0; i < inteiros.size(); i++) {
            if ((i % 2) != 0) {
                System.out.println(inteiros.get(i));
            }
        }

        for (int i = 0; i < inteiros.size(); i++) {
            soma += inteiros.get(i);
        }
        System.out.println("Soma dos números:" + soma);

        Integer maiorNumero = inteiros.get(0);
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) > maiorNumero) {
                maiorNumero = inteiros.get(i);
            }
        }

        System.out.println("Maior número da lista: " + maiorNumero);

        Integer menorNumero = inteiros.get(0);
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) < menorNumero) {
                menorNumero = inteiros.get(i);
            }

        }

        System.out.println("Menor número da lista: " + menorNumero);

    }

}
