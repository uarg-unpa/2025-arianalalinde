import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        Pila aux = new Pila();


        System.out.println("Cuantos niveles desea ingresar");
        int elem = sc.nextInt();

        for (int i = 0; i < elem; i++) {
            System.out.println("Nivel # " + (i + 1) + " ");
            int valor = sc.nextInt();
            pila.meter(valor);
        }

        int cont50 = 0;

        while (!pila.estaVacia()) {
            int num = pila.sacar();
            aux.meter(num);
            if (num > 50) {
                cont50++;
            }
        }

        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }

        System.out.println("Numeros mayores a 50: " + cont50);


        //------------------------

        

        int contNega = 0;

        Pila auxi = new Pila();
        while (!pila.estaVacia()) {
            int num = pila.sacar();

            if (num < 0) {
                contNega++;
            }

            auxi.meter(num);
        }

        while (!auxi.estaVacia()) {
            pila.meter(auxi.sacar());
        }
        System.out.println("La cantidad de numeros negativos son: " + contNega);


        // ---------------------------------------------



        Pila P = new Pila();
        Pila aux1 = new Pila();

        String palabra = "Lagartija";

        // Cargar la pila
        for (int i = 0; i < palabra.length(); i++) {
            P.meter(palabra.charAt(i));
        }

        int contConsonantes = 0;

        // Contar consonantes
        while (!P.estaVacia()) {
            char letra = P.sacar();
            aux.meter(letra);

            char c = Character.toLowerCase(letra); // paso a minúscula para comparar más fácil

            // Vocales: a, e, i, o, u, todo lo demás es consonante, por eso ! distinto
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                contConsonantes++;
            }
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            P.meter(aux.sacar());
        }

        System.out.println("Cantidad de consonantes: " + contConsonantes);




        // --------------------------



        Pila p = new Pila();
        Pila auxiliar = new Pila();


        String palabra = "aB3d9@f0X";
        for (int i = 0; i < palabra.length(); i++) {
            p.meter(palabra.charAt(i));
        }

        int contDigitos = 0;

        while (!p.estaVacia()) {
            char c = p.sacar();

            // Comparación clásica sin usar métodos especiales
            if (c >= '0' && c <= '9') {
                contDigitos++;
            }

            aux.meter(c);
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            P.meter(aux.sacar());
        }

        System.out.println("Cantidad de dígitos: " + contDigitos);   



        // ------------------------------

        int contMinu = 0;

        while (!p.estaVacia()) {
            char c = p.sacar();

            //
            if (c >= 'a' && c <= 'z') {
                contMinu++;
            }

            aux.meter(c);
        }

        // Restaurar la pila original
        while (!aux.estaVacia()) {
            P.meter(aux.sacar());
        }

        System.out.println("Cantidad de minusculas: " + contMinu);



        Pila pilaa = new Pila();
        Pila auxili = new Pila();
        int cont = 0;
        int suma = 0;
        int mayorAlPro = 0;
        double promedio;

        while (!pilaa.estaVacia()){
            int valor = pilaa.sacar();
            cont++;
            suma = suma + valor;
            auxili.meter(valor);
        }

        promedio = (double) suma / cont;

        while (!auxili.estaVacia()){
            int valor = auxili.sacar();

            if (valor > promedio){
                mayorAlPro++;
            }

            pilaa.meter(valor);
        }


        System.out.println("Valores mayores al promedio: " + mayorAlPro);


    }
}