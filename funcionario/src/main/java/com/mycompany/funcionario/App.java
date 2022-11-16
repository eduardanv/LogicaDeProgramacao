
package com.mycompany.funcionario;


public class App {
    
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        
        Vendedor vendedor = new Vendedor("Ricardo", "1234", 2543.0, 0.5);
        
        Horista horista = new Horista(40, 10.0, "Maria", "12345");
        
        Funcionario funcionario = new Vendedor("Diego", "123456", 234.8, 0.5);

        
//        System.out.println(vendedor.toString());
//        System.out.println(horista.toString());
//        System.out.println(funcionario.toString());
        
        empresa.adicionaFuncionario(funcionario);
        empresa.exibeTodos();
        empresa.exibeTotalSalario();
    }
}
