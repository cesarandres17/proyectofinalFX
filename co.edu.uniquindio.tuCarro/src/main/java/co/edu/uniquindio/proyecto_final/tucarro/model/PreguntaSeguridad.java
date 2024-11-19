package co.edu.uniquindio.proyecto_final.tucarro.model;

import javafx.beans.property.SimpleStringProperty;

/**
 * La clase PreguntaSeguridad representa una pregunta de seguridad que se puede 
 * asociar a un usuario para la recuperación de contraseñas u otros procesos de validación.
 * Utiliza un SimpleStringProperty para facilitar la vinculación de datos en una interfaz gráfica.
 */
public class PreguntaSeguridad {
    
    // Atributo que almacena la pregunta de seguridad
    private final SimpleStringProperty pregunta;

    /**
     * Constructor de la clase PreguntaSeguridad.
     * Inicializa la pregunta con el valor proporcionado.
     *
     * @param pregunta La pregunta de seguridad que se desea almacenar.
     */
    public PreguntaSeguridad(String pregunta) {
        this.pregunta = new SimpleStringProperty(pregunta);
    }

    /**
     * Obtiene el valor de la pregunta de seguridad.
     *
     * @return El texto de la pregunta de seguridad.
     */
    public String getPregunta() {
        return pregunta.get();
    }

    /**
     * Método que proporciona la propiedad de la pregunta de seguridad para la vinculación en interfaces gráficas.
     *
     * @return La propiedad de la pregunta de seguridad.
     */
    public SimpleStringProperty preguntaProperty() {
        return pregunta;
    }
}
