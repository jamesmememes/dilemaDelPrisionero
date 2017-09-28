import java.util.Random;  

public class Sospechosos {
 public int totalAnyosDeCarcel, totalAnyosCarcelEgoista, totalAnyosCarcelIngenuo, totalAnyosCarcelAleatorio, totalAnyosCarcelImitador, totalAnyosCarcelImitadorConTraicion, totalAnyosCarcelAgenteOriginal; 
 public String decisionEgoista, decisionIngenuo, decisionAleatorio, decisionImitador, decisionImitadorConTraicion, decisionAgenteOriginal; 
 /*int totalAnyosDeCarcelAcumulados = egoista().totalAnyosDeCarcel + ingenuo().totalAnyosDeCarcel + aleatorio().totalAnyosDeCarcel + imitador().totalAnyosDeCarcel + 
 imitador2().totalAnyosDeCarcel + agenteOriginal().totalAnyosDeCarcel; */
 public void decisionEgoista () { //siempre confiesa, busca 0 años 
   String decision="confieso";     
   this.decisionEgoista = decision; 
 } 

 public void setAnyosCarcelEgoista (int anyosDeCarcel) {
  this.totalAnyosCarcelEgoista = anyosDeCarcel; 
 }
 
 public void decisionIngenuo () { // nunca confiesa 
   String decision="no confieso";    
   this.decisionIngenuo = decision; 
 }

 public void setAnyosCarcelIngenuo (int anyosDeCarcel) {
  this.totalAnyosCarcelIngenuo = anyosDeCarcel; 
 } 
 
 public void decisionAleatorio () { // siempre es al azar
  int numeroAleatorio = (int)(Math.random()*2);
  String decision ="";
  
  if (numeroAleatorio == 0) { // número aleatorio se utiliza para generar una desicion randon de 1/2 posibilidades, 1 ó 0
   decision = "confieso";   
  }
  
  else {
    decision = "no confieso"; 
  }
  this.decisionAleatorio = decision; 
 }
  
  public void setAnyosCarcelAleatorio (int anyosDeCarcel) {
  this.totalAnyosCarcelAleatorio = anyosDeCarcel;     
 }

 public void decisionImitador () { // copia lo que hizo su rival en el turno anterior, primer turno aleatorio
  int banderaDeInicio = 0; 
  String decision=""; 
  String decisionDelOponente =""; 
  
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
    if (decisionDelOponente == "confesar") {
     decision = "no confesar"; 
    }
    
    else {
     decision = "confesar"; 
    }
    } 
  
  this.decisionImitador = decision; 
 }
 
 public void setAnyosCarcelImitador ( int anyosDeCarcel) {
  this.totalAnyosCarcelImitador = anyosDeCarcel; 
  }

 public void decisionImitadorConTraicion () {
  String decision = "no confieso"; 
 }
  
 public void setAnyosCarcelImitadorConTraicion (int anyosDeCarcel) {
  this.totalAnyosCarcelImitadorConTraicion = anyosDeCarcel;
 } 
 
 public void decisionAgenteOriginal () { // estratégia de obtener menor cantidad de años en prisión
  String decision ="confieso"; 
 }
 
 public void setAnyosCarcelAgenteOriginal ( int anyosDeCarcel) {
 this.totalAnyosCarcelAgenteOriginal = anyosDeCarcel; 
}
}
