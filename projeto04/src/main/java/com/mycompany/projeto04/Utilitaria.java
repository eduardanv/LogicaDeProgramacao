package com.mycompany.projeto04;

public class Utilitaria {
    
    /* 
        Assinatura do método é composta por:
       - tipo de retorno
       - nome do método
       - paramêtros (não se chama paramêtros) -> -> argumentos
    
        nesse caso void indica que o método não possui retorno
    */
    void exibirLinha(){ 
        System.out.println("-".repeat(30));
    }
    
    void exibirNome(String nome){
        System.out.println(String.format("*** %s ###", nome));
    }
    
    // Um método pode invocar outros métodos,
    // da mesma forma que classe, ou até mesmo de outras
    void exibirNomeComLinha(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
}
