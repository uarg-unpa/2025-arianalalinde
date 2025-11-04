package tp3.ejercicioNivelEnergia;

import java.util.Scanner;

//Agregar nuevos niveles a la pila.
//Mostrar el nivel que se encuentra en la cima de la pila.
//Pedir al usuario un valor X y contar cuántas veces aparece en la pila.

public class MenuPilaNivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaNivel pila = new PilaNivel();
        int opcion;

        do {
            System.out.println("\n=== MENU DE NIVELES DE ENERGIA ===");
            System.out.println("1. Ingresar niveles de energía");
            System.out.println("2. Mostrar nivel superior");
            System.out.println("3. Contador de nivel repetido");
            System.out.println("4. Mostrar todos los niveles");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (pila.estaLlena()) {
                        System.out.println("Error: la pila está llena.");
                    } else {
                        System.out.print("¿Cuántos niveles desea ingresar? ");
                        int nivel = sc.nextInt();

                        for (int i = 0; i < nivel; i++) {
                            System.out.print("Nivel #" + (i + 1) + ": ");
                            int valor = sc.nextInt();
                            pila.meter(valor);
                        }
                        System.out.println("Niveles cargados correctamente.");
                    }
                    break;

                case 2:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println(" Nivel en la cima de la pila: " + pila.peek());
                    }
                    break;

                case 3:
                    if (pila.estaVacia()) {
                        System.out.println("No hay niveles para comparar.");
                    } else {
                        System.out.print("Ingrese el nivel a buscar: ");
                        int nivelX = sc.nextInt();
                        int contador = pila.ContX(nivelX);
                        System.out.println("El nivel " + nivelX + " aparece " + contador + " veces en la pila.");
                    }
                    break;

                case 4:
                    System.out.println("Niveles de energía actuales:");
                    pila.mostrar();
                    break;

                case 0:
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}