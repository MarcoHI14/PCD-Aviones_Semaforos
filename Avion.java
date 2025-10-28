public class Avion extends Thread {
    private Aeropuerto aeropuerto;
    private String nombre;

    public Avion(String nombre, Aeropuerto aeropuerto) {
        this.nombre = nombre;
        this.aeropuerto = aeropuerto;
    }

    @Override
    public void run() {
        aeropuerto.usarPista(nombre);
    }
}
