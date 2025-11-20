package tp4.Colaq2;

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

    public boolean masElementos(Cola q2) {
        Cola aux = new Cola();
        Cola aux2 = new Cola();;
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

        } return false;
    }
}
