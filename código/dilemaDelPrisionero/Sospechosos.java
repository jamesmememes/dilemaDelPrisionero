public class Sospechosos {
 
    
 public String egoista () { //siempre confiesa, busca 0 años 
  int anyosDeCarcel = 0; 
  String decision="confieso"; 
  return decision;      
 } 
 
 
 public String ingenuo () { // nunca confiesa
 int anyosDeCarcel = 0;
 String decision="no confieso";    
 return decision; 
 }
 
 
 public String aleatorio () { // siempre es al azar
  int anyosDeCarcel = 0;
  int numeroAleatorio = (int)(Math.random()*2);
  String decision ="";
  
  if (numeroAleatorio == 0) { // número aleatorio se utiliza para generar una desicion randon de 1/2 posibilidades, 1 ó 0
   decision = "confieso";   
  }
  
  else {
    decision = "no confieso"; 
  }
  return decision; 
 }
 
 public String imitador () { // copia lo que hizo su rival en el turno anterior, primer turno aleatorio
  int anyosDeCarcel = 0;
  String decision=""; 
  return decision;     
 }
 
 public String agenteOrinigal () { // estratégia de obtener menor cantidad de años en prisión
  int anyosDeCarcel = 0;
  String decision =""; 
  return decision;    
 }
 
 
}