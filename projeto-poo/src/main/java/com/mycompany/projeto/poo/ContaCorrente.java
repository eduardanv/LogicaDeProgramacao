package com.mycompany.projeto.poo;

//Uma classe é como uma folha em branco
public class ContaCorrente {

    //Atributos de instância - Usaremos essa estratégia 
    //Existe também atributo de classe - X
    private Double saldo = 0.0;
    private String titular;
    private String numero;

    public ContaCorrente(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        
        
    }
    
    //Colocar "Default"
    public ContaCorrente(){
        
    }

//    public Double getSaldo() {
//        return saldo;
//    }
//
//    public void depositar(Double saldo) {
//        if(saldo > 0 ){
//            this.saldo += saldo;
//        }else{
//            System.out.println("Valor inválido para saque!");
//        }
//    }
//    
//    public void sacar(Double saldo) {
//        if(saldo > 0 && saldo <= this.saldo){
//        this.saldo -= saldo;
//        }else{
//            System.out.println("Valor inválido para saque!");
//        }
//    }
//
    public String getTitular() {
        return titular;
    }
//
//    public void setTitular(String titular) {
//        this.titular = titular;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }
//    

//    public ContaCorrente() {
//    }
    
}
