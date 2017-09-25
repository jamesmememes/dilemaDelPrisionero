public class Enfrentamientos {
 Sospechosos sospechosos = new Sospechosos (); 
 
 public Enfrentamientos () {
  int condenaSospechoso1, condenaSospechoso2;
  String vector[] = new String[(sospechosos.ingenuo.decision) (sospechosos.egoista.decision) (sospechosos.aleatorio.decision) (sospechosos.imitador.decision) (sospechosos.agenteOriginal.decision)];
  int Primerenfrentador = 0;   
  while (Primerenfrentador < vector.length) {
  String enfrentador = vector[i];     
      
   for (int i = 0; i < vector.length; ++i) {
      String rival = vector[i]; 
     if (enfrentador == rival) {
      if (enfrentador == "confieso") {
        enfrentador.anyosDeCarcel = (condenaSospechoso1 =  6);
        rival.anyosDeCarcel = (condenaSospechoso2 =  6);
      }
   
      else {
        enfrentador.anyosDeCarcel = (condenaSospechoso1 =  1);
        enfrentador.anyosDeCarcel = (condenaSospechoso2 =  1);  
      }
     }
   
    else {
    if (enfrentamientos.aleatorio().decision == "confieso") {
     enfrentador.anyosDeCarcel = (condenaSospechoso1 = 0);
     rival.anyosDeCarcel = (condenaSospechoso2 = 10); 
    }
    
    else {
     enfrentador.anyosDeCarcel = (condenaSospechoso1 = 10);
     rival.anyosDeCarcel = (condenaSospechoso2 = 0);
    }
    }         
  }
  ++enfrentador; 
  ++primerEnfrentador; 
  }
 }
}