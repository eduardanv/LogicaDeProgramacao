package com.mycompany.consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    public Integer getVagas() {
        return vagas;
    }

    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;
    
     public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList();
    }

    public Boolean existePorNome(String nome) {

        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).getNome().equals(nome)) {
                return true;
            }
        }

        return false;

    }

    public void contratar(Desenvolvedor desenvolvedor) {
        if(this.vagas > 0){
            desenvolvedores.add(desenvolvedor);
            vagas--;
        }
        
        else{
            System.out.println("Sem vagas disponíveis!");
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        Integer quantidade = 0;

        for (int i = 0; i < desenvolvedores.size(); i++) {
            quantidade++;
        }

        return quantidade;
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer quantidade = 0;

        for (Desenvolvedor desenvolvedor : desenvolvedores) {

            if (desenvolvedor instanceof DesenvolvedorMobile) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public Double getTotalSalarios() {
        Double total = 0.0;

        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            total += desenvolvedor.getSalario();
        }
        return total;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        
        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).getNome().equals(nome)) {
                
                return desenvolvedores.get(i);
                
            }
        }
        
        return null;
    }

}
