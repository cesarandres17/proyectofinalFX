package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * Clase que representa un vehículo deportivo en el sistema.
 * Hereda de la clase abstracta Vehiculo e incluye características específicas de un automóvil deportivo.
 */
public class Deportivo extends Vehiculo {

    /**
     * Número máximo de pasajeros que puede transportar el deportivo.
     */
    private int numeroPasajeros;

    /**
     * Número de puertas del deportivo.
     */
    private int numeroPuertas;

    /**
     * Número de bolsas de aire que tiene el deportivo.
     */
    private int numeroBolsasAire;

    /**
     * Cantidad de caballos de fuerza que produce el deportivo.
     */
    private double caballosFuerza;

    /**
     * Tiempo en segundos que tarda el deportivo en acelerar de 0 a 100 km/h.
     */
    private double tiempoCienKmh;

    /**
     * Constructor parametrizado para inicializar un vehículo deportivo con todos sus atributos.
     *
     * @param marca                Marca del vehículo.
     * @param estado               Estado del vehículo (nuevo, usado, etc.).
     * @param modelo               Modelo del vehículo.
     * @param placa                Placa del vehículo.
     * @param cambios              Número de cambios que tiene el vehículo.
     * @param velocidadMaxima      Velocidad máxima que puede alcanzar el vehículo (en km/h).
     * @param cilindraje           Cilindraje del motor del vehículo.
     * @param combustible          Tipo de combustible utilizado (gasolina, diésel, eléctrico, etc.).
     * @param transmisionAutomatica Indica si el vehículo tiene transmisión automática.
     * @param numeroPasajeros      Número máximo de pasajeros que puede transportar el deportivo.
     * @param numeroPuertas        Número de puertas del deportivo.
     * @param numeroBolsasAire     Número de bolsas de aire del deportivo.
     * @param caballosFuerza       Caballos de fuerza del deportivo.
     * @param tiempoCienKmh        Tiempo en segundos para alcanzar los 100 km/h.
     */
    public Deportivo(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, double caballosFuerza, double tiempoCienKmh) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoCienKmh = tiempoCienKmh;
    }

    /**
     * Constructor vacío para crear un objeto Deportivo con valores predeterminados.
     */
    public Deportivo() {
    }

    /**
     * @return Número máximo de pasajeros que puede transportar el deportivo.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * @param numeroPasajeros Número máximo de pasajeros que puede transportar el deportivo.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * @return Número de puertas del deportivo.
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * @param numeroPuertas Número de puertas del deportivo.
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * @return Número de bolsas de aire del deportivo.
     */
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    /**
     * @param numeroBolsasAire Número de bolsas de aire del deportivo.
     */
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /**
     * @return Cantidad de caballos de fuerza que produce el deportivo.
     */
    public double getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * @param caballosFuerza Cantidad de caballos de fuerza que produce el deportivo.
     */
    public void setCaballosFuerza(double caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    /**
     * @return Tiempo en segundos que tarda el deportivo en acelerar de 0 a 100 km/h.
     */
    public double getTiempoCienKmh() {
        return tiempoCienKmh;
    }

    /**
     * @param tiempoCienKmh Tiempo en segundos que tarda el deportivo en acelerar de 0 a 100 km/h.
     */
    public void setTiempoCienKmh(double tiempoCienKmh) {
        this.tiempoCienKmh = tiempoCienKmh;
    }

    /**
     * @return Representación en cadena de texto del objeto Deportivo.
     */
    @Override
    public String toString() {
        return "Deportivo{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", caballosFuerza=" + caballosFuerza +
                ", tiempoCienKmh=" + tiempoCienKmh +
                '}';
    }
}
