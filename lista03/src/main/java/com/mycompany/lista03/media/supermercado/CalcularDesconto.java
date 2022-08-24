
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
        
        Double exibirNotaFiscal(Double valorComDesconto){
            
            
        }
}