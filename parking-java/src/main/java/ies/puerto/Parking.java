package ies.puerto;
import java.util.Scanner;

/**
 * @autor dhalsadev
 * @version 1.0.0
 */
public class Parking {

    /**
     *
     * @param opcion
     * @return
     */
    static void mostrarMenu () {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Registrar vehículos");
            System.out.println("2. Calcular tarifa de estacionamiento");
            System.out.println("3. Mostrar resumen del día");
            System.out.println("4. Salir");

            System.out.println("Opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                default:
                    System.out.println("Opción inválida");
                    break;
                case 1:
                    System.out.println("¿Cuantos vehículos quieres registrar?");
                    int cantidad = teclado.nextLine();
                    if () {
                        
                case 2:
                case 3:
                case 4:
                    System.out.println("Gracias por utilizar PARKING DAM-PRO");
                    teclado.close();
                    return;
            }
        } while (opcion != 4);
        return;
    }


    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float tarifaHora = 1.50f;
        int totalVehiculos = 0;
        int totalHorasRegistradas = 0;
        int totalCalculosTarifa = 0;
        float importeTotalCalculado = 0f;

        System.out.println("Nombre del usuario: ");
        String nombre = teclado.nextLine();



            switch (opcion) {
                case 1:



                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion !=4);


        // 1. Leer el nombre del usuario.
        // 2. Repetir el menú con do-while.
        // 3. Resolver cada opción mediante switch.
        // 4. Llamar a tus métodos y actualizar acumuladores.
        // 5. Cerrar Scanner al salir.

        teclado.close();
    }
}
