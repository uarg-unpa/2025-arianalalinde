public class ColaS {
       private String[] elementos;
       private final int MAX = 30;
       private int fin;
       private int frente;

       public ColaS() {
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


//----------------------------------------------------

       public ColaS filtrarPorLongitud(int minimo){
           ColaS aux = new ColaS();
           ColaS nueva = new ColaS();

           while (!estaVacia()){
               String palabra = desencolar();
                if (palabra.length() >= minimo){
                    nueva.encolar(palabra);
                }

                aux.encolar(palabra);
           }

           while (!aux.estaVacia()){
               encolar(aux.desencolar());
           }

           return nueva;
       }


       public ColaS pedidosMayoresA(double minimo){
           ColaS aux = new ColaS();      // cola auxiliar para restaurar
           ColaS pedidos = new ColaS();  // cola con los pedidos filtrados

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



       public ColaS filtrarPorPrecio(double minimo){
           ColaS aux = new ColaS();
           ColaS nueva = new ColaS();

           while (!estaVacia()){
               Producto precio = desencolar();

               if (precio.getpprecio() > minimo){
                   nueva.encolar(precio);
               }

               aux.encolar(precio);
           }

           while (!aux.estaVacia()){
               encolar(aux.desencolar());
           }

           return nueva;
       }


       public ColaS filtrarPorRemitente(String nombre){
           ColaS aux = new ColaS();
           ColaS nueva = new ColaS();

           while (!estaVacia()){
               Mensaje msj = desencolar();

               if (msj.getRemitente().equalsIgnoreCase(nombre)){
                   nueva.encolar(msj);
               }

               aux.encolar(msj);
           }

           while (!aux.estaVacia()){
               encolar(aux.desencolar());
           }

           return nueva;
       }

       public ColaS turnosLargos(int minDuracion){
           ColaS aux = new ColaS();
           ColaS nueva = new ColaS();

           while (!estaVacia()){
               Turno turno = desencolar();

               if (turno.getduracion() >= minDuracion){
                   nueva.encolar(turno);
               }

               aux.encolar(turno);
           }

           while (!aux.estaVacia()){
               encolar(aux.desencolar());
           }

           return nueva;
       }

   }
