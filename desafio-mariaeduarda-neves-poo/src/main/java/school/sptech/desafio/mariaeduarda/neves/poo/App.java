
package school.sptech.desafio.mariaeduarda.neves.poo;


public class App {
    
    public static void main(String[] args) {
        
        Colaborador colaborador1 = new Colaborador("João", "Auxiliar Administrativo", 1_254.0);
        
        RecursosHumanos promover = new RecursosHumanos(colaborador1.getNome(),"Gerente", 3_638.8);
        
        RecursosHumanos reajuste = new RecursosHumanos(colaborador1.getNome(),colaborador1.getCargo(), 0.1);
        
//        System.out.println("Nome: " + colaborador1.getNome());
//        System.out.println("Cargo: " + colaborador1.getCargo());
//        System.out.println("Salário: " + colaborador1.getSalario());
        
       
        System.out.println(reajuste.reajustarSalario(colaborador1.getNome(), 0.1));
        System.out.println(promover.promoverColaborador(colaborador1.getNome(),"Gerente", 4_965.0));

    }
}
