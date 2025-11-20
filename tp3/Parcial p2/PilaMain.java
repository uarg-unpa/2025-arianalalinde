package tp3.Pilavocal;
import java.util.Scanner;

public class PilaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PilaMain pila = new PilaMain();
        PilaMain aux = new PilaMain();

        System.out.println("¿Cuántos caracteres desea ingresar?");
        int cant = sc.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.println("Caracter #" + (i + 1) + ": ");
            char c = sc.next().charAt(0);
            pila.meter(c);
        }

        int contVocales = 0;

        while (!pila.estaVacia()) {
            char c = pila.sacar();
            char lower = Character.toLowerCase(c);  // Convierte el caracter a minúscula

            switch (lower) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contVocales++;
                    break;
            }

            aux.meter(c);
        }

        // Restauro la pila original
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }

        System.out.println("Cantidad de vocales: " + contVocales);
    }
}

