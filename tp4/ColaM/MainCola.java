public class MainCola {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Cola aux = new Cola();

        // Cargar la cola
        cola.encolar('H');
        cola.encolar('o');
        cola.encolar('L');
        cola.encolar('a');

        int contMayu = 0;

        while (!cola.estaVacia()) {
            char letra = cola.desencolar();

            if (letra >= 'A' && letra <= 'Z') {
                contMayu++;
            }

            aux.encolar(letra);
        }

        while (!aux.estaVacia()) {
            cola.encolar(aux.desencolar());
        }

        System.out.println("Cantidad de mayúsculas: " + contMayu);
    }

}