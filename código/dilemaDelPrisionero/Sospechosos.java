public class Sospechosos {
 
    
 public String egoista () { //siempre confiesa, busca 0 años 
  String respuesta=""; 
  return respuesta;      
 } 
 
 public String ingenuo () { // nunca confiesa
 String respuesta="";    
 return respuesta; 
 }
 
 public String aleatorio () { // siempre es al azar
  int numeroAleatorio = (int)(Math.random()*2);
  String respuesta ="";
  
  if (numeroAleatorio == 0) {
   respuesta = "confieso";   
  }
  
  else {
    respuesta = "no confieso"; 
  }
  return respuesta; 
 }
 
 public String imitador () { // copia lo que hizo su rival en el turno anterior, primer turno aleatorio
  String respuesta=""; 
  return respuesta;     
 }
 
 public String agenteOrinigal () { // estratégia de obtener menor cantidad de años en prisión
  String respuesta =""; 
  return respuesta;    
 }
 
 
}
