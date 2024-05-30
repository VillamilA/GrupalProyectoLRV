public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Genérica", "Model X", 180);

        System.out.println("Informacion del Vehículo:");
        miVehiculo.mostrarInformacion();
        miVehiculo.acelerar();
    }
}