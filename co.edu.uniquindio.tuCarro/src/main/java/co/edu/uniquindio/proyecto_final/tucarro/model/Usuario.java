package co.edu.uniquindio.proyecto_final.tucarro.model;

import co.edu.uniquindio.proyecto_final.tucarro.model.Enum.PreguntasSeguridad;

/**
 * La clase Usuario representa un usuario dentro del sistema del concesionario 'Tu Carro UQ'.
 * Cada usuario tiene un nombre de usuario, una contraseña, una palabra secreta asociada a una pregunta de seguridad 
 * y un estado de bloqueo que indica si el usuario está bloqueado.
 */
public class Usuario {

    // Atributos de la clase Usuario
    private String nombreUsuario; // Nombre de usuario para el acceso al sistema
    private String contrasena; // Contraseña para el acceso al sistema
    private String palabraSecreta; // Palabra secreta para recuperación de cuenta
    private PreguntasSeguridad preguntasSeguridad; // Pregunta de seguridad asociada al usuario
    private boolean bloqueado; // Estado que indica si el usuario está bloqueado o no

    /**
     * Constructor que inicializa un objeto Usuario con los valores proporcionados.
     * 
     * @param nombreUsuario Nombre del usuario.
     * @param contrasena Contraseña del usuario.
     * @param palabraSecreta Palabra secreta del usuario para recuperación de cuenta.
     * @param preguntasSeguridad Pregunta de seguridad asociada al usuario.
     */
    public Usuario(String nombreUsuario, String contrasena, String palabraSecreta, PreguntasSeguridad preguntasSeguridad) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.preguntasSeguridad = preguntasSeguridad;
        this.palabraSecreta = palabraSecreta;
    }

    /**
     * Constructor vacío de la clase Usuario.
     * Permite la creación de un objeto Usuario sin valores iniciales.
     */
    public Usuario(){

    }

    // Métodos getter y setter para los atributos de la clase Usuario

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public PreguntasSeguridad getPreguntasSeguridad() {
        return preguntasSeguridad;
    }

    public void setPreguntasSeguridad(PreguntasSeguridad preguntasSeguridad) {
        this.preguntasSeguridad = preguntasSeguridad;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    /**
     * Representa el objeto Usuario como una cadena de texto.
     * 
     * @return La representación en formato string del usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", palabraSecreta='" + palabraSecreta + '\'' +
                '}'; 
    }
}
