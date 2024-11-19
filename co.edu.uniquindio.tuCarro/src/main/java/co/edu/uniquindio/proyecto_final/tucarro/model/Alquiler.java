package co.edu.uniquindio.proyecto_final.tucarro.model;

import java.time.LocalDate;

/**
 * Clase que representa un alquiler de un vehículo en el sistema.
 * Contiene información sobre el vehículo, el cliente que realiza el alquiler,
 * el empleado que gestiona la transacción, las fechas de inicio y fin, 
 * y el precio del alquiler por día, así como el total calculado.
 */
public class Alquiler {

    private int idAlquiler;  // Identificador único del alquiler
    private Vehiculo vehiculo;  // Vehículo que se alquila
    private Cliente cliente;  // Cliente que realiza el alquiler
    private Empleado empleado;  // Empleado que gestiona el alquiler
    private double precioPorDia;  // Precio del alquiler por día
    private LocalDate fechaInicio;  // Fecha de inicio del alquiler
    private LocalDate fechaFin;  // Fecha de fin del alquiler
    private double total;  // Total del alquiler (precioPorDia * número de días)

    /**
     * Constructor vacío de la clase Alquiler.
     * Inicializa un objeto Alquiler sin valores predefinidos.
     */
    public Alquiler(){

    }

    /**
     * Constructor de la clase Alquiler con parámetros específicos.
     * 
     * @param idAlquiler El identificador único del alquiler.
     * @param vehiculo El vehículo que se alquila.
     * @param cliente El cliente que realiza el alquiler.
     * @param empleado El empleado que gestiona el alquiler.
     * @param precioPorDia El precio del alquiler por día.
     * @param fechaInicio La fecha de inicio del alquiler.
     * @param fechaFin La fecha de fin del alquiler.
     * @param total El total calculado del alquiler (precioPorDia * duración).
     */
    public Alquiler(int idAlquiler, Vehiculo vehiculo, Cliente cliente, Empleado empleado, double precioPorDia, LocalDate fechaInicio, LocalDate fechaFin, Double total) {
        this.idAlquiler = idAlquiler;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.precioPorDia = precioPorDia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.total = total;
    }

    // Métodos getter y setter para cada atributo
    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Representación en formato de cadena del objeto Alquiler.
     * Devuelve una cadena con la información del alquiler.
     *
     * @return Una cadena que representa el objeto Alquiler.
     */
    @Override
    public String toString() {
        return "Alquiler{" +
                "idAlquiler=" + idAlquiler +
                ", vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", empleado=" + empleado +
                ", precioPorDia=" + precioPorDia +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", total=" + total +
                '}';
    }
}
