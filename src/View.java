import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario.
 * Muestra el menú y gestiona las opciones del sistema.
 */
public class View {

    /**
     * Muestra el menú principal de la aplicación.
     * Permite crear coches, modificar velocidad,
     * avanzar y cargar gasolina.
     */
    public void menu() {

        Controller c = new Controller();
        int opcion = 0;

        do {

            System.out.println("\n--- XESTOR COCHES ---");
            System.out.println("1. Engadir Coche");
            System.out.println("2. Cambiar velocidad");
            System.out.println("3. Avanzar");
            System.out.println("4. Cargar gasolina");
            System.out.println("5. Salir");
            System.out.print("Selecciona unha opción: ");

            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.println("Modelo: ");
                    String modelo = new Scanner(System.in).next();

                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    boolean a = c.añadirCoche(modelo, matricula);

                    System.out.println(a ? "Se ha añadido correctamente" : "Algo ha fallado");
                }

                case 2 -> {
                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    System.out.println("Nueva velocidad: ");
                    int velocidad = new Scanner(System.in).nextInt();

                    boolean a = c.newVelocidad(matricula, velocidad);

                    System.out.println(a ? "Se ha cambiado correctamente" : "Algo ha fallado");
                }

                case 3 -> {
                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    System.out.println("Metros a avanzar: ");
                    int metros = new Scanner(System.in).nextInt();

                    boolean a = c.avanzarCoche(matricula, metros);

                    System.out.println(a ? "El coche avanzó correctamente" : "Algo ha fallado");
                }

                case 4 -> {
                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    System.out.println("Litros a cargar: ");
                    int litros = new Scanner(System.in).nextInt();

                    boolean a = c.cargarGasolina(matricula, litros);

                    System.out.println(a ? "Gasolina cargada correctamente" : "Algo ha fallado");
                }

                case 5 -> {
                    System.out.println("Chao hasta luego....");
                }
            }

        } while (opcion != 5);
    }

    /**
     * Muestra la velocidad de un coche.
     * @param matricula matrícula del coche
     * @param v velocidad actual
     * @return true si se muestra correctamente
     */
    public boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println(matricula + ": " + v + " km/h");
        return true;
    }

    /**
     * Muestra los metros recorridos por un coche.
     * @param matricula matrícula del coche
     * @param metros metros recorridos
     * @return true si se muestra correctamente
     */
    public boolean mostrarMetros(String matricula, Integer metros){
        System.out.println(matricula + ": " + metros + " metros recorridos");
        return true;
    }

    /**
     * Muestra la gasolina actual del coche.
     * @param matricula matrícula del coche
     * @param gasolina litros de gasolina disponibles
     * @return true si se muestra correctamente
     */
    public boolean mostrarGasolina(String matricula, Integer gasolina){
        System.out.println(matricula + ": " + gasolina + " litros");
        return true;
    }
}