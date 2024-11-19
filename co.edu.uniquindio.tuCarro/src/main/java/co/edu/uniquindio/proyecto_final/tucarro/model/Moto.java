package co.edu.uniquindio.proyecto_final.tucarro.model;

/**
 * La clase Moto representa un tipo de vehículo específico dentro del sistema. 
 * Hereda los atributos y métodos de la clase abstracta Vehiculo y puede 
 * contener características adicionales que diferencian a las motocicletas 
 * de otros tipos de vehículos.
 */
public class Moto extends Vehiculo {

    /**
     * Constructor parametrizado de la clase Moto.
     * Permite inicializar los atributos heredados de la clase Vehiculo.
     *
     * @param marca                Marca de la motocicleta.
     * @param estado               Estado de la motocicleta (Nuevo, Usado, etc.).
     * @param modelo               Modelo de la motocicleta.
     * @param placa                Placa única de identificación.
     * @param cambios              Número de cambios disponibles en la motocicleta.
     * @param velocidadMaxima      Velocidad máxima que puede alcanzar.
     * @param cilindraje           Cilindraje del motor de la motocicleta.
     * @param combustible          Tipo de combustible utilizado (Gasolina, Eléctrico, etc.).
     * @param transmisionAutomatica Indica si la motocicleta tiene transmisión automática.
     */
    public Moto(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
    }

    /**
     * Constructor por defecto de la clase Moto.
     * Permite crear una instancia sin necesidad de inicializar atributos al momento de la creación.
     */
    public Moto() {
    }
}
