package co.edu.uniquindio.proyecto_final.tucarro.model.Enum;

/**
 * Esta enumeración contiene una lista de preguntas de seguridad utilizadas para la recuperación de contraseñas.
 * Cada constante en esta enumeración representa una pregunta específica que se puede utilizar para validar la identidad del usuario.
 */
public enum PreguntasSeguridad {

    // Pregunta sobre la primera mascota del usuario.
    PRIMERMASCOTA("¿Cuál fue tu primera mascota?"),
    
    // Pregunta sobre el nombre de la primera novia del usuario.
    NOMBREDETUPRIMERANOVIA("¿NOMBRE DE TU PRIMERA NOVIA"),
    
    // Pregunta sobre la materia favorita del colegio del usuario.
    MATERIADECOLEGIOFAVORITA("¿CUAL ERA TU MATERIA FAVORITA DEL COLEGIO?"),
    
    // Pregunta sobre la serie de televisión favorita del usuario.
    SERIEDETELEVISIONFAVORITA("CUAL ES TU SERIE DE TELEVISION FAVORITA?");

    // Atributo que guarda el texto de la pregunta de seguridad.
    private final String pregunta;

    /**
     * Constructor de la enumeración PreguntasSeguridad.
     * 
     * @param pregunta El texto de la pregunta de seguridad.
     */
    PreguntasSeguridad(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Método toString sobrescrito que devuelve el texto de la pregunta.
     * 
     * @return El texto de la pregunta de seguridad asociada a la constante.
     */
    @Override
    public String toString() {
        return pregunta;
    }
}
