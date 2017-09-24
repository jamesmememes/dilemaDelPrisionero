import javax.swing.JOptionPane; 
import java.io.*;
import java.io.InputStreamReader; 
import java.io.BufferedReader; 

public class Interfaz {

        // JOptionPANE
 public void mostrarString (String mensaje, String titulo) {  // esto si lo vamos a necesitar 
  JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);  
 }
 
 
   // DE AQUÍ NOSE SI VAMOS A NECESITAR SOLICITAR ALGÚN TIPO DE DATO AL USUARIO 
 public String solicitarString (String mensaje) {
  return JOptionPane.showInputDialog(mensaje); 
 }
 
 public double solicitarDouble (String mensaje){
  return Double.parseDouble(JOptionPane.showInputDialog(mensaje));   
 }
 
 public int solicitarInt (String mensaje) {
  return Integer.parseInt(JOptionPane.showInputDialog(mensaje));    
 }
 
       //CONSOLA 
       
 InputStreamReader isr = new InputStreamReader(System.in);  // se crea un flujo de entrada de lo que pasa en el sistema
 BufferedReader br = new BufferedReader(isr); // almacenamos lo que estamos leyendo que proviene de isr
 public String solocitarString () {
  
 return   
 }
}
