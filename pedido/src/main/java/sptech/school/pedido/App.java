package sptech.school.pedido;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String lanche;
        String bebida;
        String acompanhamento;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Monte seu combo:");
        
        Lanche.mostrarOpcoes();
        lanche = in.nextLine();
        
        Bebida.mostrarOpcoes();
        bebida = in.nextLine();
        
        Acompanhamento.mostrarOpcoes();
        acompanhamento = in.nextLine();
        
        switch (lanche) {
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
        
        
        
        Pedido pedido = new Pedido(Lanche.XBACON, Bebida.bebida, Acompanhamento.acompanhamento);
        
   
        System.out.println(pedido);
    }

}
