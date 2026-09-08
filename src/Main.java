public class Main {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[5];

        flota[0] = new Automovil("A01", "Toyota", "Corolla", 2022, 50.0, 4);
        flota[1] = new Motocicleta("M01", "Honda", "SuperCub", 1990, 90.0, 689);
        flota[2] = new Camion("C01", "Volvo", "FH16", 2021, 40.0, 10000.0);
        flota[3] = new Automovil("A02", "Honda", "Accord", 2024, 0.0, 2);
        flota[4] = new Camion("C02", "Scania", "R500", 2020, 30.0, 15000.0);

        System.out.println("=== RECORRIDO DE LA FLOTA ===");

        for (Vehiculo v : flota) {
            System.out.println("Tipo real: " + v.getClass().getSimpleName());
            System.out.println("Datos: " + v);

            v.conducir();

            if (v instanceof Cargable cargable) {
                System.out.println(
                    "El vehículo [" + v.getCodigo()
                    + "] implementa Cargable."
                );

                cargable.cargar(5000.0);
                cargable.descargar();
            }

            System.out.println("----------------------------------");
        }
    }
}