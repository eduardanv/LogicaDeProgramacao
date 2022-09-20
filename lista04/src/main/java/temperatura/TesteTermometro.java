
package temperatura;

import java.util.Scanner;


public class TesteTermometro {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
    
         System.out.println("Aumente a temperatura atual:");
         Double TempAumentar = in.nextDouble();
         
         System.out.println("Diminua a temperatura atual:");
         Double TempDiminuir = in.nextDouble();
         
         
         Termometro constTemperatura = new Termometro (17.0,25.6,35.0);
         
         constTemperatura.aumentaTemperatura(TempAumentar);
         constTemperatura.diminuiTemperatura(TempAumentar);
         constTemperatura.exibeFahreinheit(TempDiminuir);
     
   
    }
   
}
