import java.util.ArrayList;

public class Enfrentamientos {
    /**
     * Necesitamos que despues de que el MAIN, le diga al usuario que ponga lo que se ocupa,
     * que corra este metodo de abajo.   Tiene que ser DESPUES. No puede ser antes ya que el 
    tiene la informacion que este metodo ocupa.
    Lo hice con un IF, pero si dara errores por las prioridades de cor*/

 
    public Enfrentamientos () {
        if ( MainConsole.especifico ==true){ /**Modificar el path si no esta bien; lo que hay que hacer
            es verificar si el boolean dentro del main, en el try de tipojuego "==e" es TRUE*/  
            int condenaSospechoso1, condenaSospechoso2;
            Sospechosos sospechosos = new Sospechosos (); 
            /* String vectorDecisiones[] = new String[(sospechosos.decisionIngenuo) (sospechosos.decisionEgoista) (sospechosos.decisionAleatorio) + // ESTA VERSIÓN NO FUNCIONO 
            (sospechosos.decisionImitador) (sospechosos.decisionImitador2) (sospechosos.decisionAgenteOriginal)];

            int vectorAnyosDeCarcel[] = new int [(sospechosos.anyosCarcelIngenuo)(sospechosos.anyosCarcelEgoista)(sospechosos.anyosCarcelAleatorio) +  // NO BORRAR 
            (sospechosos.anyosCarcelImitador)(sospechosos.decisionImitador2)(sospechosos.decisionAgenteOriginal)];  */

            ArrayList<Integer>  anyosDeCarcel = new ArrayList<Integer>(); 
            anyosDeCarcel.add(sospechosos.anyosCarcelIngenuo); 
            anyosDeCarcel.add(sospechosos.anyosCarcelEgoista);
            anyosDeCarcel.add(sospechosos.anyosCarcelAleatorio);                                                  
            anyosDeCarcel.add(sospechosos.anyosCarcelImitador); 
            anyosDeCarcel.add(sospechosos.anyosCarcelImitadorConTraicion);                                                   
            anyosDeCarcel.add(sospechosos.anyosCarcelAgenteOriginal); 

            ArrayList<String> decisiones = new ArrayList<String>(); 
            decisiones.add(sospechosos.decisionIngenuo); 
            decisiones.add(sospechosos.decisionEgoista);
            decisiones.add(sospechosos.decisionAleatorio);                                                       
            decisiones.add(sospechosos.decisionImitador); 
            decisiones.add(sospechosos.decisionImitadorConTraicion);
            decisiones.add(sospechosos.decisionAgenteOriginal); 

            int enfrentadores = 0;   
            while (enfrentadores < 6)  { //intente poner decisiones.length y no me funciono)  
                int posicionDelEnfrentador = 0; 
                String enfrentador = decisiones.get(posicionDelEnfrentador);  /*para que comience en el primer campo del vector, la posicion 0
                VectorDesiciones es un vector de Strings, saca los Strings de la clase Sospechosos, donde se encuentra un método de cada sospechoso con su comportamiento, 
                dentro de este se encuentra la variable decisión que sera un String, "confieso" o "no confieso". 
                por eso sería clase.metodo().variable == String. 
                 */

                for (int i = 0; i < 6; ++i) { // menor o menor e igual ?
                    String rival = decisiones.get(i); /* aquí es lo mismo que anteriormente la "i" comienza en el for como un 0, ,por eso vectorDecisiones[i = 0] 
                    por lo que comienza enfrentandose consigo mismo. */  

                    int anyosCarcelEnfrentador = anyosDeCarcel.get(posicionDelEnfrentador); /* aquí se hace uso del otro vector, que es un vector de enteros, 
                    siguiendo la lógica pasada de clase.metodo().variable == int, solo que esta vez la variable es anyosDeCarcel que es un Integer.  
                    NOTA: posicionDelEnfrentador se encuentra en el while, por lo que la posición de este vector se va a mantener hasta que termine el for 
                     */
                    int anyosCarcelRival = anyosDeCarcel.get(i); // lo mismo que arriba, solo que el contador de este vector lo lleva el for, por lo que va variando. 

                    if (enfrentador.equals (rival)) { // aquí compara los Strings de ambos metodos, ejemplo : ingenuo vs aleatorio 
                        if (enfrentador.equals ("confieso")) { 
                            anyosCarcelEnfrentador= (condenaSospechoso1 =  6); /* asigna la cantidad de años de carcel para cada sospechoso, por eso creamos 2 vectores
                            ya que necesitabamos uno para los años de carcel. 
                             */
                            anyosCarcelRival= (condenaSospechoso2 =  6);
                        }

                        else {
                            anyosCarcelEnfrentador = (condenaSospechoso1 =  1); 
                            anyosCarcelRival = (condenaSospechoso2 =  1);  
                        }
                    }

                    else {
                        if (enfrentador.equals ("confieso")) {
                            anyosCarcelEnfrentador= (condenaSospechoso1 = 0);
                            anyosCarcelRival = (condenaSospechoso2 = 10); 
                        }

                        else {
                            anyosCarcelEnfrentador= (condenaSospechoso1 = 10);
                            anyosCarcelRival= (condenaSospechoso2 = 0);
                        }
                    }         
                }
                ++posicionDelEnfrentador; // necesitamos realizar la siguiente ronda de 6 comparaciones, se le aumenta 1, para que se vuelva a compara con los 6 otro sospechoso. 
                ++enfrentadores;  // también se le suma a enfrentadores para que el while se acabe en algún momento. 
            }
        }
        else /** Metodo para enfretnamientos especificos   */
        
        //.....   Una vez que ya hayan cosas aqui, se pueden cerrar los brckets de abajo.
    }
}

        

        
    
