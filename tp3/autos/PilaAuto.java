public class PilaAuto {
    private final int MAX = 10;
    private Auto[] elementos;
    private int cima;

    public PilaAuto() {
        elementos = new Auto[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    // Agrega un auto a la pila
    public void meter(Auto auto) {
        cima++;
        elementos[cima] = auto;
    }

    public Auto sacar() {
        Auto aux = elementos[cima];
        cima--;
        return aux;
    }


    public Auto peek() {
        return elementos[cima];
    }

    // Busca auto por patente y eliminarlo
    public Auto buscarYEliminar(String patente) {
        PilaAuto aux = new PilaAuto();
        Auto encontrado = null;

        while (!estaVacia()) {
            Auto actual = sacar();
            if (actual.getPatente().equalsIgnoreCase(patente) && encontrado == null) {
                encontrado = actual; // Guardo el auto encontrado
            } else {
                aux.meter(actual); // Guardo los demás en la pila auxiliar
            }
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        return encontrado;
    }

    // Cantidad de autos en la pila
    public int cantidad() {
        return cima + 1;
    }
}
