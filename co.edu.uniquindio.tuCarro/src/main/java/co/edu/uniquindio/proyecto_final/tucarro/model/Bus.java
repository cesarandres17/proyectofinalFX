package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * Clase que representa un autobús dentro del sistema de concesionario "Tu Carro UQ".
 * Extiende la clase abstracta Vehiculo e incluye atributos específicos para un bus.
 */
public class Bus extends Vehiculo {

    // Número máximo de pasajeros que el bus puede transportar.
    private int numeroPasajeros;

    // Cantidad de puertas disponibles en el bus.
    private int numeroPuertas;

    // Capacidad del maletero en litros.
    private double capacidadMaletero;

    // Indica si el bus tiene aire acondicionado.
    private boolean aireAcondicionado;

    // Indica si el bus tiene cámara de reversa.
    private boolean camaraReversa;

    // Cantidad de bolsas de aire disponibles en el bus.
    private int numeroBolsasAire;

    // Indica si el bus tiene frenos ABS.
    private boolean abs;

    // Número de ejes del bus.
    private int numeroEjes;

    // Número de salidas de emergencia disponibles en el bus.
    private int numeroSalidasEmergencia;

    /**
     * Constructor de la clase Bus.
     *
     * @param marca                Marca del bus.
     * @param estado               Estado del bus (nuevo o usado).
     * @param modelo               Modelo del bus.
     * @param placa                Placa del bus.
     * @param cambios              Número de cambios disponibles.
     * @param velocidadMaxima      Velocidad máxima del bus en km/h.
     * @param cilindraje           Cilindraje del motor en cm³.
     * @param combustible          Tipo de combustible utilizado (gasolina, diésel, etc.).
     * @param transmisionAutomatica Indica si el bus tiene transmisión automática.
     * @param numeroPasajeros      Capacidad máxima de pasajeros.
     * @param numeroPuertas        Cantidad de puertas del bus.
     * @param capacidadMaletero    Capacidad del maletero en litros.
     * @param aireAcondicionado    Indica si tiene aire acondicionado.
     * @param camaraReversa        Indica si tiene cámara de reversa.
     * @param numeroBolsasAire     Número de bolsas de aire.
     * @param abs                  Indica si tiene frenos ABS.
     * @param numeroEjes           Número de ejes del bus.
     * @param numeroSalidasEmergencia Número de salidas de emergencia.
     */
    public Bus(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima,
               double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros,
               int numeroPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa,
               int numeroBolsasAire, boolean abs, int numeroEjes, int numeroSalidasEmergencia) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Obtiene el número de pasajeros.
     * 
     * @return Número de pasajeros.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Establece el número de pasajeros.
     * 
     * @param numeroPasajeros Número de pasajeros.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Obtiene el número de puertas.
     * 
     * @return Número de puertas.
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Establece el número de puertas.
     * 
     * @param numeroPuertas Número de puertas.
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Obtiene la capacidad del maletero.
     * 
     * @return Capacidad del maletero en litros.
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Establece la capacidad del maletero.
     * 
     * @param capacidadMaletero Capacidad del maletero en litros.
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Verifica si el bus tiene aire acondicionado.
     * 
     * @return True si tiene aire acondicionado, false de lo contrario.
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Establece si el bus tiene aire acondicionado.
     * 
     * @param aireAcondicionado True si tiene aire acondicionado, false de lo contrario.
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Verifica si el bus tiene cámara de reversa.
     * 
     * @return True si tiene cámara de reversa, false de lo contrario.
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Establece si el bus tiene cámara de reversa.
     * 
     * @param camaraReversa True si tiene cámara de reversa, false de lo contrario.
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /**
     * Obtiene el número de bolsas de aire.
     * 
     * @return Número de bolsas de aire.
     */
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    /**
     * Establece el número de bolsas de aire.
     * 
     * @param numeroBolsasAire Número de bolsas de aire.
     */
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /**
     * Verifica si el bus tiene frenos ABS.
     * 
     * @return True si tiene frenos ABS, false de lo contrario.
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Establece si el bus tiene frenos ABS.
     * 
     * @param abs True si tiene frenos ABS, false de lo contrario.
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Obtiene el número de ejes.
     * 
     * @return Número de ejes.
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Establece el número de ejes.
     * 
     * @param numeroEjes Número de ejes.
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Obtiene el número de salidas de emergencia.
     * 
     * @return Número de salidas de emergencia.
     */
    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    /**
     * Establece el número de salidas de emergencia.
     * 
     * @param numeroSalidasEmergencia Número de salidas de emergencia.
     */
    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Representación en cadena de la clase Bus.
     * 
     * @return Información detallada del bus.
     */
    @Override
    public String toString() {
        return "Bus{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", capacidadMaletero=" + capacidadMaletero +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                ", numeroEjes=" + numeroEjes +
                ", numeroSalidasEmergencia=" + numeroSalidasEmergencia +
                '}';
    }
}
