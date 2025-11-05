package tp4.ejercicios;
//.
public class ColaCaracteres {
    private char[] elementos;
    private int frente, fin;
    private final int MAX = 10;

    public ColaCaracteres() {
        elementos = new char[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return fin == 0;
    }

    public boolean estaLlena() {
        return fin == MAX;
    }
    
    public void encolar(char elem) {
        elementos[fin] = elem;
        fin++;
    }
    
    public char desencolar() {
        char aux = elementos[frente]; 
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return aux;
    }

    public char peek() {
            return elementos[frente];
    }

  @Override
public String toString() {
    String texto = "Cola: ";
    if (estaVacia()) {
        texto += "(vacía)";
    } else {
        for (int i = frente; i <= fin; i++) {
            texto += elementos[i] + " ";
        }
    }
    return texto;
 }
}