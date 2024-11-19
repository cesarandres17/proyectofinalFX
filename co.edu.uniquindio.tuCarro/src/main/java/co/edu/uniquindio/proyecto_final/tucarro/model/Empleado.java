package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * Clase que representa a un empleado en el sistema.
 * Hereda de la clase abstracta Persona e incluye atributos y funcionalidades básicas de una persona.
 */
public class Empleado extends Persona {

    /**
     * Constructor vacío que permite crear un empleado con valores predeterminados.
     * Utiliza el constructor vacío de la clase base Persona.
     */
    public Empleado() {
        super();
    }

    /**
     * Constructor parametrizado que permite inicializar un empleado con los valores especificados.
     *
     * @param id       Identificador único del empleado.
     * @param nombre   Nombre del empleado.
     * @param apellido Apellido del empleado.
     * @param cedula   Cédula del empleado.
     * @param edad     Edad del empleado.
     * @param correo   Correo electrónico del empleado.
     * @param telefono Teléfono de contacto del empleado.
     * @param rol      Rol del empleado en el sistema.
     * @param usuario  Objeto Usuario asociado al empleado, que contiene credenciales de acceso.
     */
    public Empleado(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }
}
