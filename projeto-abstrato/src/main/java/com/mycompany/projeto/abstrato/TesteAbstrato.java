package com.mycompany.projeto.abstrato;

import java.util.ArrayList;
import java.util.List;

public class TesteAbstrato {

    public static void main(String[] args) {

        //Não funciona
        //Aluno alunoLimbo = new Aluno();
        AlunoAds alunoAds = new AlunoAds("Ricardo", "0001", 6.3, 8.9);

        AlunoCco alunoCco = new AlunoCco("0002", "Champs", 7.2, 10.0);

        Aluno teste = new AlunoAds("Breno", "003", 6.54, 7.93);

        List<Aluno> alunos = new ArrayList();
        
        alunos.add(alunoAds);
        alunos.add(alunoCco);
        alunos.add(teste);

    }
}
