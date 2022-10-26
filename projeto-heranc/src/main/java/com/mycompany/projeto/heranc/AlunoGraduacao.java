package com.mycompany.projeto.heranc;

public class AlunoGraduacao extends Aluno{

    private Double nota3;
    
    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2, Double nota3){
        super(ra, nome, nota1, nota2);
        this.nota3 = nota3;
    }
    
    
    @Override
    public Double calcularMedia(){
        return (super.getNota1() + super.getNota2() + this.nota3) / 3;
    }
}
