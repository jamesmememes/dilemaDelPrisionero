import javax.swing.JOptionPane; 
import java.io.*;
import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.util.Scanner; 

public class MainJOption {
  /**Aca lo hice de esta manera, pero podemos invocar 
   * 
   */
 public static void main (String v[]) {
     Enfrentamientos enfrentamientos = new Enfrentamientos(); 
     Interfaz interfaz = new Interfaz (); 
     String tipojuego = interfaz.solicitarString("¿Desea el método específico o grupal?\nDigite E para especifico y G para grupal");
    
     try {
     if (tipojuego.toLowerCase() == "e"){
         int inputrondas = interfaz.solicitarInt("Digite el número de rondas que desea en el juego");
         
         //Mandar esta variable al metodo que hace las rondas, para que las ejecute de una vez 
        }   
     else{  
        if (tipojuego.toLowerCase() == "g") {
         interfaz.mostrarString ("ESCOJA EL PRIMER SOSPECHOSO", "OKAY PARA CONTINUAR"); // aún falta crear mostarStringConsola en Interfaz. 
         /*aquí hay que poner un switch*/interfaz.solicitarIntConsola("Escoja al primer sospechoso \n 1 = Ingenuo \n 2 = Egoista \n 3 = Aleatorio \n 4" + 
         "= Imitador \n 5 = Imitador2 \n 6 = Original");
         
          /*Ocupamos a parte de llamarlos, llamar tambieen   al metodo que hace la pelea!! OSEA QUE AQUÍ SE LLAMA A enfrentamientos.enfrentamientos. 
             Así que de una vez creé la instancia de Enfrentamientos al principio del main, para cuando la vayamos a utilizar. 
             */
         
          int inputiteraciones = interfaz.solicitarInt("Digite el número de iteraciones que desea"); 
         
          //Mandar el valor de numiteraciones a la clase iteraciones para que sepa
          System.exit(0);
         }
     }
    }
    catch (Exception e) {
     interfaz.mostrarString("La letra que dijito no es valida", "ERROR"); 
    }  
 }    
}
