 package tp4.puntostp4;
 
 public class Cola {
    private int [] datos;
    private int frente;
    private int fin;
    private int max;

    //constructor
    public Cola (int tamaño){
        max = tamaño;
        datos = new int [max];
        frente = 0; //frente fijo.
        fin = -1; //Cola vacia
    }

    // verificar si la cola esta vacia
    public boolean estaVacia(){
        return fin == -1;
    }

    //verificar si esta llena
    public boolean estaLlena(){
        return fin == max;
    }

    // Insertar un elemento al final
    public void insertar(int valor) {
        if (estaLlena()) {
            System.out.println("Desbordamiento positivo: la cola está llena");
            return;
        }
        fin++;             // mover el final
        datos[fin] = valor;
    }

    // Borrar el elemento del frente
    public int borrar() {
        if (estaVacia()) {
            System.out.println("Desbordamiento negativo: la cola está vacía");
            return -1;       // valor de error
        }
        int valor = datos[frente];  // elemento a devolver

        // Mover todos los elementos hacia el frente
        for (int i = 0; i < fin; i++) {
            datos[i] = datos[i + 1];
        }
        fin--;             // se reduce la cantidad de elementos
        return valor;
    }

    // Mostrar elementos de la cola
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Cola: ");
        for (int i = 0; i <= fin; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    //p4 metodo contar
    public int contar() {
    if (estaVacia()) {
        return 0; // no hay elementos
    } else {
        return fin + 1; // índice + 1 = cantidad de elementos
    }}

    //p5, eliminar elementos repetidos
    public void eliminarRepetidos() {
    if (estaVacia()) return;

    Cola colaAux = new Cola(max);
    int[] visitados = new int[max];  // array para elementos únicos
    int cantidadVisitados = 0;

    while (!estaVacia()) {
        int elemento = borrar();
        boolean repetido = false;

        // Verificar si ya está en visitados
        for (int i = 0; i < cantidadVisitados; i++) {
            if (visitados[i] == elemento) {
                repetido = true;
                break;
            }
        }

        if (!repetido) {
            visitados[cantidadVisitados] = elemento; // agregar a visitados
            cantidadVisitados++;
            colaAux.insertar(elemento);             // mantener orden FIFO
        }
    }

    // Restaurar la cola original
    while (!colaAux.estaVacia()) {
        insertar(colaAux.borrar());
    }
}}
