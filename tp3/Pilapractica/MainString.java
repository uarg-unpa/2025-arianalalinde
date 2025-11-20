import java.util.Scanner;

public class MainPila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        Pila aux = new Pila();

        System.out.println("¿Cuántas acciones querés apilar?");
        int n = sc.nextInt();
        sc.nextLine();


        //  Apilar varias acciones
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresá la acción #" + (i + 1) + ":");
            String accion = sc.nextLine();
            pila.meter(accion);   // apilo el String
        }

        // Pedir al usuario qué acción quiere contar

        System.out.println("¿Qué acción querés buscar en la pila?");
        String buscada = sc.nextLine();


        // Mostrar cuántas veces aparece

        int veces = pila.contarAcciones(buscada);
        System.out.println("La acción '" + buscada + "' aparece " + veces + " veces en la pila.");
    }


    
}
