import java.lang.module.ModuleDescriptor;

/**
 * Clase encargada de conectar
 * la vista con el modelo
 */
public class Controller {
    static View miView = new View();
    Model miModel = new Model();

    public static void main(String[] args) {
        miView.menu();

        /**
         *

         // Instanciamos la vista y el modelo

         // Crear tres coches
         miModel.crearCoche("LaFerrari", "SBC 1234");
         miModel.crearCoche("Alpine", "HYU 4567");
         miModel.crearCoche("Aston Martin", "FGH 3333");

         Coche ferrari = miModel.getCoche("SBC 1234");
         // modifica la velocidad
         int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

         // recoje la velocidad y la muestra (tarea de la View)
         boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));


         if (hecho) {
         System.out.println("[LOG] Correcto");
         } else {
         System.out.println("[LOG] Error");
         } ; **/
    }

    /**
     * Añade un coche al sistema
     * @param modelo modelo del coche
     * @param matricula matrícula del coche
     * @return true si se añade correctamente
     */

    public boolean añadirCoche(String modelo, String matricula){
        Coche creado =miModel.crearCoche(modelo,matricula);
        if (creado == miModel.getCoche(matricula)) {
            return true;}
        else {return false;}
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula matrícula del coche
     * @param velocidad nueva velocidad
     * @return true si se cambia correctamente
     */

    public boolean newVelocidad(String matricula, int velocidad){
        int nuevaVelocidad = miModel.cambiarVelocidad(matricula, velocidad);
        boolean hecho = miView.muestraVelocidad(matricula, miModel.getVelocidad(matricula));
        return hecho;
    }

    /**
     * Hace avanzar el coche
     * @param matricula
     * @param metros
     * @return true si funciona
     */
    public boolean avanzarCoche(String matricula, int metros){

        int total = miModel.avanzar(matricula, metros);

        boolean hecho = miView.mostrarMetros(
                matricula,
                total
        );

        return hecho;
    }

    /**
     * Carga gasolina al coche
     * @param matricula
     * @param litros
     * @return true si funciona
     */
    public boolean cargarGasolina(String matricula, int litros){

        int total = miModel.cargarGasolina(matricula, litros);

        boolean hecho = miView.mostrarGasolina(
                matricula,
                total
        );

        return hecho;
    }
}