import java.time.LocalDate;
import java.util.Scanner;

import modelo.RevisionAlarma;
import modelo.TrabajoPintura;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        int tipoObra;
        try {
            // Creo el objeto
            do {

                System.out.println("ELIGE EL TIPO DE OBRA:" +
                        "\n1.- Pintura" +
                        "\n2.- Alarma" +
                        "\n0.- Salir");
                tipoObra = sc.nextInt();

                System.out.println("MENÚ DE OPCIONES:" +
                        "\n1.- Coste total de la obra" +
                        "\n2.- Detalle de la obra" +
                        "\n0.- Salir");

                System.out.println("Introduce la opción elegida: ");
                opcion = sc.nextInt();
                sc.nextLine();

                // Ejemplo de switch case en Java
                switch (tipoObra) {

                    case 1: // ELIGE PINTURA
                        TrabajoPintura trabajo1 = new TrabajoPintura("Eduardo", LocalDate.now(), "Ana", 100, 10);

                        if (opcion == 1) { // COSTE TOTAL DE LA OBRA
                            System.out.println("El precio de la pintura es: " + trabajo1.costeTotal());
                        } else if (opcion == 2) { // GENERAR FACTURA
                            System.out.println(trabajo1.detalleServicio());
                        }
                        break;

                    case 2: // ELIGE ALARMA
                        RevisionAlarma alarma1 = new RevisionAlarma("Pepe", 5);

                        if (opcion == 1) { // COSTE TOTAL ALARMA
                            System.out.println("El coste de la alarma es: " + alarma1.costeTotal());

                        } else if (opcion == 2) { // GENERAR FACTURA ALARMA
                            System.out.println(alarma1.detalleServicio());
                        }
                        break;

                    case 0:
                        System.out.println("Adios!");
                        break;

                    default:
                        System.out.println("Número no reconocido");
                        break;
                }// switch

                System.out.println("\n"); // Mostrar un salto de línea en Java

            } while (opcion != 0);// while
            System.out.println("Hasta pronto");
        } // try
        catch (

        Exception e) {
            System.out.println("Uoop! Error!");
        }
        sc.close();// catch
    }
}