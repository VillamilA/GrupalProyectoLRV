
// Clase base Vehiculo
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }
}

// Clase derivada Automovil
class Automovil extends Vehiculo {
     int numeroDePuertas;

    public Automovil(String marca, String modelo, int velocidadMaxima, int numeroDePuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }

    public void acelerar() {
        System.out.println("El auto está acelerando.");
    }
}

// Clase derivada Motocicleta
class Motocicleta extends Vehiculo {
     String tipoDeManillar;

    public Motocicleta(String marca, String modelo, int velocidadMaxima, String tipoDeManillar) {
        super(marca, modelo, velocidadMaxima);
        this.tipoDeManillar = tipoDeManillar;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de manillar: " + tipoDeManillar);
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta está acelerando.");
    }
}