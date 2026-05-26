public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    Integer metrosRecorridos;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.metrosRecorridos = 0;
    }
}