
package com.mycompany.lista03.media.ibge;


public class CalcularRenda {
    
    Double calcularRenda(Double renda){
    
       
       return renda / 1.045;
    }
    
    String retornaClasseSocial(Double qtdSalario){
         
        if(qtdSalario <= 2){
            return "Você ganha entre 1 e 2 salários mínimos \n Você pertence a classe social E.";
        }else if(qtdSalario >2 && qtdSalario <= 4){
             return "Você ganha entre 2 e 4 salários mínimos \n Você pertence a classe social D.";
        }else if(qtdSalario >4 && qtdSalario <= 10){
             return "Você ganha entre 4 e 10 salários mínimos \n Você pertence a classe social C.";
        }else if(qtdSalario >10 && qtdSalario <= 20){
             return "Você ganha entre 10 e 20 salários mínimos \n Você pertence a classe social B.";
        }else{
             return "Você ganha entre 2 e 4 salários mínimos \n Você pertence a classe social A.";
        }
    }
      
}
