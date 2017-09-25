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
  int banderaDeInicio = 0; 
  int anyosDeCarcel = 0;
  String decision=""; 
  
  if (banderaDeInicio == 0) {  // como la primera ronda es aleatorio puse un contador = 0; y automaticamente ingresa le sumo 1
   int numeroAleatorio = (int)(Math.random()*2); // por lo que la siguiente ronda no va a entrar a este if y va pasar directo al else. 
      ++banderaDeInicio;                       // en el else va tener que estar el código para copiar el turno del oponente. 
     if (numeroAleatorio == 0) { // número aleatorio se utiliza para generar una desicion randon de 1/2 posibilidades, 1 ó 0
        decision = "confieso";   
     }  
  
     else {
        decision = "no confieso"; 
     }
  }
  
  else {
    
  }
  return decision;   
 }
 
 public String agenteOriginal () { // estratégia de obtener menor cantidad de años en prisión
  int anyosDeCarcel = 0;
  String decision =""; 
  return decision;    
 }
 
 
}