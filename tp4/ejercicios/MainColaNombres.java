package tp4.ejercicios;

import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaNombres cola = new ColaNombres();
        int opcion;

        do {
            System.out.println("\n=== MENÚ COLA DE NOMBRES (Circular) ===");
            System.out.println("1. Encolar nombre");
            System.out.println("2. Desencolar nombre");
            System.out.println("3. Ver nombre en frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (máximo 10 nombres).");
                    } else {
                        System.out.print("Ingrese un nombre: ");
                        String nombre = sc.nextLine().trim();
                        cola.encolar(nombre);
                        System.out.println("Nombre '" + nombre + "' encolado con éxito.");
                    }
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No se puede desencolar.");
                    } else {
                        String desencolado = cola.desencolar();
                        System.out.println("Nombre desencolado: " + desencolado);
                    }
                    break;

                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola está vacía. No hay nombre en el frente.");
                    } else {
                        String frente = cola.peek();
                        System.out.println("Nombre en frente: " + frente);
                    }
                    break;

                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                    } else {
                        System.out.println(cola.toString());
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}