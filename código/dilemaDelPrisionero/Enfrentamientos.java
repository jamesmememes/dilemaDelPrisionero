public class Enfrentamientos {
 Sospechosos enfrentamientos = new Sospechosos (); 
 
 public Enfrentamientos () {
  int condenaSospechoso1, condenaSospechoso2;
  String vector[] = new String[(sospechosos.ingenuo) (sospechosos.egoista) (sospechosos.aleatorio) (sospechosos.imitador) (sospechosos.agenteOriginal)];
  int contadorDePosicionDelVect = 0;
 while (contadorDePosicionDelVect < vector.lenght) {
    
  while (contadorDePosicionDelVect < vector.lenght) {for (int i = 0; i < vector.lenght; ++i) {
     String rival = vector[i]; 
     if (enfrentamientos.aleatorio().decision == rival) {
      if (enfrentamientos.aleatorio().decision == "confieso") {
        enfrentamientos.aleatorio().anyosDeCarcel = (condenaSospechoso1 =  6);
        enfrentamientos.rival().anyosDeCarcel = (condenaSospechoso2 =  6);
      }
   
      else {
        enfrentamientos.aleatorio().anyosDeCarcel = (condenaSospechoso1 =  1);
        enfrentamientos.rival().anyosDeCarcel = (condenaSospechoso2 =  1);  
      }
     }
   
    else {
    if (enfrentamientos.aleatorio().decision == "confieso") {
     enfrentamientos.aleatorio().anyosDeCarcel = (condenaSospechoso1 = 0);
     enfrentamientos.rival().anyosDeCarcel = (condenaSospechoso2 = 10); 
    }
    
    else {
     enfrentamientos.aleatorio().anyosDeCarcel = (condenaSospechoso1 = 10);
     enfrentamientos.rival().anyosDeCarcel = (condenaSospechoso2 = 0);
    }
    }         
  }
 }
}
}