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

Linux/Mac (bash):

```javac *.java
java SimulacionAeropuerto
```


Licencia:

Este proyecto está licenciado bajo la MIT License. Consulta el archivo `LICENSE` en la raíz para ver el texto completo y los términos.

Copyright (c) 2025 Marco Herrera Iborra

Puedes usar, copiar y modificar este proyecto conforme a los términos de la MIT License, siempre que conserves el aviso de copyright y la licencia en las copias o distribuciones.

Para más información sobre licencias de código, visita: https://choosealicense.com/
