// Clase principal para probar la jerarquía
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Genérica", "Model X", 180);
        Automovil miAutomovil = new Automovil("Toyota", "Corolla", 220, 4);
        Motocicleta miMotocicleta = new Motocicleta("Yamaha", "YZF-R3", 180, "Deportivo");

        System.out.println("Información del Vehículo:");
        miVehiculo.mostrarInformacion();
        miVehiculo.acelerar();

        System.out.println("\nInformación del Automóvil:");
        miAutomovil.mostrarInformacion();
        miAutomovil.acelerar();

        System.out.println("\nInformación de la Motocicleta:");
        miMotocicleta.mostrarInformacion();
        miMotocicleta.acelerar();
    }
}
