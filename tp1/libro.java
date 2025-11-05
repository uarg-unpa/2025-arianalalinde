package tp1;

public class libro {
    private String titulo;
    private String autor;
    private int añopublicacion;
    private int cantidadpaginas;

    public libro (String titulo, String autor, int añopublicacion,int cantidadpaginas);{
        this.titulo = titulo;
        this.autor = autor;
        this.añopublicacion = añopublicacion;
        this.cantidadpaginas = cantidadpaginas;
    }
    public void set titulo (String titulo) {
        this.titulo = titulo; 
    }
    public String get titulo () {
        return this.titulo;
    }
    public boolean es Reciente () {
        boolean resultado;
        if (this.añopublicacion) {
            resultado = true;
        }
        else {
            resultado = false;
        }
        return resultado;
    }
    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public static void main (String args){
        Libro libro1 = new Libro ( "Harry potter", "Chir", 1997, 368);
        Libro libro2 = new Libro ("unlibro", "unautor");
    }

}
