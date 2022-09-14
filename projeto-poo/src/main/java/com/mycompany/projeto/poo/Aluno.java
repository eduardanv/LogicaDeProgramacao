package com.mycompany.projeto.poo;

public class Aluno {
    
    /*
        Modificadores de acesso:
        default
        private 
        public
        protected
    */
    
    
    //Atributos
    private String ra;
    private String nome;
    private Double notaAc1 = 100.0;
    private Double notaAc2 = -100.0;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaAc1() {
        return notaAc1;
    }

    public void setNotaAc1(Double notaAc1) {
        
        if(isNotaValida((notaAc1))){
            this.notaAc1 = notaAc1;     
        }
    }

    public Double getNotaAc2() {
        return notaAc2;
    }

    public void setNotaAc2(Double notaAc2) {
        if(isNotaValida((notaAc2))){
          this.notaAc2 = notaAc2;   
        }
      
    }
    
    
    //Comportamento -> Métodos
    Double obterMedia(){
        return (notaAc1 + notaAc2) / 2;
    }
    
    private Boolean isNotaValida(Double nota){
        return nota >=0.0 && nota <= 10.0;
    }
}
