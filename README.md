# PARKING DAM-PRO

----
## Relación entre diagramas y código

----
### Inicio

La función `main` se encarga de recibir al usuario y guardar su nombre. Además declara todas las variables del programa (`tarifaHora`, `totalVehiculos`, `totalHorasRegistradas`, `totalCalculosTarifa` e `importeTotalCalculado`) y contiene el bucle principal con el menú.

### Menú

El menú se muestra con la función `mostrarMenu`, que solo imprime las opciones por pantalla. El control del menú lo hace `main` mediante un bucle `do-while` y un `switch`, que leen una opción mientras el usuario no seleccione la opción 4, que es la salida.

### Registro de vehículos

La opción 1 del menú usa las funciones `leerEnteroPositivo` y `registrarVehiculos`. Primero se pregunta cuántos vehículos se quieren registrar y después, con un bucle `for`, se pide la matrícula y las horas estacionadas de cada vehículo uno a uno.

### Validaciones y cálculo de tarifas

La función `leerEnteroPositivo` valida los datos numéricos con un bucle `while`, que repite la pregunta mientras el número introducido sea menor o igual que 0. La opción 2 del menú usa esta validación y llama a `calcularTarifa`, que multiplica las horas por la tarifa por hora (1,50 €).

### Resumen

La opción 3 llama a la función `mostrarResumen`, que muestra un resumen de todas las operaciones hechas por el usuario junto a otros datos. Simplemente uso un `System.out.println` para cada uno de los datos que necesita mostrar.

### Salida y opción inválida

No representan ninguna función, simplemente son opciones dentro del `switch` de `main`. La opción 4 escribe un mensaje de despedida y hace que el bucle termine, y el caso `default` escribe "Opción no válida." y reinicia el bucle.

## Funciones implementadas

---

### main(String[] args)

Función principal del programa. Pide el nombre al usuario, declara las variables que acumulan los datos del día y contiene el bucle `do-while` con el `switch` que ejecuta cada opción del menú. Actualiza las variables `totalVehiculos`, `totalHorasRegistradas`, `totalCalculosTarifa` e `importeTotalCalculado` con los valores que le devuelven el resto de funciones.

### mostrarMenu()

Función que muestra el menú por pantalla con las opciones: registrar vehículo, calcular tarifa, ver resumen del día y salir. No lee la opción ni gestiona el bucle, eso lo hace `main`.

### leerEnteroPositivo(Scanner scanner, String mensaje)

Función que muestra un mensaje y lee un número entero. Usa un bucle `while` para repetir la pregunta mientras el número no sea positivo, y devuelve el número ya validado. La reutilizo en varios sitios del programa (cantidad de vehículos, horas estacionadas y horas para la tarifa) para no repetir código.

### registrarVehiculos(Scanner scanner, int cantidad)

Función que registra los vehículos del usuario. A través de un bucle `for` pide la matrícula de cada vehículo y las horas que lleva en el parking. Devuelve la suma de las horas de la operación, que `main` añade a `totalHorasRegistradas`. Las matrículas solo se piden y no se guardan.

### calcularTarifa(int horas, float tarifaHora)

Función que calcula el importe a pagar. Recibe las horas y la tarifa por hora, y devuelve el resultado de multiplicarlas. Es `main` quien suma uno al contador `totalCalculosTarifa` y acumula el importe en `importeTotalCalculado`.

### mostrarResumen(...)

Función que muestra el resumen de lo que ha hecho el usuario. Recibe como parámetros: nombre, totalVehiculos, totalHorasRegistradas, totalCalculosTarifa e importeTotalCalculado, y los imprime por pantalla.

## Historial de desarrollo con Git

---

Estos son los commits que he hecho hasta ahora:
```
7b5aa03 (HEAD -> main, origin/main, origin/HEAD) Hecho hasta el tercer diagrama
5f342f5 Mueve parking-java a la carpeta correcta
50394c1 build: crear proyecto Maven parking-java
e5c1539 Rename 6.png to diagramas/6.png
4790ac3 Rename 5.png to diagramas/5.png
20f1e2e Rename 4.png to diagramas/4.png
5f4a784 Rename 3.png to diagramas/3.png
33649fd Rename 2.png to diagramas/2.png
588c1a9 Rename 1.png to diagramas/1.png
```
## Dificultades y soluciones

---

El mayor problema que tuve fue conseguir que las funciones trabajasen con datos que cambian constantemente a lo largo del programa, como el total de vehículos o las horas registradas. Lo solucioné declarando las variables dentro de `main` y pasándolas a las funciones como parámetros, de modo que cada función devuelve su resultado con `return` y es `main` quien actualiza las variables (por ejemplo `totalHorasRegistradas += horasOperacion;`).

Otra dificultad fue la validación de los números. Para no repetir el mismo bucle varias veces creé la función `leerEnteroPositivo`, que reutilizo en todas las entradas numéricas. También tuve que añadir `scanner.nextLine()` después de cada `nextInt()` para limpiar el salto de línea y evitar que se saltase la lectura de la matrícula.

## Conclusión

---

El programa funciona correctamente y en el proceso he aprendido a usar mejor las funciones, los parámetros y los valores de retorno, a parte de hacer los diagramas. También me he acostumbrado más a usar git y sus comandos en el proceso de completar la tarea.