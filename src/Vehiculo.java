public abstract class Vehiculo {
    private String Codigo;
    private String Marca;
    private String Modelo;
    private int Anio;
    private double VelocidadActual;

 public Vehiculo(String Codigo, String Marca, String Modelo, int Anio, double VelocidadActual){
 this.Codigo = Codigo;
 this.Marca = Marca;
 this.Modelo = Modelo;
 this.Anio = Anio;
 this.VelocidadActual = VelocidadActual;
 }

 // Metodo abastracto para las clases hijas 
 public abstract void conducir();

 // Getters y Setters (Encapsulamiento)
 public String getCodigo(){ return Codigo;}
 public void setCodigo(String Codigo) {this.Codigo = Codigo;}

 public String getMarca(){ return Marca;}
 public void setMarca(String Marca) {this.Marca = Marca;}

 public String getModelo(){ return Modelo;}
 public void setModelo(String Modelo) {this.Modelo = Modelo;}

 public int getAnio(){ return Anio;}
 public void setAnio (int Anio) {this.Anio = Anio;}

 public double getVelocidadActual(){ return VelocidadActual;}
 public void setVelocidadActual (double VelocidadActual) {this.VelocidadActual = VelocidadActual;}

 @Override 
 public String toString() {
    return "Codigo: " + Codigo + " | Marca: " + Marca + " | Modelo: " + Modelo + " | Año: " + Anio + " | Velocidad: " + VelocidadActual + " km/h";
 }

 

 







































    
}
 
 



