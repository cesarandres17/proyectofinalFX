package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * Clase que representa a un administrador dentro del sistema de concesionario "Tu Carro UQ".
 * <p>
 * Un administrador tiene permisos completos para gestionar el sistema, como la administración de empleados, reportes y otras funcionalidades de gestión.
 * Esta clase hereda de la clase {@link Persona}, lo que significa que un administrador es un tipo de persona con atributos comunes como nombre, cédula, edad, correo, teléfono, etc.
 * </p>
 */
public class Administrador extends Persona {

    /**
     * Constructor vacío de la clase {@link Administrador}.
     * Llama al constructor de la clase base {@link Persona} para inicializar los atributos predeterminados.
     */
    public Administrador() {
        super();
    }

    /**
     * Constructor de la clase {@link Administrador} con parámetros específicos.
     * <p>
     * Este constructor permite crear un administrador proporcionando todos los atributos necesarios que se heredan de la clase {@link Persona}.
     * </p>
     *
     * @param id       El identificador único del administrador.
     * @param nombre   El nombre del administrador.
     * @param apellido El apellido del administrador.
     * @param cedula   La cédula o documento de identidad del administrador.
     * @param edad     La edad del administrador.
     * @param correo   El correo electrónico del administrador.
     * @param telefono El número de teléfono del administrador.
     * @param rol      El rol del administrador (debe ser "ADMINISTRADOR").
     * @param usuario  El objeto {@link Usuario} asociado al administrador, con su respectiva información de acceso.
     */
    public Administrador(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }

}
