import java.util.ArrayList;

public class Enfrentamientos {
 String resultados = "Resultados \n Años de carcel de los agentes \n";
 Sospechosos sospechosos = new Sospechosos ();
 public Enfrentamientos () {
  /* String vectorDecisiones[] = new String[(sospechosos.decisionIngenuo) (sospechosos.decisionEgoista) (sospechosos.decisionAleatorio) + // ESTA VERSIÓN NO FUNCIONO 
  (sospechosos.decisionImitador) (sospechosos.decisionImitador2) (sospechosos.decisionAgenteOriginal)];
  
  int vectorAnyosDeCarcel[] = new int [(sospechosos.anyosCarcelIngenuo)(sospechosos.anyosCarcelEgoista)(sospechosos.anyosCarcelAleatorio) +  // NO BORRAR 
  (sospechosos.anyosCarcelImitador)(sospechosos.decisionImitador2)(sospechosos.decisionAgenteOriginal)];  */
  
  ArrayList<Integer>  anyosDeCarcel = new ArrayList<Integer>(); 
  anyosDeCarcel.add(sospechosos.totalAnyosCarcelIngenuo); 
  anyosDeCarcel.add(sospechosos.totalAnyosCarcelEgoista);
  anyosDeCarcel.add(sospechosos.totalAnyosCarcelAleatorio);                                                  
  anyosDeCarcel.add(sospechosos.totalAnyosCarcelImitador); 
  anyosDeCarcel.add(sospechosos.totalAnyosCarcelImitadorConTraicion);                                                   
  anyosDeCarcel.add(sospechosos.totalAnyosCarcelAgenteOriginal); 
  
  ArrayList<String> decisiones = new ArrayList<String>(); 
  decisiones.add(sospechosos.decisionIngenuo); 
  decisiones.add(sospechosos.decisionEgoista);
  decisiones.add(sospechosos.decisionAleatorio);                                                       
  decisiones.add(sospechosos.decisionImitador); 
  decisiones.add(sospechosos.decisionImitadorConTraicion);
  decisiones.add(sospechosos.decisionAgenteOriginal); 
  
  ArrayList<String> sospechoso = new ArrayList<String>(); 
  sospechoso.add("Ingenuo");
  sospechoso.add("Egoista"); 
  sospechoso.add("Aleatorio"); 
  sospechoso.add("Imitador"); 
  sospechoso.add("Imitador con traición"); 
  sospechoso.add("Original"); 
  
  int enfrentadores = 0;   
  while (enfrentadores < 6)  { //intente poner decisiones.length y no me funciono)  
   int posicionDelEnfrentador = 0; 
   String decisionEnfrentador = decisiones.get(posicionDelEnfrentador);  /*para que comience en el primer campo del vector, la posicion 0
   VectorDesiciones es un vector de Strings, saca los Strings de la clase Sospechosos, donde se encuentra un método de cada sospechoso con su comportamiento, 
   dentro de este se encuentra la variable decisión que sera un String, "confieso" o "no confieso". 
   por eso sería clase.metodo().variable == String. 
   */  
    for (int i = 0; i < 6; ++i) { // menor o menor e igual ?
      String decisionRival = decisiones.get(i); /* aquí es lo mismo que anteriormente la "i" comienza en el for como un 0, ,por eso vectorDecisiones[i = 0] 
       por lo que comienza enfrentandose consigo mismo. */  
      
      int anyosCarcelEnfrentador = anyosDeCarcel.get(posicionDelEnfrentador); /* aquí se hace uso del otro vector, que es un vector de enteros, 
      siguiendo la lógica pasada de clase.metodo().variable == int, solo que esta vez la variable es anyosDeCarcel que es un Integer.  
      NOTA: posicionDelEnfrentador se encuentra en el while, por lo que la posición de este vector se va a mantener hasta que termine el for 
      */
      int anyosCarcelRival = anyosDeCarcel.get(i); // lo mismo que arriba, solo que el contador de este vector lo lleva el for, por lo que va variando. 
      String agenteEnfrentador = sospechoso.get(posicionDelEnfrentador); 
      String agenteRival = sospechoso.get(i); 
       if (decisionEnfrentador.equals (decisionRival)) { // aquí compara los Strings de ambos metodos, ejemplo : ingenuo vs aleatorio 
       if (decisionEnfrentador.equals ("confieso")) { 
        anyosCarcelEnfrentador+=  6;
        anyosCarcelRival+=  6;
        resultados+= agenteEnfrentador + "\t Decisión= "+decisionEnfrentador+ "\t Años de carcel= " + "6" + "\t vs \t" + agenteRival + "\t Decisión= "+decisionRival+ "\t Años de carcel= " +"6";
       }
   
      else {
        anyosCarcelEnfrentador+=   1; 
        anyosCarcelRival+=   1;  
        resultados+= agenteEnfrentador + "\t Decisión= "+decisionEnfrentador+ "\t Años de carcel= " + "1" + "\t vs \t" + agenteRival + "\t Decisión= "+decisionRival+ "\t Años de carcel= " +"1";
       }
     }
   
     else {
       if (decisionEnfrentador.equals ("confieso")) {
         anyosCarcelEnfrentador+= 0;
         anyosCarcelRival+=  10; 
         resultados+= agenteEnfrentador + "\t Decisión= "+decisionEnfrentador+ "\t Años de carcel= " + "0" + "\t vs \t" + agenteRival + "\t Decisión= "+decisionRival+ "\t Años de carcel= " +"10";
       }
    
       else {
         anyosCarcelEnfrentador+=  10;
         anyosCarcelRival+= 0;
         resultados+= agenteEnfrentador + "\t Decisión= "+decisionEnfrentador+ "\t Años de carcel= " + "10" + "\t vs \t" + agenteRival + "\t Decisión= "+decisionRival+ "\t Años de carcel= " +"0";
       }
     }         
    }
   ++posicionDelEnfrentador; // necesitamos realizar la siguiente ronda de 6 comparaciones, se le aumenta 1, para que se vuelva a compara con los 6 otro sospechoso. 
   ++enfrentadores;  // también se le suma a enfrentadores para que el while se acabe en algún momento. 
  }
 }
 
 public String toString() {
  return resultados; // como los for hacen todo corrido y sobre escriben los valores anteriores de cada sospechoso, cree el String resultados, donde se va a ir acumulando todos los resultados. 
 }
}
