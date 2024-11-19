package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * La clase abstracta Vehiculo representa la estructura básica de un vehículo dentro del sistema de concesionario 'Tu Carro UQ'.
 * Esta clase define los atributos generales comunes a todos los tipos de vehículos (como marca, modelo, estado, etc.), 
 * y sirve como base para las clases derivadas (por ejemplo, Van, Auto, Moto).
 */
public abstract class Vehiculo {
    // Atributos generales de un vehículo
    private String marca; // Marca del vehículo
    private String estado; // Estado del vehículo (nuevo, usado, etc.)
    private String modelo; // Modelo del vehículo
    private String placa; // Placa de identificación del vehículo
    private int cambios; // Número de cambios o marchas del vehículo
    private double velocidadMaxima; // Velocidad máxima del vehículo
    private double cilindraje; // Cilindraje del motor del vehículo
    private String combustible; // Tipo de combustible que utiliza el vehículo
    private boolean transmisionAutomatica; // Indica si el vehículo tiene transmisión automática

    /**
     * Constructor que inicializa un objeto Vehiculo con los valores proporcionados.
     * 
     * @param marca Marca del vehículo.
     * @param estado Estado del vehículo (nuevo, usado, etc.).
     * @param modelo Modelo del vehículo.
     * @param placa Placa del vehículo.
     * @param cambios Número de cambios o marchas del vehículo.
     * @param velocidadMaxima Velocidad máxima del vehículo.
     * @param cilindraje Cilindraje del motor del vehículo.
     * @param combustible Tipo de combustible que utiliza el vehículo.
     * @param transmisionAutomatica Indica si el vehículo tiene transmisión automática.
     */
    public Vehiculo(String marca, String estado, String modelo, String placa,
                    int cambios, double velocidadMaxima,
                    double cilindraje, String combustible, boolean transmisionAutomatica) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.placa = placa;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
        this.transmisionAutomatica = transmisionAutomatica;
    }

    /**
     * Constructor vacío que crea un objeto Vehiculo sin inicializar sus atributos.
     */
    public Vehiculo() {
    }

    // Métodos getter y setter para acceder y modificar los atributos de un vehículo

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public boolean isTransmisionAutomatica() {
        return transmisionAutomatica;
    }

    public void setTransmisionAutomatica(boolean transmisionAutomatica) {
        this.transmisionAutomatica = transmisionAutomatica;
    }

    /**
     * Representa el objeto Vehiculo como una cadena de texto.
     * 
     * @return La representación en formato string de un Vehiculo.
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", estado=" + estado +
                ", modelo='" + modelo + '\'' +
                ", cambios=" + cambios +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilindraje=" + cilindraje +
                ", combustible='" + combustible + '\'' +
                ", transmisionAutomatica=" + transmisionAutomatica +
                '}';
    }
}
