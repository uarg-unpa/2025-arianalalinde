 public class Auto {
    private String patente;
    private String modelo;
    private String color;

    public Auto(String patente, String modelo, String color) {
        this.patente = patente;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Auto [Patente=" + patente + ", Modelo=" + modelo + ", Color=" + color + "]";
    }
}
