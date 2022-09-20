
package empregados;

import java.util.Scanner;


public class TesteEmpregado {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a porcentagem do reajuste:");
        Double porcentagem = in.nextDouble();
        
        Empregado joao = new Empregado ("João","Analista de Sistemas",5400.0);
    
        joao.reajustarSalario(porcentagem);
        
        Empregado maria = new Empregado ("Maria","CEO",6700.0);
        
        maria.reajustarSalario(porcentagem);
    }
}
