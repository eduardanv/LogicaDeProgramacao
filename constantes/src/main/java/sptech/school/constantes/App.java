package sptech.school.constantes;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PontosCardeais pc = new PontosCardeais();
        PontosCardeais pc2 = new PontosCardeais();

        System.out.println("Escolha uma direção: \n N - Norte \n S - Sul \n L - Leste \n O - Oeste \n");

        String direcao = in.nextLine();

        switch (direcao) {
            case "N":
                System.out.println("Estou indo para o " + PontosCardeais.NORTE);
                break;
            case "L":
                System.out.println("Estou indo para o " + PontosCardeais.LESTE);
                break;
            case "O":
                System.out.println("Estou indo para o " + pc2.OESTE);
                break;
            default:
                System.out.println("Estou indo para o " + pc.SUL);
                break;
        }
    }
}
