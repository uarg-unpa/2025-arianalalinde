import java.util.Scanner;

class TrabajoPractico1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, R1, X, C2;
        double C, D, R2, Y;

        // punto 1

        A = 5;
        B = 3;
        C = 2.5;
        D = 2.0;

        R1 = A / B;
        System.out.println("R1 = A / B = " + R1);

        R2 = A / C;
        System.out.println("R2 = A / C = " + R2);

        R2 = A * D;
        System.out.println("R2 = A * D = " + R2);

        R1 = A * (int) D;
        System.out.println("R1 = A * (Int) D = " + R1);

        R1 = (int) (C * D);
        System.out.println("(Int) (C * D = " + R1);

        R1 = A * (int) D;
        System.out.println("R1= A * (Int) D = " + R1);

        A++;
        System.out.println("A++ A = " + A);

        B = A++;
        System.out.println("B = A++ B = " + B + " , A = " + A);

        // punto 2

        A = 5;
        B = 3;
        C = 7.5;

        X = A / B;
        System.out.println("Ej.2 - A / B = " + X);

        X = (int) (A * D) / (int) (C / A);
        System.out.println("Ej.2 - (int) (A * D) / (int) (C / A) = " + X);

        Y = (double) A / B;
        System.out.println("EJ.2 - (double) A / B = " + Y);

        Y = (double) A * D / (int) C;
        System.out.println("Ej.2 - (double) A * D (int) C = " + Y);

        Y = (double) A * D;
        System.out.println("Ej.2 - (double) A * D = " + Y);

        Y = (double) (A * D) / (C * (int) D);
        System.out.println("Ej.2 - (double) (A * D) / ( C * (int) D) = " + Y);

        Y = A * (int) D;
        System.out.println("Ej.2 -  A * (int) D = " + Y);

        System.out.println("Ej.2 - (int) (A * (int) D) = " + (int) (A * (int) D));

        //punto 3

        A = 1;
        B = 2;
        C2 = 3;
        int aux;

        System.out.println("Antes del intercambio:");
        System.out.println("A = " + A + ", B = " + B + ", C2 = " + C2);

        aux = A;
        B = A;
        C2 = aux;
        A = 3;

        System.out.println("Despues del intercambio");
        System.out.println("A =" + A + ", B = " + B + ", C2 =" + C2);

        //punto 4- num mayor

        int NRO1, NRO2, NRO3;

        System.out.println("Ingrese 3 numeros enteros");
        NRO1 = sc.nextInt();
        NRO2 = sc.nextInt();
        NRO3 = sc.nextInt();

        if (NRO1 > NRO2 && NRO2 > NRO3) {
            System.out.println("el mayor es: " + NRO1);
        } else if (NRO2 > NRO1 && NRO2 > NRO3) {
            System.out.println("El mayor es: " + NRO2);
        } else {
            System.out.println("El mayor es: " + NRO3);
        }

        // punto 5

        System.out.print("Ingrese un día (L, M, I, J, V, S, D): ");
        String dia = sc.next().toUpperCase();

        if (dia.equals("I") || dia.equals("J") || dia.equals("V")) {
            System.out.println("HOY TENGO RESOLUCION");
        } else if (dia.equals("L") || dia.equals("M") || dia.equals("S") || dia.equals("D")) {
            System.out.println("Hoy no tengo resolución");
        } else {
            System.out.println("Día inválido");
        }

        // ej 6.1

        int NUM1 = sc.nextInt();
        int NUM2 = sc.nextInt();
        int NUM3 = sc.nextInt();

        System.out.print("Ingrese el primer numero");
        {
            NUM1 = sc.nextInt();
        }
        System.out.print("Ingrese el segundo numero");
        {
            NUM2 = sc.nextInt();
        }
        System.out.print("Ingrese el tercer numero");
        {
            NUM3 = sc.nextInt();
        }

        int SUMA = NUM1 + NUM2 + NUM3;
        int PRODUCTO = NUM1 * NUM2 * NUM3;

        System.out.println("Suma de enteros:" + SUMA);
        System.out.println("Productos de entero:" + PRODUCTO);

        int SUMA2 = 0;
        int PRODUCTO2 = 1;
        int NUM;

        for (int i = 1; i <= 3; i++) ;
        {
            System.out.print("Ingrese un número: ");
            NUM = sc.nextInt();
            SUMA2 += NUM;
            PRODUCTO2 *= NUM;
        }
        System.out.print("Suma de enteros (una variable): " + SUMA2);
        System.out.println("Producto de entero (de una variable): 6" + PRODUCTO2);

        sc.close();

    }
}