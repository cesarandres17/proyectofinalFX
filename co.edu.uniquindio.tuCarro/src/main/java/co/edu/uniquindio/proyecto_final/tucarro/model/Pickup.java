package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * La clase Pickup extiende de la clase Vehiculo y representa un vehículo de tipo 
 * camioneta con características adicionales específicas, como capacidad de carga,
 * número de puertas, número de pasajeros y otros atributos relacionados con su equipamiento.
 */
public class Pickup extends Vehiculo {
    
    // Atributos específicos de la clase Pickup
    private int numeroPasajeros;        // Número de pasajeros que puede transportar el vehículo.
    private int numeroPuertas;          // Número de puertas del vehículo.
    private boolean aireAcondicionado;  // Indica si el vehículo tiene aire acondicionado.
    private boolean camaraReversa;      // Indica si el vehículo tiene cámara de reversa.
    private int numeroBolsasAire;      // Número de bolsas de aire que posee el vehículo.
    private boolean abs;               // Indica si el vehículo tiene sistema de frenos ABS.
    private boolean esCuatroPorCuatro; // Indica si el vehículo es de tracción 4x4.
    private double capacidadCajaCarga; // Capacidad de la caja de carga en metros cúbicos.

    /**
     * Constructor parametrizado de la clase Pickup.
     * Permite inicializar los atributos del vehículo con valores específicos.
     *
     * @param marca                Marca del vehículo.
     * @param estado               Estado del vehículo.
     * @param modelo               Modelo del vehículo.
     * @param placa                Placa del vehículo.
     * @param cambios              Número de cambios o marchas del vehículo.
     * @param velocidadMaxima      Velocidad máxima del vehículo.
     * @param cilindraje           Cilindraje del vehículo.
     * @param combustible          Tipo de combustible utilizado por el vehículo.
     * @param transmisionAutomatica Indica si la transmisión es automática.
     * @param numeroPasajeros      Número de pasajeros que puede transportar.
     * @param numeroPuertas        Número de puertas del vehículo.
     * @param aireAcondicionado    Indica si tiene aire acondicionado.
     * @param camaraReversa        Indica si tiene cámara de reversa.
     * @param numeroBolsasAire     Número de bolsas de aire del vehículo.
     * @param abs                  Indica si tiene sistema de frenos ABS.
     * @param esCuatroPorCuatro    Indica si es de tracción 4x4.
     * @param capacidadCajaCarga   Capacidad de la caja de carga del vehículo.
     */
    public Pickup(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean abs, boolean esCuatroPorCuatro, double capacidadCajaCarga) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.esCuatroPorCuatro = esCuatroPorCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Constructor por defecto de la clase Pickup.
     * Permite crear una instancia sin necesidad de inicializar atributos al momento de la creación.
     */
    public Pickup() {

    }

    // Métodos Getter y Setter para acceder y modificar los atributos de la clase Pickup

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

    public boolean isEsCuatroPorCuatro() {
        return esCuatroPorCuatro;
    }

    public void setEsCuatroPorCuatro(boolean esCuatroPorCuatro) {
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Método toString que genera una representación en texto de la instancia Pickup.
     *
     * @return Una cadena que representa los valores de los atributos de la Pickup.
     */
    @Override
    public String toString() {
        return "Pickup{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                ", esCuatroPorCuatro=" + esCuatroPorCuatro +
                ", capacidadCajaCarga=" + capacidadCajaCarga +
                '}';
    }
}
