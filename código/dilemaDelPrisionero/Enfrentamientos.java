public class Enfrentamientos {
    Sospechosos sospechosos = new Sospechosos (); 

    public EnfrentamientosgGrupal () {
        int condenaSospechoso1, condenaSospechoso2;

        String vectorDecisiones[] = new String[sospechosos.ingenuo().decision, sospechosos.egoista().decision , sospechosos.aleatorio().decision, +
        sospechosos.imitador().decision, sospechosos.agenteOriginal().decision];

        int vectorAnyosDeCarcel[] = new int [sospechosos.ingenuo().anyosDeCarcel , sospechosos.egoista().anyosDeCarcel , sospechosos.aleatorio().anyosDeCarcel , +
        sospechosos.imitador().anyosDeCarcel , sospechosos.agenteOriginal().anyosDeCarcel];

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

    public EnfrentamientosEspecífico(){
        /**
         * PRIMERA MANERA    (COMO HACER EL SWITCH?) Será evaluando cada posibilidad posible?
         * O evaluando solo la primer char y poniendo or's para que se reduzca notablemente la cantidad de casos?
         * (Solo evaluando la primera letra de lo que puso el usuario, y que para los agentes todas sean distintas
         * y ponemos or como en : Confeson vs Aleatorio || Aleatorio vs Confeson;;   Asi nos ahorramos un switch cada vez?)
         */
        
        //Quería hacerlo con números pero no le puedo añadir a una variable el nombre de un número     Como por ejemplo que diga
        // int 1 = sospechosos.egoista();       Si lo saben cambiar, y les parece mejor en número, cambienloo.

        int egoista = sospechosos.egoista();
        int ingenuo = sospechosos.ingenuo();
        int aleatorio = sospechosos.aleatorio();
        int imitador = sospechosos.imitador();
        /**int = sospechosos.________();    //El que hace falta    */
        int original = sospechosos.agenteOriginal();

        /**switch{

         
         
        }
        */
        --------------------------------------------------------------------------------------------------------------
        /**
         * SEGUNDA MANERA
         * Modificando el codigo de arriba para grupal, para hacerlo solo con DOS personas;  modificamos los vectores y le hacemos
         * algo al while y al for de abajo?  
         */

        int condenaSospechoso1, condenaSospechoso2;
        
        int sospechoso1, sospechoso2;

        String vectorDecisiones[] = new String[sospechoso1, sospechoso2];

        int vectorAnyosDeCarcel[] = new int [sospechoso1, sospechoso2];

        int enfrentadores = 0;   
        
        numIteraciones = input.nextInt; //Sera SCANNER o SÓLO INPUT o ALGUN otra manera de entrar el valo??
        //numIteraciones va a regir cuantas veces se pelean los agentes
        
        iteraciones = (Math.random ()*numIteraciones)+1;
        
        /**
         * El while y el For de abajo no los cambie, si hay que hacerles algun cambio para que funiconen bien solo con 2
         * jugadores, porfa cambialo
         * */
         
        while (enfrentadores < iteraciones) { // nose si es un menor o menor e igual, tiene que ser el numero de ITERACIONES
            int posicionDelEnfrentador = 0; 
            String enfrentador = vectorDecisiones[posicionDelEnfrentador]; 
            
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
            
            //ESTA ULTIMA PARTE  de abajo como la modificamos para que sea solo de 2 personas una cantidad X de veces? (Definidas por el usuario)
            
            ++posicionDelEnfrentador; // necesitamos realizar la siguiente ronda de 6 comparaciones, se le aumenta 1, para que se vuelva a compara con los 6 otro sospechoso. 
            ++enfrentadores;  // también se le suma a enfrentadores para que el while se acabe en algún momento. 
        }
    }

  
}
}
