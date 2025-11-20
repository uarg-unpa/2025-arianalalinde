 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer datos de al menos dos teléfonos
        System.out.print("Ingrese la marca del primer teléfono: ");
        String marca1 = sc.nextLine();
        System.out.print("Ingrese el número del primer teléfono: ");
        String numero1 = sc.nextLine();
        System.out.print("Ingrese capacidad de batería (mAh): ");
        int capacidad1 = sc.nextInt();
        System.out.print("Ingrese nivel actual de batería (mAh): ");
        int nivel1 = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        Telefono tel1 = new Telefono(marca1, numero1, new Bateria(capacidad1, nivel1));

        System.out.print("Ingrese la marca del segundo teléfono: ");
        String marca2 = sc.nextLine();
        System.out.print("Ingrese el número del segundo teléfono: ");
        String numero2 = sc.nextLine();
        System.out.print("Ingrese capacidad de batería (mAh): ");
        int capacidad2 = sc.nextInt();
        System.out.print("Ingrese nivel actual de batería (mAh): ");
        int nivel2 = sc.nextInt();
        Telefono tel2 = new Telefono(marca2, numero2, new Bateria(capacidad2, nivel2));

        // Mostrar informes iniciales
        System.out.println("\n--- INFORMES INICIALES ---");
        System.out.println(tel1);
        System.out.println(tel2);

        // Cargar batería de ambos teléfonos
        tel1.cargarBateria(500);
        tel2.cargarBateria(300);

        // Mostrar informes después de cargar
        System.out.println("\n--- INFORMES DESPUÉS DE CARGAR ---");
        System.out.println(tel1);
        System.out.println(tel2);

        sc.close();
    }
}
