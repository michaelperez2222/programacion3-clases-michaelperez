public class Camion extends Vehiculo implements Cargable {
    private final double capacidadMaximaCarga;
    private double cargaActual;

    public Camion(String codigo, String marca, String modelo, int anio, double velocidadActual, double capacidadMaximaCarga) {
        super(codigo, marca, modelo, anio, velocidadActual);
        this.capacidadMaximaCarga = capacidadMaximaCarga;
        this.cargaActual = 0.0;
    }

    @Override 
    public void conducir() {
        System.out.println("el camion esta conduciendo. ");
    }

    public double getCapacidadMaximaCarga() {
        return capacidadMaximaCarga;
    }

    public double getCargaActual() {
        return cargaActual;
    }
    // Implementacion de la Interfaz Cargable
    @Override 
    public void cargar(double peso) {
        if (cargaActual + peso <= capacidadMaximaCarga) {
            cargaActual += peso;
            System.out.println("se cargaron " + peso + "kg. carga actual: " + cargaActual + "kg.");

        } else {
            System.out.println("ERROR: Excede la capacidad maxima de " + capacidadMaximaCarga + " kg.");      
        }
    }

    @Override 
    public void descargar() {
        System.out.println("Descargando todo el contenido (" + cargaActual + "kg). ");
        cargaActual = 0.0;
    }

    @Override 
    public String toString() {
        return super.toString() + " | Carga Max: " + capacidadMaximaCarga + " kg | Carga Actual: " + cargaActual + " kg "; 
    }
   
}
