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
   int posicionDelEnfrentador = 0; 
   String enfrentador = vectorDecisiones[posicionDelEnfrentador];  /*para que comience en el primer campo del vector, la posicion 0
   VectorDesiciones es un vector de Strings, saca los Strings de la clase Sospechosos, donde se encuentra un método de cada sospechoso con su comportamiento, 
   dentro de este se encuentra la variable decisión que sera un String, "confieso" o "no confieso". 
   por eso sería clase.metodo().variable == String. 
   */
      
    for (int i = 0; i < vector.length; ++i) { // menor o menor e igual ?
      String rival = vectorDecisiones[i]; /* aquí es lo mismo que anteriormente la "i" comienza en el for como un 0, ,por eso vectorDecisiones[i = 0] 
       por lo que comienza enfrentandose consigo mismo. */  
      
      int anyosCarcelEnfrentador = vectorAnyosDeCarcel[posicionDelEnfrentador]; /* aquí se hace uso del otro vector, que es un vector de enteros, 
      siguiendo la lógica pasada de clase.metodo().variable == int, solo que esta vez la variable es anyosDeCarcel que es un Integer.  
      NOTA: posicionDelEnfrentador se encuentra en el while, por lo que la posición de este vector se va a mantener hasta que termine el for 
      */
      int anyosCarcelRival = vectorAnyosDeCarcel[i]; // lo mismo que arriba, solo que el contador de este vector lo lleva el for, por lo que va variando. 
      
      if (enfrentador.equals (rival)) { // aquí compara los Strings de ambos metodos, ejemplo : ingenuo vs aleatorio 
       if (enfrentador.equals ("confieso")) { 
        anyosCarcelEnfrentador.anyosDeCarcel = (condenaSospechoso1 =  6); /* asigna la cantidad de años de carcel para cada sospechoso, por eso creamos 2 vectores
        ya que necesitabamos uno para los años de carcel. 
        */
        anyosCarcelRival.anyosDeCarcel = (condenaSospechoso2 =  6);
       }
   
      else {
        anyosCarcelEnfrentador.anyosDeCarcel = (condenaSospechoso1 =  1); 
        anyosCarcelRival.anyosDeCarcel = (condenaSospechoso2 =  1);  
       }
     }
   
     else {
       if (enfrentamientos.aleatorio().decision.equals ("confieso")) {
         anyosCarcelEnfrentador.anyosDeCarcel = (condenaSospechoso1 = 0);
         anyosCarcelRival.anyosDeCarcel = (condenaSospechoso2 = 10); 
       }
    
       else {
         anyosCarcelEnfrentador.anyosDeCarcel = (condenaSospechoso1 = 10);
         anyosCarcelRival.anyosDeCarcel = (condenaSospechoso2 = 0);
       }
     }         
    }
   ++posicionDelEnfrentador; // necesitamos realizar la siguiente ronda de 6 comparaciones, se le aumenta 1, para que se vuelva a compara con los 6 otro sospechoso. 
   ++enfrentadores;  // también se le suma a enfrentadores para que el while se acabe en algún momento. 
  }
 }
}