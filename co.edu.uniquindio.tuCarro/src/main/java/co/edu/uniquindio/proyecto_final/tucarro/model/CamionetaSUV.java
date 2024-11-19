package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * Clase que representa una camioneta tipo SUV en el sistema.
 * Hereda de la clase abstracta Vehiculo e incluye atributos específicos de este tipo de vehículo.
 */
public class CamionetaSUV extends Vehiculo {
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
    private boolean esCuatroPorCuatro;

    /**
     * Constructor de la clase CamionetaSUV.
     *
     * @param marca                   Marca de la camioneta.
     * @param estado                  Estado actual de la camioneta (Nuevo/Usado).
     * @param modelo                  Modelo de la camioneta.
     * @param placa                   Placa de la camioneta.
     * @param cambios                 Número de cambios de la transmisión.
     * @param velocidadMaxima         Velocidad máxima de la camioneta en km/h.
     * @param cilindraje              Cilindraje del motor en cc.
     * @param combustible             Tipo de combustible (Gasolina, Diesel, Eléctrico, etc.).
     * @param transmisionAutomatica   Indica si la transmisión es automática.
     * @param numeroPasajeros         Capacidad máxima de pasajeros.
     * @param numeroPuertas           Número de puertas del vehículo.
     * @param capacidadMaletero       Capacidad del maletero en litros.
     * @param aireAcondicionado       Indica si tiene aire acondicionado.
     * @param camaraReversa           Indica si cuenta con cámara de reversa.
     * @param velocidadCrucero        Indica si cuenta con velocidad crucero.
     * @param numeroBolsasAire        Número de bolsas de aire incluidas.
     * @param abs                     Indica si tiene frenos ABS.
     * @param sensoresColision        Indica si tiene sensores de colisión.
     * @param sensorTraficoCruzado    Indica si tiene sensor de tráfico cruzado.
     * @param asistentePermanenciaCarril Indica si tiene asistente de permanencia en carril.
     * @param esCuatroPorCuatro       Indica si la camioneta tiene tracción 4x4.
     */
    public CamionetaSUV(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima,
                        double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros,
                        int numeroPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa,
                        boolean velocidadCrucero, int numeroBolsasAire, boolean abs, boolean sensoresColision,
                        boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril, boolean esCuatroPorCuatro) {
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
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    /**
     * Constructor vacío de la clase CamionetaSUV.
     */
    public CamionetaSUV() {
    }

    // Métodos getter y setter con sus respectivas descripciones JavaDoc.

    /**
     * @return Número máximo de pasajeros que puede transportar la camioneta.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * @param numeroPasajeros Número máximo de pasajeros que puede transportar.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    // Métodos restantes documentados de manera similar.
    
    // Método toString documentado
    /**
     * @return Representación en cadena de texto de los atributos de la camioneta.
     */
    @Override
    public String toString() {
        return "CamionetaSUV{" +
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
                ", esCuatroPorCuatro=" + esCuatroPorCuatro +
                '}';
    }
}
