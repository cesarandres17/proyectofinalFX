package co.edu.uniquindio.proyecto_final.tucarro.controller;

import co.edu.uniquindio.proyecto_final.tucarro.model.Empleado;
import co.edu.uniquindio.proyecto_final.tucarro.model.Empresa;

/**
 * Esta clase controla las operaciones relacionadas con los empleados de la empresa.
 * Las funciones permiten verificar, agregar, actualizar, eliminar y obtener empleados.
 */
public class EmpleadoController {
    // Instancia de la clase Empresa que será utilizada para realizar las operaciones sobre los empleados.
    private final Empresa empresa;

    /**
     * Constructor de la clase EmpleadoController.
     * Inicializa la instancia de la clase Empresa.
     */
    public EmpleadoController() {
        // Se obtiene la instancia única de la clase Empresa mediante el patrón Singleton.
        empresa = Empresa.getInstancia();
    }

    /**
     * Verifica si un empleado existe en la empresa dado su número de cédula.
     * 
     * @param cedula La cédula del empleado a verificar.
     * @return true si el empleado existe, false en caso contrario.
     */
    public Boolean verificarEmpleado(String cedula) {
        // Llama al método de la clase Empresa para verificar la existencia del empleado.
        return empresa.verificarEmpleado(cedula);
    }

    /**
     * Agrega un nuevo empleado a la empresa.
     * 
     * @param empleado El objeto Empleado que se va a agregar.
     * @return true si el empleado se agregó correctamente, false si ocurrió algún error.
     */
    public Boolean agregarEmpleado(Empleado empleado) {
        // Llama al método de la clase Empresa para agregar el empleado.
        return empresa.agregarEmpleado(empleado);
    }

    /**
     * Actualiza los datos de un empleado existente en la empresa.
     * 
     * @param empleadoActualizado El objeto Empleado con los datos actualizados.
     * @return true si el empleado se actualizó correctamente, false en caso contrario.
     */
    public Boolean actualizarEmpleado(Empleado empleadoActualizado) {
        // Llama al método de la clase Empresa para actualizar el empleado.
        return empresa.actualizarEmpleado(empleadoActualizado);
    }

    /**
     * Elimina un empleado de la empresa dado su número de cédula.
     * 
     * @param cedula La cédula del empleado a eliminar.
     * @return true si el empleado se eliminó correctamente, false si ocurrió algún error.
     */
    public Boolean eliminarEmpleado(String cedula) {
        // Llama al método de la clase Empresa para eliminar al empleado.
        return empresa.eliminarEmpleado(cedula);
    }

    /**
     * Obtiene los datos de un empleado dado su número de cédula.
     * 
     * @param cedula La cédula del empleado a buscar.
     * @return El objeto Empleado correspondiente, o null si no se encuentra.
     */
    public Empleado obtenerEmpleado(String cedula) {
        // Llama al método de la clase Empresa para obtener los datos del empleado.
        return empresa.obtenerEmpleado(cedula);
    }
}
