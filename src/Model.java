import java.util.ArrayList;
/**
 * Clase encargada de manejar los datos del sistema.
 * Gestiona el almacenamiento y modificación de coches.
 */
public class Model {

    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo añade al parking.
     * @param modelo modelo del coche
     * @param matricula identificador único del coche
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca un coche por matrícula.
     * @param matricula matrícula a buscar
     * @return coche encontrado o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche aux = null;

        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }

        return aux;
    }

    /**
     * Cambia la velocidad de un coche.
     * @param matricula matrícula del coche
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public int cambiarVelocidad(String matricula, Integer v) {

        getCoche(matricula).velocidad = v;

        System.out.println(" LOG esta haciendose");

        return getCoche(matricula).velocidad;
    }

    /**
     * Devuelve la velocidad según la matrícula.
     * @param matricula matrícula del coche
     * @return velocidad actual
     */
    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

    /**
     * Hace avanzar el coche y consume gasolina.
     * @param matricula matrícula del coche
     * @param metros metros a avanzar
     * @return metros recorridos totales
     */
    public int avanzar(String matricula, int metros) {

        Coche c = getCoche(matricula);

        c.metrosRecorridos += metros;

        // consumo simple de gasolina
        c.gasolina -= metros / 10;

        if (c.gasolina < 0) {
            c.gasolina = 0;
        }

        return c.metrosRecorridos;
    }

    /**
     * Carga gasolina al coche.
     * @param matricula matrícula del coche
     * @param litros litros a añadir
     * @return gasolina total después de la carga
     */
    public int cargarGasolina(String matricula, int litros) {

        getCoche(matricula).gasolina += litros;

        return getCoche(matricula).gasolina;
    }

    /**
     * Devuelve la gasolina actual del coche.
     * @param matricula matrícula del coche
     * @return gasolina disponible
     */
    public int getGasolina(String matricula) {

        return getCoche(matricula).gasolina;
    }

    /**
     * Devuelve los metros recorridos por un coche.
     * @param matricula matrícula del coche
     * @return metros recorridos totales
     */
    public int getMetros(String matricula) {
        return getCoche(matricula).metrosRecorridos;
    }
}