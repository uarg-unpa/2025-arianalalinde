public class Bateria {
    private int capacidad;
    private int nivelActual;

    // Constructor
    public Bateria(int capacidad, int nivelActual) {
        this.capacidad = capacidad;
        this.nivelActual = nivelActual;
    }

    // Getters y Setters
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        // No permitir que supere la capacidad
        if (nivelActual > capacidad) {
            this.nivelActual = capacidad;
        } else {
            this.nivelActual = nivelActual;
        }
    }

    // Método para cargar batería
    public void cargar(int cantidad) {
        setNivelActual(this.nivelActual + cantidad);
    }

    // Porcentaje de batería
    public int porcentaje() {
        return (nivelActual * 100) / capacidad;
    }

    @Override
    public String toString() {
        return "Batería: " + nivelActual + "/" + capacidad + " mAh (" + porcentaje() + "%)";
    }
}
