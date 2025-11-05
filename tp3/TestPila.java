  package tp3;

public class TestPila {
  public static void main (String args[])
  {
    PilaChar miPila=new PilaChar();
    String palabra="programacion";
    for(int i=0;i<palabra.length();i++) //la cantidad de caracteres que tiene la cadena
    {
      if(!miPila.estaLlena())
        miPila.meter(palabra.charAt(i));
      else
        System.out.println("No ingresado "+ palabra.charAt(i)); //carácter que está en la posición i de la cadena.
    }
    while(!miPila.estaVacia())
    {
      System.out.println(miPila.sacar());
    }


  }
}