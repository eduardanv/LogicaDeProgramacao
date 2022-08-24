
package com.mycompany.lista03.media.idade;

import java.util.Scanner;


public class Idade {
    
    public static void main(String[] args) {
        
        ClassificarIdade classifica = new ClassificarIdade();
          
        Scanner leitor = new Scanner(System.in);

    
        System.out.println("Informe sua idade:");
        
        Integer idade = leitor.nextInt();
        
        classifica.classificaIdade(idade);
    }
 
            
}
