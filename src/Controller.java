import java.lang.module.ModuleDescriptor;

/**
 * Clase encargada de conectar
 * la vista con el modelo.
 */
public class Controller {

    static View miView = new View();
    Model miModel = new Model();

    public static void main(String[] args) {
        miView.menu();
    }

    /**
     * Añade un coche al sistema.
     * @param modelo modelo del coche
     * @param matricula matrícula del coche
     * @return true si se añade correctamente
     */
    public boolean añadirCoche(String modelo, String matricula){
        Coche creado = miModel.crearCoche(modelo, matricula);
        return creado == miModel.getCoche(matricula);
    }

    /**
     * Cambia la velocidad de un coche.
     * @param matricula matrícula del coche
     * @param velocidad nueva velocidad
     * @return true si se cambia correctamente
     */
    public boolean newVelocidad(String matricula, int velocidad){
        int nuevaVelocidad = miModel.cambiarVelocidad(matricula, velocidad);
        return miView.muestraVelocidad(matricula, miModel.getVelocidad(matricula));
    }

    /**
     * Hace avanzar el coche y actualiza los metros recorridos.
     * @param matricula matrícula del coche
     * @param metros metros a avanzar
     * @return true si funciona correctamente
     */
    public boolean avanzarCoche(String matricula, int metros){

        int total = miModel.avanzar(matricula, metros);

        return miView.mostrarMetros(matricula, total);
    }

    /**
     * Carga gasolina al coche.
     * @param matricula matrícula del coche
     * @param litros litros de gasolina a añadir
     * @return true si funciona correctamente
     */
    public boolean cargarGasolina(String matricula, int litros){

        int total = miModel.cargarGasolina(matricula, litros);

        return miView.mostrarGasolina(matricula, total);
    }
}