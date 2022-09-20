
package temperatura;

import java.util.Scanner;


public class TesteTermometro {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
    
         Termometro constTemperatura = new Termometro (17.0,25.6,35.0);
         
         System.out.println("Aumente a temperatura atual:");
         Double tempAumentar = in.nextDouble();
         
         System.out.println("Diminua a temperatura atual:");
         Double tempDiminuir = in.nextDouble();
         
         
         constTemperatura.aumentaTemperatura(tempAumentar);
         constTemperatura.diminuiTemperatura(tempDiminuir);
   
     
   
    }
   
}
