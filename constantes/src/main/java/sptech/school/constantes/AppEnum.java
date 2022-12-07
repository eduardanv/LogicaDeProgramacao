package sptech.school.constantes;


public class AppEnum {
    public static void main(String[] args) {
//        System.out.println(Status.ONLINE.getTempoMax());
//        System.out.println(Status.AUSENTE.getTempoMax());
//        System.out.println(Status.OFFLINE.getTempoMax());
//        
//        System.out.println(Status.valueOf("ONLINE"));
//        System.out.println(Status.values().length);
//        
//        for (Status status : Status.values()) {
//            System.out.println(status);
//        }
        
        System.out.println(Status.buscarPorTempoMaximo(120.0));
    }
}
