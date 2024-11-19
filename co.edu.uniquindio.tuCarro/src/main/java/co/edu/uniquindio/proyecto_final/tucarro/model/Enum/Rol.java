package co.edu.uniquindio.proyecto_final.tucarro.model.Enum;

/**
 * Enumeración que representa los diferentes roles dentro del sistema de concesionario.
 * <p>
 * Los roles definidos son:
 * <ul>
 *     <li><b>ADMINISTRADOR:</b> Rol de los administradores del sistema, con privilegios para gestionar empleados, reportes y otros aspectos del sistema.</li>
 *     <li><b>EMPLEADO:</b> Rol de los empleados del concesionario, quienes pueden registrar vehículos, clientes y realizar transacciones de compra, venta y alquiler.</li>
 *     <li><b>CLIENTE:</b> Rol de los clientes, quienes pueden realizar reservas, compras o alquileres de vehículos.</li>
 * </ul>
 * </p>
 */
public enum Rol {
    ADMINISTRADOR,  // Rol con permisos completos para administrar el sistema
    EMPLEADO,       // Rol con permisos limitados para gestionar transacciones de vehículos
    CLIENTE,        // Rol que representa al cliente del concesionario
}
