package com.mycompany.funcionario;

public abstract class Funcionario {


    private String cpf;
    private String nome;

    public Funcionario(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract Double calcSalario();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario: ").append(nome).append("\n");;
        sb.append("CPF: ").append(cpf).append("\n");;
        return sb.toString();
    }
}
