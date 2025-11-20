public class PilaS {
    private String[] elementos;
    private int cima;
    private final int MAX = 20; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaS() {
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

// -------------------------------------------

    public boolean contieneComando(String comando){
        PilaS aux = new PilaS();
        boolean encontrado = false;

        while (!estaVacia()) {
            String palabra = sacar();

            if (palabra.equals(comando)) {
                encontrado = true;   // encuentro, pero no se devuelve todavía
            }

            aux.meter(palabra);
        }

        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }

        return encontrado;  // ahora sí devolvemos
    }



    public PilaS filtrarPorAutor(String autorBuscado) {
        PilaS aux = new PilaS();     // para la original
        PilaS resultados = new PilaS(); // guardo filtrados
        PilaS auxResultados = new PilaS(); // aux para filtrados

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

    public int contarAprobados(){
        PilaS aux = new PilaS();
        int contApro = 0;

        while (!estaVacia()){
            Alumno nota = sacar();

            if (nota.getnota() >= 6){
                contApro++;
            }

            aux.meter(nota);
        }

        while (!aux.estaVacia()){
            meter(aux.sacar());
        }

        return contApro;
    }
}