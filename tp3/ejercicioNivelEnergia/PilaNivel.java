package tp3.ejercicioNivelEnergia;
//.
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


  public void meter(int e) {
    cima++;
    nivelEnergia[cima] = e;
}


    public int sacar() {
       int aux = nivelEnergia[cima];
       cima--;
       return aux;
    }

    public int contX(int x){
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
