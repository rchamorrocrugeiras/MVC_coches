/**
 * Clase que representa un coche
 * Guarda modelo, matrícula, velocidad,
 * metros recorridos y gasolina
 */

public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    Integer metrosRecorridos;
    Integer gasolina;

    /**
     * Constructor del coche
     * Inicializa velocidad, metros recorridos y gasolina
     * @param modelo modelo del coche
     * @param matricula matrícula única
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.metrosRecorridos = 0;
        this.gasolina = 100;
    }
}