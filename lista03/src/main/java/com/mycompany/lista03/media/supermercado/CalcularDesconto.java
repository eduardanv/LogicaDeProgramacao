
package com.mycompany.lista03.media.supermercado;

public class CalcularDesconto {
    
        Double calcularDesconto(Double valor, Integer quantidade){
         
        if(quantidade == 1){
            
            return (valor * quantidade) * 0.90;
        }
        else if(quantidade == 2){
            
            return (valor * quantidade) * 0.80;
        }
        
        else{
            return (valor * quantidade) * 0.70;
        }
    }
        
        void exibirNotaFiscal(Double desconto, Double valor, Integer quantidade){
            
            System.out.println("-".repeat(25));
            System.out.println("Valor do Produto: R$" + valor);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("-".repeat(30));
             System.out.println("Valor com Desconto:R$ " + desconto);
        }
}