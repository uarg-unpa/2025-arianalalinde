public class Cola {
    private int[] elementos;
    private final int MAX = 30;
    private int fin;
    private int frente;

    public Cola() {
        elementos = new int[MAX];
        fin = -1;
        frente = 0;

    }

    public boolean estaVacia() {
        return fin == -1;
    }

    public boolean estaLlena() {
        return fin == MAX - 1;
    }

    public void encolar(int e) {
        fin++;
        elementos[fin] = e;
    }

    public int desencolar() {
        int aux = elementos[frente];
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return aux;
    }

    public int peek() {
        return elementos[frente];
    }

    
    // --------
    

    public boolean masElementos(Cola q2) {
        Cola aux = new Cola();
        Cola aux2 = new Cola();
        ;
        int contCola = 0;
        int contQ2 = 0;

        while (!estaVacia()) {
            int elem = desencolar();
            aux.encolar(elem);
            contCola++;
        }
        while (!aux.estaVacia())
            encolar(aux.desencolar());


        while (!q2.estaVacia()) {
            int elem2 = q2.desencolar();
            aux2.encolar(elem2);
            contQ2++;
        }
        while (!aux2.estaVacia()) {
            q2.encolar(aux2.desencolar());
        }

        if (contCola > contQ2) {
            return true;

        }
        return false;
    }
    
    


    public boolean mismaCantidad(Cola otra) {
        Cola aux = new Cola();
        Cola aux2 = new Cola();
        int contCola = 0;
        int contOtra = 0;

        while (!estaVacia()) {
            int elem = desencolar();
            aux.encolar(elem);
            contCola++;
        }
        while (!aux.estaVacia())
            encolar(aux.desencolar());


        while (!otra.estaVacia()) {
            int elem2 = otra.desencolar();
            aux2.encolar(elem2);
            contOtra++;
        }
        while (!aux2.estaVacia()) {
            otra.encolar(aux2.desencolar());
        }

        if (contCola == contOtra) {
            return true;

        }
        return false;
    }

    
    

    public int contarCoincidencias(Cola otra2) {
        Cola aux1 = new Cola();
        Cola aux2 = new Cola();
        int cont = 0;

        while (!estaVacia() && !otra2.estaVacia()) { //mientras ambas colas tengan elementos
            int elem1 = desencolar();
            int elem2 = otra2.desencolar();
            if (elem1 == elem2) {
                cont++;
            }
            aux1.encolar(elem1);
            aux2.encolar(elem2);
        }
        while (!aux1.estaVacia()) {
            encolar(aux1.desencolar());
        }

        while (!aux2.estaVacia()) {
            otra2.encolar(aux2.desencolar());
        }
        return cont;
    }

    
    

    public boolean menoresQue(Cola q2) {
        Cola aux1 = new Cola();
        Cola aux2 = new Cola();
        boolean ok = true;

        // Comparar posición por posición
        while (!estaVacia() && !q2.estaVacia()) {
            int elem1 = desencolar();
            int elem2 = q2.desencolar();

            if (elem1 >= elem2) {
                ok = false;   // falla la comparación
            }

            aux1.encolar(elem1);
            aux2.encolar(elem2);
        }

        // Restaurar ambas colas por separado
        while (!aux1.estaVacia()) {
            encolar(aux1.desencolar());
        }

        while (!aux2.estaVacia()) {
            q2.encolar(aux2.desencolar());
        }

        return ok;
    }

    
    

    public boolean todosPares() {
        Cola aux = new Cola();
        boolean ok = true;

        while (!estaVacia()) {
            int num = desencolar();

            if (num % 2 != 0) {   // impar
                ok = false;
            }

            aux.encolar(num);
        }

        while (!aux.estaVacia()) {
            encolar(aux.desencolar());
        }

        return ok;
    }
    
    


    public boolean mismasColas(Cola q2) {
        Cola aux1 = new Cola();
        Cola aux2 = new Cola();
        boolean ok = true;

        while (!estaVacia() || !q2.estaVacia()) {
            int elem1 = desencolar();
            int elem2 = q2.desencolar();

            if (elem1 != elem2) {
                ok = false;
            }

            aux1.encolar(elem1);
            aux2.encolar(elem2);
        }

        while (!aux1.estaVacia()) {
            encolar(aux1.desencolar());
        }

        while (!aux2.estaVacia()) {
            q2.encolar(aux2.desencolar());
        }

        return ok;
    }
    
    


    public boolean mismosPares(Cola otra) {
        Cola aux = new Cola();
        Cola aux2 = new Cola();
        int contPar1 = 0;
        int contPar2 = 0;

        // Contar pares de la primera cola
        while (!estaVacia()) {
            int elem1 = desencolar();
            if (elem1 % 2 == 0) {
                contPar1++;
            }
            aux.encolar(elem1);
        }

        // Restaurar primera cola
        while (!aux.estaVacia()) {
            encolar(aux.desencolar());
        }

        // Contar pares de la segunda cola
        while (!otra.estaVacia()) {
            int elem2 = otra.desencolar();
            if (elem2 % 2 == 0) {
                contPar2++;
            }
            aux2.encolar(elem2);
        }

        // Restaurar segunda cola
        while (!aux2.estaVacia()) {
            otra.encolar(aux2.desencolar());
        }

        // Comparar
        return contPar1 == contPar2;
    }

    
    

    public boolean mayoresPromedio(Cola otra) {
        Cola aux1 = new Cola();
        Cola aux2 = new Cola();

        int suma1 = 0;
        int suma2 = 0;

        int cont1 = 0;
        int cont2 = 0;


        while (!estaVacia()) {
            int elem = desencolar();
            suma1 += elem;
            cont1++;
            aux1.encolar(elem);
        }


        while (!aux1.estaVacia()) {
            encolar(aux1.desencolar());
        }


        while (!otra.estaVacia()) {
            int elem2 = otra.desencolar();
            suma2 += elem2;
            cont2++;
            aux2.encolar(elem2);
        }

        while (!aux2.estaVacia()) {
            otra.encolar(aux2.desencolar());
        }

        double prom1 = (cont1 > 0) ? (double) suma1 / cont1 : 0;
        double prom2 = (cont2 > 0) ? (double) suma2 / cont2 : 0;

        return prom1 > prom2;
    }
    


    public boolean mitadMayor(Cola otra) {

        Cola aux1 = new Cola();
        Cola aux2 = new Cola();

        int max1 = 0;
        int max2 = 0;

        boolean primero1 = true;
        boolean primero2 = true;

        // Obtener máximo de cola1
        while (!estaVacia()) {
            int elem = desencolar();

            if (primero1) {
                max1 = elem;
                primero1 = false;
            } else {
                if (elem > max1) {
                    max1 = elem;
                }
            }

            aux1.encolar(elem);
        }

        // Restauro cola 1
        while (!aux1.estaVacia()) {
            encolar(aux1.desencolar());
        }

        // --- Obtener máximo de la OTRA cola ---
        while (!otra.estaVacia()) {
            int elem = otra.desencolar();

            if (primero2) {
                max2 = elem;
                primero2 = false;
            } else {
                if (elem > max2) {
                    max2 = elem;
                }
            }

            aux2.encolar(elem);
        }

        // Restauro la otra cola
        while (!aux2.estaVacia()) {
            otra.encolar(aux2.desencolar());
        }

        // Calcular mitades
        double mitad1 = max1 / 2.0;
        double mitad2 = max2 / 2.0;

        int cont1 = 0;
        int cont2 = 0;

        // --- Contar mayores en ESTA cola ---
        while (!estaVacia()) {
            int elem = desencolar();

            if (elem > mitad1) {
                cont1++;
            }

            aux1.encolar(elem);
        }

        while (!aux1.estaVacia()) {
            encolar(aux1.desencolar());
        }

        // Contar mayores en la OTRA cola
        while (!otra.estaVacia()) {
            int elem = otra.desencolar();

            if (elem > mitad2) {
                cont2++;
            }

            aux2.encolar(elem);
        }

        while (!aux2.estaVacia()) {
            otra.encolar(aux2.desencolar());
        }

        return cont1 > cont2;
    }



    public boolean masNegativos(Cola otra) {
        Cola aux = new Cola();
        Cola aux2 = new Cola();
        int contNega = 0;
        int contNega2 = 0;


        while (!estaVacia()) {
            int num1 = desencolar();

            if (num1 < 0) {
                contNega++;
            }
            aux.encolar(num1);
        }


        while (!aux.estaVacia()) {
            encolar(aux.desencolar());
        }


        while (!otra.estaVacia()) {
            int num2 = otra.desencolar();

            if (num2 < 0) {
                contNega2++;
            }
            aux2.encolar(num2);
        }


        while (!aux2.estaVacia()) {
            otra.encolar(aux2.desencolar());
        }

        return contNega > contNega2;
    }

}
