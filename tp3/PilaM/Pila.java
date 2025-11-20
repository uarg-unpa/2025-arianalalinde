public class Pila {
    private char[] elementos;
    private int cima;
    private final int MAX = 20; 

    
    public Pila() {
        elementos = new char[MAX];
        cima = -1;
    }

    
    public boolean estaVacia() {

        return cima == -1;
    }

    
    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    
    public void meter(char elem) {

        cima++;
        elementos[cima] = elem;

    }


    public char sacar() {

        int aux = elementos[cima];
        cima--;
        return aux;
    }




    public int mayorElemento() {
        Pila aux = new Pila();

        // Tomo el primer elemento como mayor inicial
        int mayor = sacar();
        aux.meter(mayor);

        // Recorro el resto de la pila
        while (!estaVacia()) {
            int elem = sacar();
            aux.meter(elem);

            if (elem > mayor) {
                mayor = elem;
            }
        }

        // Regreso los elementos a la pila original
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        return mayor;
    }



    public int sumaElementos() {
        Pila aux = new Pila();
        int suma = 0;

        while (!estaVacia()) {
            int elemento = sacar();
            aux.meter(elemento);
            suma = suma + elemento;
        }

        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        return suma;
    }



    public int contarConsonantes() {
        Pila aux = new Pila();
        int cont = 0;

        while (!estaVacia()) {
            char letra = sacar();
            aux.meter(letra);

            // Si es letra y NO es vocal → es consonante
            if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) {
                if (!(letra == 'A' || letra == 'E' || letra == 'I' ||
                        letra == 'O' || letra == 'U' ||
                        letra == 'a' || letra == 'e' || letra == 'i' ||
                        letra == 'o' || letra == 'u')) {
                    cont++;
                }
            }
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        return cont;
    }



    public int contarMayusculas() {
        Pila AUX = new Pila();
        int CONT = 0;

        while (!estaVacia()) {
            char LETRA = sacar();
            AUX.meter(LETRA);

            if (LETRA >= 'A' && LETRA <= 'Z') {
                CONT++;
            }
        }

        while (!AUX.estaVacia()) {
            meter(AUX.sacar());
        }

        return CONT;
    }



    public void invertir() {
        Pila AUX1 = new Pila();
        Pila AUX2 = new Pila();

        // Paso 1: pasar todo de la pila original a AUX1
        while (!estaVacia()) {
            AUX1.meter(sacar());
        }

        // Paso 2: pasar todo de AUX1 a AUX2
        while (!AUX1.estaVacia()) {
            AUX2.meter(AUX1.sacar());
        }

        // Paso 3: pasar todo de AUX2 a la pila original (queda invertida)
        while (!AUX2.estaVacia()) {
            meter(AUX2.sacar());
        }
    }



    public int contPares() {
        Pila aux = new Pila();
        int cont = 0;

        while (!estaVacia()) {
            int elemPar = sacar();
            if (elemPar > 0) {
                aux.meter(elemPar);
                cont++;
            }
        }

        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }
        return cont;
    }



    public int contarMultiplosDe3() {
        Pila aux = new Pila();
        int contM3 = 0;

        while (!estaVacia()) {
            int num = sacar();

            if (num % 3 == 0) {
                contM3++;
            }
            aux.meter(num);
        }

        while (!aux.estaVacia()) {
            meter(aux.sacar());

        }

        return contM3;
    }



    public int sumarImpares(){
        Pila aux = new Pila();
        int sumaImpar = 0;

        while (!estaVacia()){
            int num = sacar();

            if (num % 2 != 0){
                    sumaImpar += num;
            }

            aux.meter(num);
        }

        while (!aux.estaVacia()){
            meter(aux.sacar());
        }

        return sumaImpar;
    }

}


