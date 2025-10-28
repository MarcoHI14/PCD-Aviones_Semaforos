public class SimulacionAeropuerto {
    static int numPistas = 3;
    static int numAviones = 6;
    public static void main(String[] args) {
        // Crear un aeropuerto con x pistas
        Aeropuerto aeropuerto = new Aeropuerto(numPistas);

        // Crear varios aviones que intentarán usar las pistas
        for (int i = 1; i <= numAviones; i++) {
            Avion avion = new Avion("Avion " + i, aeropuerto);
            avion.start();
        }
    }
}
