 package tp3;
public class PilaEnteros {
    private final int MAX = 10;      // Capacidad máxima de la pila
    private int[] elementos;         // Array para almacenar los elementos
    private int cima;                // Índice del elemento del tope

    // --- Constructor ---
    public PilaEnteros() {
        elementos = new int[MAX];
        cima = -1; // Inicialmente la pila está vacía
    }

    // --- Verifica si la pila está vacía ---
    public boolean estaVacia() {
        return cima == -1;
    }

    // --- Verifica si la pila está llena ---
    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    // --- Agrega un elemento en la cima (push) ---
    // No se valida acá — se valida antes de llamar al método
    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
    }

    // --- Saca y devuelve el elemento de la cima (pop) ---
    public int sacar() {
        int aux = elementos[cima];
        cima--;
        return aux;
    }

    // --- Cuenta cuántas veces aparece un elemento ---
    public int contOcurrencia(int elem) {
        int contador = 0;
        PilaEnteros aux = new PilaEnteros();

        // Sacar elementos y contar
        while (!estaVacia()) {
            int actual = sacar();
            if (actual == elem) {
                contador++;
            }
            aux.meter(actual);
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        return contador;
    }

    // --- Retorna el elemento del tope sin eliminarlo ---
    public int peek() {
        if (!estaVacia()) {
            return elementos[cima];
        } else {
            return -1;
        }
    }

    // --- Vacía la pila ---
    public void vaciar() {
        cima = -1;
    }

    // --- Devuelve la cantidad de elementos ---
    public int cantidadElementos() {
        return cima + 1;
    }
}
