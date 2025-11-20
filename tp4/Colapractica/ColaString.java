 public class ColaString {
       private String[] elementos;
       private final int MAX = 30;
       private int fin;
       private int frente;

       public ColaString() {
           elementos = new String[MAX];
           fin = -1;
           frente = 0;

       }

       public boolean estaVacia() {
           return fin == -1;
       }

       public boolean estaLlena() {
           return fin == MAX - 1;
       }

       public void encolar(String e) {
           fin++;
           elementos[fin] = e;
       }

       public String desencolar() {
           String aux = elementos[frente];
           for (int i = 0; i < fin - 1; i++) {
               elementos[i] = elementos[i + 1];
           }
           fin--;
           return aux;
       }

       public String peek() {
           return elementos[frente];
       }

       public ColaString filtrarLlamadas(String palabraClave) {
           ColaString aux = new ColaString();
           ColaString nueva = new ColaString();

           while (!estaVacia()) {
               String palabra = desencolar();

               if (palabra.contains(palabraClave)) { //si un String contiene otro String adentro.
                   nueva.encolar(palabra);
               }

               aux.encolar(palabra);
           }

           while (!aux.estaVacia()) {
               encolar(aux.desencolar());
           }

           return nueva;
       }

       // -----------------------------------


       public ColaString pedidosMayoresA(double minimo){
           ColaString aux = new ColaString();      // cola auxiliar para restaurar
           ColaString pedidos = new ColaString();  // cola con los pedidos filtrados

           while (!estaVacia()){
               Pedido pedido = desencolar();

               if (pedido.getMonto() > minimo){
                   pedidos.encolar(pedido);
               }

               aux.encolar(pedido); // guarda para restaurar
           }

           // restaurar la cola original
           while (!aux.estaVacia()){
               encolar(aux.desencolar());
           }

           return pedidos;
       }





   }
