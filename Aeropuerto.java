import java.util.concurrent.Semaphore;

public class Aeropuerto {
    private Semaphore pistas;
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String VERDE = "\u001B[32m";

    public Aeropuerto(int numPistas) {
        this.pistas = new Semaphore(numPistas);
    }

    public void usarPista(String avion) {
        try {
            System.out.println(AMARILLO +"[SOLICITA] " + avion + " está esperando para usar una pista..." + RESET);
            pistas.acquire(); // Solicita permiso para usar una pista
            System.out.println(VERDE +"[USA] "+ avion + " está usando una pista." + RESET);
            Thread.sleep((long)(Math.random() * 3000)); // Simula tiempo de uso
            System.out.println(ROJO +"[LIBERA] "+ avion + " ha terminado y libera la pista." + RESET);
            pistas.release(); // Libera la pista
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
