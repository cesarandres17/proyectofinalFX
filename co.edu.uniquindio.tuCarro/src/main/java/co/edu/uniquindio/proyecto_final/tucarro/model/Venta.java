package co.edu.uniquindio.proyecto_final.tucarro.model;

import java.time.LocalDate;

/**
 * La clase Venta representa una transacción de venta de un vehículo dentro del sistema 'Tu Carro UQ'.
 * Esta clase contiene información sobre la venta, como el vehículo vendido, el cliente comprador, 
 * el empleado que gestionó la venta, el precio de venta y la fecha de la transacción.
 */
public class Venta {

    private int idVenta; // Identificador único de la venta
    private Vehiculo vehiculo; // Vehículo que ha sido vendido
    private Cliente cliente; // Cliente que ha comprado el vehículo
    private Empleado empleado; // Empleado que gestionó la venta
    private double precio; // Precio de la venta
    private LocalDate fecha; // Fecha en que se realizó la venta

    /**
     * Constructor vacío para crear un objeto Venta sin inicializar los atributos.
     */
    public Venta() {

    }

    /**
     * Constructor que inicializa todos los atributos de la clase Venta.
     * 
     * @param idVenta Identificador único de la venta.
     * @param vehiculo Vehículo que ha sido vendido.
     * @param cliente Cliente que ha comprado el vehículo.
     * @param empleado Empleado que gestionó la venta.
     * @param precio Precio de la venta.
     * @param fecha Fecha en la que se realizó la venta.
     */
    public Venta(int idVenta, Vehiculo vehiculo, Cliente cliente, Empleado empleado, double precio, LocalDate fecha) {
        this.idVenta = idVenta;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.precio = precio;
        this.fecha = fecha;
    }

    // Métodos getter y setter para acceder y modificar los atributos de la clase Venta

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Representa la información de la venta como una cadena de texto.
     * 
     * @return La representación en formato string de una venta.
     */
    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", empleado=" + empleado +
                ", precio=" + precio +
                ", fecha=" + fecha +
                '}';
    }
}
