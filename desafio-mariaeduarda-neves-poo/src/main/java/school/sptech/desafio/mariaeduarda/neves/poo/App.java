package school.sptech.desafio.mariaeduarda.neves.poo;

public class App {

    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador("João", "Auxiliar Adm", 2000.00);

        RecursosHumanos rh = new RecursosHumanos();
        
//        rh.promoverColaborador(colaborador, "Supervisor", 2432.0);
        
        rh.reajustarSalario(colaborador, 50.00);
    }

}
