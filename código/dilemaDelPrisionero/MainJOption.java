import javax.swing.JOptionPane; 
import java.io.*;
import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.util.Scanner; 

public class MainJOption {
  /**Aca lo hice de esta manera, pero podemis invocar 
   * 
   */
 public static void main (String v[]) {
     String tipojuego = JOptionPane.showInputDialog("¿Desea el método específico o grupal?\nDigite E para especifico y G para grupal");
     //PONER UN TRY O CATCH PARA AGARRAR cuando pongan otra cosa distinta a E o G!     Al final por que no es tan neceseario.
     if (tipojuego == "E"){
         String inputrondas = JOptionPane.showInputDialog("Digite el número de rondas que desea en el juego");
         
         int numrondas = Integer.parseInt(inputrondas);
         
         //Mandar esta variable al metodo que hace las rondas, para que las ejecute de una vez 
        }   
     else{  
        
         String sospechoso1 = JOptionPane.showInputDialog("Digite el "); //Aqui va como vamos a identificar a los DOS sospechosos
         //if java ==1, java.long
         
         String sospechoso2 = JOptionPane.showInputDialog("Digite el ");
         
         //Ocupamos a parte de llamarlos, llamar tambieen   al metodo que hace la pelea!!
         
         String inputiteraciones = JOptionPane.showInputDialog("Digite el número de iteraciones que desea");
        
         int numiteraciones = Integer.parseInt(inputiteraciones);
         
         //Mandar el valor de numiteraciones a la clase iteraciones para que sepa
         System.exit(0);
     }
        /**
         * SE DEBE PONER UN SYSTEM.OUT POR que estamos usando Joption, lo puse arriba pero por si acaso lo movemos donde se tenga que poner.
         * 
         */
 }    

    }
