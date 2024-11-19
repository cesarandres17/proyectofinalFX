package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * La clase abstracta Persona representa la base para definir a los individuos
 * dentro del sistema. Puede ser extendida para modelar roles específicos como 
 * empleados, clientes o administradores, y contiene atributos y métodos comunes 
 * a todas las personas del sistema.
 */
public abstract class Persona {

    // Atributos
    private int id;                // Identificador único de la persona.
    private String nombre;         // Nombre de la persona.
    private String apellido;       // Apellido de la persona.
    private String cedula;         // Documento de identidad único de la persona.
    private int edad;              // Edad de la persona.
    private String correo;         // Correo electrónico de la persona.
    private String telefono;       // Número de teléfono de la persona.
    private String rol;            // Rol de la persona en el sistema.
    private Usuario usuario;       // Objeto Usuario asociado a la persona.

    /**
     * Constructor parametrizado de la clase Persona.
     * Permite inicializar los atributos con valores específicos al momento de la creación.
     *
     * @param id       Identificador único de la persona.
     * @param nombre   Nombre de la persona.
     * @param apellido Apellido de la persona.
     * @param cedula   Documento de identidad único de la persona.
     * @param edad     Edad de la persona.
     * @param correo   Correo electrónico de la persona.
     * @param telefono Número de teléfono de la persona.
     * @param rol      Rol de la persona en el sistema.
     * @param usuario  Objeto Usuario asociado a la persona.
     */
    public Persona(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.rol = rol;
        this.usuario = usuario;
    }

    /**
     * Constructor por defecto de la clase Persona.
     * Permite crear una instancia sin necesidad de inicializar atributos al momento de la creación.
     */
    Persona() {
    }

    // Métodos Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Método toString para generar una representación en texto de la clase Persona.
     *
     * @return Una cadena que representa los valores de los atributos de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
