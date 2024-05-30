public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Genérica", "Model X", 180);
        Automovil miAutomovil = new Automovil("Toyota", "Corolla", 220, 4);
        Motocicleta miMotocicleta = new Motocicleta("Yamaha", "YZF-R3", 180, "Deportivo");

        System.out.println("Informacion del Vehículo:");
        miVehiculo.mostrarInformacion();
        miVehiculo.acelerar();

        System.out.println("\nInformacion del Automóvil:");
        miAutomovil.mostrarInformacion();
        miAutomovil.acelerar();

        System.out.println("\nInformacion de la Motocicleta:");
        miMotocicleta.mostrarInformacion();
        miMotocicleta.acelerar();
    }
}