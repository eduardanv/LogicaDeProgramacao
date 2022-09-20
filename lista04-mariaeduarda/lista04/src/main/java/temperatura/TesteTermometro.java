
package temperatura;

import java.util.Scanner;


public class TesteTermometro {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
    
         System.out.println("Aumente a temperatura atual:");
         Double tempAumentar = in.nextDouble();
         
         System.out.println("Diminua a temperatura atual:");
         Double tempDiminuir = in.nextDouble();
         
         Double fahreinheit = 0.0;
         
         Termometro constTemperatura = new Termometro (23.00,40.00,17.00);
         
         constTemperatura.aumentaTemperatura(tempAumentar);
         constTemperatura.diminuiTemperatura(tempDiminuir);
     
         constTemperatura.exibeFahreinheit(fahreinheit);
    }
   
}
