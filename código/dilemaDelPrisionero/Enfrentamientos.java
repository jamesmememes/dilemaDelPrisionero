public class Enfrentamientos {
 Sospechosos sospechosos = new Sospechosos (); 
 
 public Enfrentamientos () {
  int condenaSospechoso1, condenaSospechoso2;
  
  String vectorDecisiones[] = new String[(sospechosos.ingenuo().decision) (sospechosos.egoista().decision) (sospechosos.aleatorio().decision) +
  (sospechosos.imitador().decision) (sospechosos.agenteOriginal().decision)];
  
  int vectorAnyosDeCarcel[] = new int [(sospechosos.ingenuo().anyosDeCarcel) (sospechosos.egoista().anyosDeCarcel) (sospechosos.aleatorio().anyosDeCarcel) +
  (sospechosos.imitador().anyosDeCarcel) (sospechosos.agenteOriginal().anyosDeCarcel)];
  
  int enfrentadores = 0;   
  while (enfrentadores < vector.length) { // nose si es un menor o menor e igual 
   String enfrentador = vectorDecisiones[0];      // para que comience en el primer campo del vector, la posicion 0
   
   // VectorDesiciones es un vector de Strings, saca los Strings de la clase Sospechosos, donde se encuentra 
   // un método de cada sospechoso con su comportamiento, dentro de este se encuentra la variable decisión que sera un String, "confieso" o "no confieso". 
   //por eso sería clase.metodo().variable = String.
      
    for (int i = 0; i < vector.length; ++i) { // menor o menor e igual ?
      String rival = vectorDecisiones[i]; // aquí es lo mismo que anteriormente la "i" comienza en el for como un 0, ,por eso vectorDecisiones[i = 0] 
      // por lo que comienza enfrentandose consigo mismo. 
      if (enfrentador.equals (rival)) {
       if (enfrentador.equals ("confieso")) {
        enfrentador.anyosDeCarcel = (condenaSospechoso1 =  6);
        rival.anyosDeCarcel = (condenaSospechoso2 =  6);
       }
   
      else {
        enfrentador.anyosDeCarcel = (condenaSospechoso1 =  1);
        enfrentador.anyosDeCarcel = (condenaSospechoso2 =  1);  
       }
     }
   
     else {
       if (enfrentamientos.aleatorio().decision.equals ("confieso")) {
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