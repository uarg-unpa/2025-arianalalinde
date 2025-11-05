package tp3;

public class PilaChar {
    private char[] elementos; 
    private int cima;       
    private final int MAX = 20; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaChar() {
        elementos = new char[MAX];
        cima = -1;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == -1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    // Agrega un elemento en la cima (push)
    public void meter(char elem) {
 
            cima++;
            elementos[cima] = elem;
        
    }

    // Saca y devuelve el elemento de la cima (pop)
    public char sacar() {
      
            char aux = elementos[cima];
            cima--;
            return aux;
        }

}
