public class PilaString {
    private String[] elementos;
    private int cima;
    private final int MAX = 20; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaString() {
        elementos = new String[MAX];
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
    public void meter(String elem) {
        cima++;
        elementos[cima] = elem;
    }



    // Saca y devuelve el elemento de la cima (pop)
    public String sacar() {

        String aux = elementos[cima];
        cima--;
        return aux;
    }

    public int contarAcciones (String accion){
        PilaString aux = new PilaString();
        int cont = 0;

        while (!estaVacia()){
            String elem = sacar();
            if (elem.equalsIgnoreCase(accion)); { //comparo si dos Strings son iguales.
                cont++;
            }

            aux.meter(elem);
        }

        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        return cont;
    }


     public PilaString filtrarPorAutor(String autorBuscado) {
        PilaString aux = new PilaString();     // para la original
        PilaString resultados = new PilaString(); // guardo filtrados
        PilaString auxResultados = new PilaString(); // aux para filtrados

        while (!estaVacia()) {
            Libro libro = sacar();

            if (libro.autor.equalsIgnoreCase(autorBuscado)) {
                auxResultados.meter(libro);  // se apila al revés
            }

            aux.meter(libro); // restauro después
        }

        // restauro pila original
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        // paso de auxResultados a resultados para recuperar el orden original
        while (!auxResultados.estaVacia()) {
            resultados.meter(auxResultados.sacar());
        }

        return resultados;
    }
}