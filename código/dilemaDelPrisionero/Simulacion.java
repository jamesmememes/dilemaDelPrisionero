public class Simulacion {
 Sospechosos enfrentamientos = new Sospechosos (); 
 
 public Simulacion () {
  int condenaSospechoso1 = 0;
  int condenaSospechoso2 = 0; 
  if (enfrentamientos.aleatorio.decision == enfrentamientos.ingenuo.decision) {
   if (enfrentamientos.aleatorio.decision == "confieso") {
    enfrentamientos.aleatorio.anyosDeCarcel = (condenaSospechoso1 =  6);
    enfrentamientos.ingenuo.anyosDeCarcel = (condenaSospechoso2 =  6);
   }
   
   else {
    enfrentamientos.aleatorio.anyosDeCarcel = (condenaSospechoso1 =  1);
    enfrentamientos.ingenuo.anyosDeCarcel = (condenaSospechoso2 =  1);  
   }
   }
   
  else {
    if (enfrentamientos.aleatorio.decision == "confieso") {
     enfrentamientos.aleatorio.anyosDeCarcel = (condenaSospechoso1 = 0);
     enfrentamientos.ingenuo.anyosDeCarcel = (condenaSospechoso2 = 10); 
    }
    
    else {
     enfrentamientos.aleatorio.anyosDeCarcel = (condenaSospechoso1 = 10);
     enfrentamientos.ingenuo.anyosDeCarcel = (condenaSospechoso2 = 0);
    }
      
  }; 
    
 }
}