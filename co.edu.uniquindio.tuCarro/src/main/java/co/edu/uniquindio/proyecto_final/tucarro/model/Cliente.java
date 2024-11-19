package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * Clase que representa un cliente en el sistema.
 * Hereda de la clase abstracta Persona y añade la posibilidad de crear instancias de tipo cliente.
 */
public class Cliente extends Persona {

    /**
     * Constructor vacío de la clase Cliente.
     * Inicializa un cliente con los valores predeterminados de la clase Persona.
     */
    public Cliente() {
        super();
    }

    /**
     * Constructor con parámetros para inicializar un cliente con información detallada.
     *
     * @param id       Identificador único del cliente.
     * @param nombre   Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param cedula   Número de cédula del cliente.
     * @param edad     Edad del cliente.
     * @param correo   Correo electrónico del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param rol      Rol del cliente en el sistema (por ejemplo, "cliente").
     * @param usuario  Objeto Usuario asociado al cliente, que incluye credenciales de acceso.
     */
    public Cliente(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }
}
