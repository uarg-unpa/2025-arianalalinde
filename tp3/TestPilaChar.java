 package tp3;

public class TestPilaChar {
  public static void main (String args[])
  {
    PilaChar miPila=new PilaChar();
    String palabra="programacion";
    for(int i=0;i<palabra.length();i++)
    {
      if(!miPila.estaLlena())
        miPila.meter(palabra.charAt(i));
      else
        System.out.println("No ingresado "+palabra.charAt(i));
    }
    while(!miPila.estaVacia())
    {
      System.out.println(miPila.sacar());
    }


  }
}