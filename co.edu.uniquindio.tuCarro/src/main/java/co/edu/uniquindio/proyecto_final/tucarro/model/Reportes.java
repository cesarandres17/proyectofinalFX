package co.edu.uniquindio.proyecto_final.tucarro.model;

import java.time.LocalDate;

/**
 * La clase Reportes representa los reportes generados por los empleados dentro del sistema.
 * Un reporte contiene información sobre el nombre del empleado, el total de alguna métrica (por ejemplo, ventas),
 * y el período de tiempo para el cual se genera el reporte.
 */
public class Reportes {

    // Atributos del reporte
    private String nombreEmpleado;
    private int total;
    private LocalDate inicio;
    private LocalDate fin;

    /**
     * Constructor vacío de la clase Reportes.
     * Se utiliza para la creación de un reporte sin valores iniciales.
     */
    public Reportes() {
    }

    /**
     * Constructor de la clase Reportes.
     * Inicializa un reporte con los valores proporcionados para el nombre del empleado,
     * el total, y el rango de fechas (inicio y fin).
     *
     * @param nombreEmpleado Nombre del empleado que genera el reporte.
     * @param total Total de alguna métrica relevante en el reporte (por ejemplo, ventas).
     * @param inicio Fecha de inicio del periodo del reporte.
     * @param fin Fecha de fin del periodo del reporte.
     */
    public Reportes(String nombreEmpleado, int total, LocalDate inicio, LocalDate fin) {
        this.nombreEmpleado = nombreEmpleado;
        this.total = total;
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * Obtiene el nombre del empleado asociado al reporte.
     *
     * @return El nombre del empleado que generó el reporte.
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Establece el nombre del empleado para el reporte.
     *
     * @param nombreEmpleado El nombre del empleado que generó el reporte.
     */
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * Obtiene el total registrado en el reporte (por ejemplo, total de ventas).
     *
     * @return El total de la métrica en el reporte.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Establece el total para el reporte.
     *
     * @param total El total que debe registrarse en el reporte.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Obtiene la fecha de inicio del período del reporte.
     *
     * @return La fecha de inicio del reporte.
     */
    public LocalDate getInicio() {
        return inicio;
    }

    /**
     * Establece la fecha de inicio del reporte.
     *
     * @param inicio La fecha de inicio del reporte.
     */
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    /**
     * Obtiene la fecha de fin del período del reporte.
     *
     * @return La fecha de fin del reporte.
     */
    public LocalDate getFin() {
        return fin;
    }

    /**
     * Establece la fecha de fin del reporte.
     *
     * @param fin La fecha de fin del reporte.
     */
    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    /**
     * Representa el objeto Reportes como una cadena de texto.
     *
     * @return La representación en formato string del reporte.
     */
    @Override
    public String toString() {
        return "Reportes{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", total=" + total +
                ", inicio=" + inicio +
                ", fin=" + fin +
                '}';
    }
}
