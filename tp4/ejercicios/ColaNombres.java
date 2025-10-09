package tp4.ejercicios;

public class ColaNombres {
    private String[] elementos; 
    private int frente;         
    private int fin;            
    private int cantidad;       
    private final int MAX = 10; 

    public ColaNombres() {
        elementos = new String[MAX];
        frente = 0;
        fin = 0;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == MAX;
    }

    public void encolar(String nombre) {
        elementos[fin] = nombre;               
        fin = (fin + 1) % MAX;                
        cantidad++;                             
    }

    public String desencolar() {
        String aux = elementos[frente];        
        frente = (frente + 1) % MAX;           
        cantidad--;                            
        return aux;                           
    }

    public String peek() {
        if (!estaVacia()) {
            return elementos[frente];          
        }
        return null;
    }

    @Override
    public String toString() {
        String texto = "Cola de nombres:";
        if (estaVacia()) {
            texto = texto + "(vacía)";
        } else {
            for (int i = 0; i < cantidad; i++) {
                int indice = (frente + i) % MAX;
                texto = texto + elementos[indice];
            }
        }
        return texto;
    }
}