import javax.swing.JOptionPane; 
import java.io.*;
import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.util.Scanner; 

public class MainConsole {

 public static void main (String v[]) {
    Scanner input = new Scanner (System.in);
    System.out.println("¿Desea el método específico o grupal?\nDigite E para especifico y G para grupal");
    String tipojuego = input.next();
    
    //PONER UN TRY O CATCH PARA AGARRAR cuando pongan otra cosa distinta a E o G!     Al final por que no es tan neceseario.
     if (tipojuego == "E"){
         System.out.println("Digite el número de rondas que desea en el juego");
         int numrondas = input.nextInt();
         //Mandar esta variable al metodo que hace las rondas, para que las ejecute de una vez 
        }   
     else{  
         
         System.out.println("Digite el ");//Aqui va como vamos a identificar a los DOS sospechosos
         String sospechoso1 = input.next();    //String o Int?   Depende de como vayamos a llamar a los sospechosos, por numero o por nombre
         //Si es por nombre lo dejamos int y establecemos como el usuario los llama, si es por numero entonces hacemos una lista y le 
         //ponemos un numero que cuando se ponga llame al agente. 
         System.out.println("Digite el ");
         String sospechoso2 = input.next();
          //Ocupamos a parte de llamarlos, llamar tambieen   al metodo que hace la pelea!!
     
         System.out.println("Digite el número de iteraciones que desea");
         
         int numiteraciones = input.nextInt();
 
         //Mandar el valor de numiteraciones a la clase iteraciones para que sepa CUANTAS usar
     }
        
     
     
 }    
 
}
