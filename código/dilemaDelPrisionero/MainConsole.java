
import javax.swing.JOptionPane; 
import java.io.*;
import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.util.Scanner; 

public class MainConsole {
  
    
 public static void main (String v[]) {
    Interfaz interfaz = new Interfaz (); // cree una instancia de Interfaz, que llame interfaz, con letra minuscula. 
    Sospechosos sospechosos = new Sospechosos (); 
    Scanner input = new Scanner (System.in);
    String tipoJuego = interfaz.solicitarStringConsola("¿Desea el método específico o grupal?\nDigite E para especifico y G para grupal"); 
 
    try {
     if (tipoJuego.toLowerCase() == "e"){
         int numrondas = interfaz.solicitarIntConsola ("Digite el número de rondas que desea en el juego");
         // int numrondas = input.nextInt(); CREO QUE ESTO YA NO SE NECESITA. 
         //Mandar esta variable al metodo que hace las rondas, para que las ejecute de una vez 
         boolean especifico = true;  /** Para que enfrentamientos sepa que es especifico (al final para
         que lo corra despues de la variable de solicitar el numero de rondas)*/
        }   
     else{  
         if (tipoJuego.toLowerCase() == "g") {
         interfaz.mostrarStringConsola("ESCOJA EL PRIMER SOSPECHOSO", "Preparativos");
         /*aquí hay que poner un switch*/interfaz.solicitarIntConsola("Escoja al primer sospechoso \n 1 = Ingenuo \n 2 = Egoista \n 3 = Aleatorio \n 4" + 
         "= Imitador \n 5 = ImitadorConTraición \n 6 = Original");
         
        
         System.out.println("Digite el ");//Aqui va como vamos a identificar a los DOS sospechosos
         String sospechoso1 = input.next();    //String o Int?   Depende de como vayamos a llamar a los sospechosos, por numero o por nombre
         //Si es por nombre lo dejamos int y establecemos como el usuario los llama, si es por numero entonces hacemos una lista y le 
         //ponemos un numero que cuando se ponga llame al agente. 
         System.out.println("Digite el ");
         String sospechoso2 = input.next();
          //Ocupamos a parte de llamarlos, llamar tambieen   al metodo que hace la pelea!!
     
         System.out.println("Digite el número de iteraciones que desea");
         
         int numiteraciones = input.nextInt();
 
        }    //Mandar el valor de numiteraciones a la clase iteraciones para que sepa CUANTAS usar
     }
        
    }
    
    catch (Exception e){ 
     interfaz.mostrarStringConsola("La letra que dijito no es valida","ERROR");  // aún falta crear mostarStringConsola en clase interfaz.
    }
     
 }    
 
}
