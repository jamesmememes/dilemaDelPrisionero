import javax.swing.JOptionPane; 

public class Interfaz {

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
}