public class MainPilaAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaAuto pila = new PilaAuto();
        int opcion;

        do {
            System.out.println("\n=== Menú Pila de Autos ===");
            System.out.println("1. Agregar un auto");
            System.out.println("2. Mostrar auto del tope");
            System.out.println("3. Buscar y eliminar auto por patente");
            System.out.println("4. Cantidad de autos en la pila");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (pila.estaLlena()) {
                        System.out.println("La pila está llena. No se puede agregar más autos.");
                    } else {
                        System.out.print("Patente: ");
                        String patente = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Color: ");
                        String color = sc.nextLine();

                        Auto auto = new Auto(patente, modelo, color);
                        pila.meter(auto);
                        System.out.println("Auto agregado correctamente.");
                    }
                    break;

                case 2:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("Auto en el tope:");
                        System.out.println(pila.peek());
                    }
                    break;

                case 3:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.print("Ingrese la patente del auto a eliminar: ");
                        String buscarPatente = sc.nextLine();
                        Auto encontrado = pila.buscarYEliminar(buscarPatente);
                        if (encontrado != null) {
                            System.out.println("Auto eliminado:");
                            System.out.println(encontrado);
                        } else {
                            System.out.println("No se encontró ningún auto con esa patente.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Cantidad de autos en la pila: " + pila.cantidad());
                    break;

                case 0:
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
