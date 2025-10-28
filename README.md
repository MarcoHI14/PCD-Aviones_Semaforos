Programación Concurrida y Distribuida - Simulación de Aviones y Semáforos

Proyecto de ejemplo para la asignatura PCD: simulación de un aeropuerto con pistas y aviones.
En SimulacionAeropuerto se pueden establecer el numero de pistas y aviones. Los aviones intentan acceder al recurso pista, pero son controlados por semáforos para ordenar las solicitudes, usos y liberaciones de las pistas.

Estructura:
- Aeropuerto.java
- Avion.java
- SimulacionAeropuerto.java (clase principal)

Cómo compilar y ejecutar (desde la raíz del proyecto):

Windows (cmd.exe):

```
javac *.java
java SimulacionAeropuerto
```

Sugerencias:
- Añade un `LICENSE` si quieres publicar el proyecto.
- Usa GitHub Actions si quieres añadir compilación automática.

