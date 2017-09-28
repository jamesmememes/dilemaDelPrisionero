
import java.util.Random;  

public class Sospechosos {
 public int totalAnyosDeCarcel, anyosCarcelEgoista, anyosCarcelIngenuo, anyosCarcelAleatorio, anyosCarcelImitador, anyosCarcelImitadorConTraicion, anyosCarcelAgenteOriginal; 
 public String decisionEgoista, decisionIngenuo, decisionAleatorio, decisionImitador, decisionImitadorConTraicion, decisionAgenteOriginal; 
 /*int totalAnyosDeCarcelAcumulados = egoista().totalAnyosDeCarcel + ingenuo().totalAnyosDeCarcel + aleatorio().totalAnyosDeCarcel + imitador().totalAnyosDeCarcel + 
 imitador2().totalAnyosDeCarcel + agenteOriginal().totalAnyosDeCarcel; */
 public void decisionEgoista () { //siempre confiesa, busca 0 años 
   String decision="confieso";     
   this.decisionEgoista = decision; 
 } 

 public void anyosCarcelEgoista (int anyosDeCarcel) {
  this.anyosCarcelEgoista = anyosDeCarcel; 
 }
 
 public void decisionIngenuo () { // nunca confiesa 
   String decision="no confieso";    
   this.decisionIngenuo = decision; 
 }

 public void anyosCarcelIngenuo (int anyosDeCarcel) {
  this.anyosCarcelIngenuo = anyosDeCarcel; 
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
  
  public void anyosCarcelAleatorio (int anyosDeCarcel) {
  this.anyosCarcelAleatorio = anyosDeCarcel;     
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
 
 public void anyosCarcelImitador ( int anyosDeCarcel) {
  this.anyosCarcelImitador = anyosDeCarcel; 
  }

 public void decisionImitadorConTraicion () {
  String decision = "no confieso"; 
  
 }
  
 public void anyosCarcelImitadorConTraicion (int anyosDeCarcel) {
  this.anyosCarcelImitadorConTraicion = anyosDeCarcel;
 } 
 public void decisionAgenteOriginal () { // estratégia de obtener menor cantidad de años en prisión
  String decision =""; 
  this.decisionAgenteOriginal = decision; 
 }
 
 public void anyosCarcelAgenteOriginal ( int anyosDeCarcel) {
 this.anyosCarcelAgenteOriginal = anyosDeCarcel; 
}
}