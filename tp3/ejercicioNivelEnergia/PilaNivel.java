package tp3.ejercicioNivelEnergia;

public class PilaNivel {
    private int MAX = 30;
    private int[] nivelEnergia;
    private int cima;

    public PilaNivel() {
        nivelEnergia = new int[MAX];
        cima = -1;
    } 

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public void mostrar() {
    if (estaVacia()) {
        System.out.println("Pila vacía");
    } else {
        PilaNivel auxVer = new PilaNivel();
        while (!estaVacia()) {
            int ver = sacar(); // saco del tope
            System.out.println(ver);
            auxVer.meter(ver);
        }
        // Restaurar la pila
        while (!auxVer.estaVacia()) {
            meter(auxVer.sacar());
        }
    }
}


    public void meter(int e) {
        if (!estaLlena()) {
            cima++;
            nivelEnergia[cima] = e;
        }
    }

    public int sacar() {
        if (!estaVacia()) {
            int aux = nivelEnergia[cima];
            cima--;
            return aux;
        } else {
            return -1;
        }
    }

    public int ContX(int x){
        int contador = 0;
        PilaNivel Aux = new PilaNivel();

        while (!estaVacia()){
            int valorX = this.sacar();
            if (valorX == x){
                contador++;
            }
            Aux.meter(valorX);
        }
        while (!Aux.estaVacia()){
            this.meter(Aux.sacar());
        }
        return contador;
    }

    public int peek(){
        if (!estaVacia()) {
            return nivelEnergia[cima];
        } else {
            return -1;
        }
    }
}
