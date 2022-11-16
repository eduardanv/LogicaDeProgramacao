package com.mycompany.funcionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList();
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
    
    public void exibeTodos(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }
    
    public void exibeTotalSalario(){
        Double total = 0.0;
        
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcSalario();
        }
        System.out.println(total);
        
    }
}
