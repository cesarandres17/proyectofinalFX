package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * La clase Sedan representa un vehículo del tipo sedán en el sistema.
 * Un sedán es un tipo de automóvil que cuenta con características específicas, 
 * tales como el número de pasajeros, puertas, capacidad del maletero, 
 * y diversos sistemas de seguridad y confort.
 */
public class Sedan extends Vehiculo {

    // Atributos específicos del sedán
    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private boolean velocidadCrucero;
    private int numeroBolsasAire;
    private boolean abs;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;

    /**
     * Constructor que inicializa los valores de un objeto Sedan con los parámetros proporcionados.
     * 
     * @param marca Marca del vehículo.
     * @param estado Estado del vehículo (por ejemplo, nuevo, usado).
     * @param modelo Modelo del vehículo.
     * @param placa Placa del vehículo.
     * @param cambios Número de cambios de la transmisión.
     * @param velocidadMaxima Velocidad máxima del vehículo.
     * @param cilindraje Cilindraje del motor del vehículo.
     * @param combustible Tipo de combustible del vehículo.
     * @param transmisionAutomatica Indica si el vehículo tiene transmisión automática.
     * @param numeroPasajeros Número de pasajeros que puede transportar el vehículo.
     * @param numeroPuertas Número de puertas del vehículo.
     * @param capacidadMaletero Capacidad del maletero del vehículo.
     * @param aireAcondicionado Indica si el vehículo tiene aire acondicionado.
     * @param camaraReversa Indica si el vehículo tiene cámara de reversa.
     * @param velocidadCrucero Indica si el vehículo tiene control de velocidad crucero.
     * @param numeroBolsasAire Número de bolsas de aire en el vehículo.
     * @param abs Indica si el vehículo tiene sistema de frenos antibloqueo (ABS).
     * @param sensoresColision Indica si el vehículo tiene sensores de colisión.
     * @param sensorTraficoCruzado Indica si el vehículo tiene sensores de tráfico cruzado.
     * @param asistentePermanenciaCarril Indica si el vehículo tiene asistente de permanencia en el carril.
     */
    public Sedan(String marca, String estado, String modelo, String placa,
                 int cambios, double velocidadMaxima, double cilindraje,
                 String combustible, boolean transmisionAutomatica,
                 int numeroPasajeros, int numeroPuertas, double capacidadMaletero,
                 boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, int numeroBolsasAire,
                 boolean abs, boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    /**
     * Constructor vacío de la clase Sedan.
     * Permite la creación de un objeto Sedan sin valores iniciales.
     */
    public Sedan() {
    }

    // Métodos getter y setter para los atributos de la clase Sedan

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

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    /**
     * Representa el objeto Sedan como una cadena de texto.
     * 
     * @return La representación en formato string del sedan.
     */
    @Override
    public String toString() {
        return "Sedan{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", capacidadMaletero=" + capacidadMaletero +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", velocidadCrucero=" + velocidadCrucero +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                ", sensoresColision=" + sensoresColision +
                ", sensorTraficoCruzado=" + sensorTraficoCruzado +
                ", asistentePermanenciaCarril=" + asistentePermanenciaCarril +
                '}';
    }
}
