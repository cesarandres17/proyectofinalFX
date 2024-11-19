package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * La clase Van representa un vehículo tipo Van dentro del sistema del concesionario 'Tu Carro UQ'.
 * Esta clase hereda de la clase abstracta Vehiculo y agrega atributos específicos de una Van, 
 * tales como la capacidad de pasajeros, las puertas, la capacidad del maletero y los sistemas de seguridad.
 */
public class Van extends Vehiculo {
    // Atributos específicos de la clase Van
    private int numeroPasajeros; // Número de pasajeros que puede transportar la Van
    private int numeroPuertas; // Número de puertas de la Van
    private double capacidadMaletero; // Capacidad del maletero en litros
    private boolean aireAcondicionado; // Indica si la Van tiene aire acondicionado
    private boolean camaraReversa; // Indica si la Van tiene cámara de reversa
    private int numeroBolsasAire; // Número de bolsas de aire para seguridad
    private boolean abs; // Indica si la Van cuenta con sistema de frenos ABS (Antibloqueo)

    /**
     * Constructor que inicializa un objeto Van con los valores proporcionados.
     * 
     * @param marca Marca de la Van.
     * @param estado Estado del vehículo (nuevo, usado, etc.).
     * @param modelo Modelo de la Van.
     * @param placa Placa del vehículo.
     * @param cambios Número de cambios o marchas.
     * @param velocidadMaxima Velocidad máxima de la Van.
     * @param cilindraje Cilindraje del motor.
     * @param combustible Tipo de combustible que utiliza la Van.
     * @param transmisionAutomatica Indica si la transmisión es automática.
     * @param numeroPasajeros Número de pasajeros que la Van puede transportar.
     * @param numeroPuertas Número de puertas que tiene la Van.
     * @param capacidadMaletero Capacidad del maletero en litros.
     * @param aireAcondicionado Indica si la Van tiene aire acondicionado.
     * @param camaraReversa Indica si la Van tiene cámara de reversa.
     * @param numeroBolsasAire Número de bolsas de aire de la Van.
     * @param abs Indica si la Van tiene sistema de frenos ABS.
     */
    public Van(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas,
               double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean abs) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
    }

    // Métodos getter y setter para los atributos de la clase Van

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Representa el objeto Van como una cadena de texto.
     * 
     * @return La representación en formato string de la Van.
     */
    @Override
    public String toString() {
        return "Van{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", capacidadMaletero=" + capacidadMaletero +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                '}';
    }
}
