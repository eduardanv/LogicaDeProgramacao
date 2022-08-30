
package com.mycompany.lista03.media.peso.ideal;

public class CalcularPeso {
    
   void calculaPesoIdeal(String sexo, Double altura, Double peso){
       
       if(sexo.equals ("F")){
           
          peso = (62.1 * altura) - 44.7;
       }
       
       else if(sexo.equals("M")){
           
          peso = (72.7 * altura) - 58;
       }
       
       String frase = String.format("Seu peso ideal é: %.2f", peso);
       
       System.out.println(frase);
   }
}
