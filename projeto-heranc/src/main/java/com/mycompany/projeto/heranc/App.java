
package com.mycompany.projeto.heranc;


public class App {
    
    public static void main(String[] args) {
        
        Aluno aluno =  new Aluno(2, "Limbo", 0.0, 0.0);
        
        Double calcularMediaAlunoLimbo = aluno.calcularMedia();
        
        
        AlunoGraduacao AlunoGraduacao = new AlunoGraduacao(1, "Maria", 10.0, 9.3, 8.5);
        
        Double calcularMediaAlunoGraduacao = AlunoGraduacao.calcularMedia();
        
    }
    
}
