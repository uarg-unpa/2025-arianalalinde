package tp4.puntostp4;
//p7
public class Mainp7 {
    public static void main(String[] args) {
        Pila P = new Pila();
        Cola C = new Cola(10);

        P.meter(7);
        P.meter(4);
        P.meter(5);
        P.meter(8);
        P.meter(2);
        P.meter(6);

        while (!pila.estaVacia()) {
            int x = pila.sacar();      // mirar el tope y sacarlo.
            if (x % 2 == 0) {
                cola.encolar(x);
            }
        }
        System.out.println("Cola con los pares:");
        while (!cola.estaVacia()) {
            System.out.println(cola.desencolar());
        }
    }
}
