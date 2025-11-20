package tp3.Pilavocal;

public class Pmain {
    public static void main(String[] args) {
        Pmain pila = new Pmain();
        Pmain aux = new Pmain();
        String palabra = "Lagartija";


        for (int i = 0; i < palabra.length(); i++) {
            pila.meter(palabra.charAt(i));
        }

        int contVocal = 0;

        // Contar vocales y pasar elementos al auxiliar
        while (!pila.estaVacia()) {
            char letra = pila.sacar();
            aux.meter(letra);

            char letraMinus = Character.toLowerCase(letra);
            if (letraMinus == 'a' || letraMinus == 'e' || letraMinus == 'i' ||
                    letraMinus == 'o' || letraMinus == 'u') {
                contVocal++;
            }
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }

        System.out.println("Cantidad de vocales: " + contVocal);
    }
}