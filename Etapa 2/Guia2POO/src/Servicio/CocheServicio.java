/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entity.Coche;
import java.util.Scanner;

/**
 * métodos "ingresarCoche" y "mostrarCoche".
 *
 * @author gabyg
 */
public class CocheServicio {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Coche A1() {
        Coche a1 = new Coche("Audi", "A1", 2750000, 1997);
        return a1;
    }

    public Coche A5() {
        Coche a5 = new Coche("Audi", "A5", 4500000, 2006);
        return a5;
    }

    public Coche UP() {
        Coche up = new Coche("Volkswagen", "UP", 1500000, 2013);
        return up;
    }

    public Coche FOX() {
        Coche fox = new Coche("Volkswagen", "FOX", 2000000, 2015);
        return fox;
    }

    public Coche CLIO() {
        Coche clio = new Coche("Renault", "CLIO", 2700000, 2023);
        return clio;
    }

    public Coche LOGAN() {
        Coche logan = new Coche("Renault", "LOGAN", 1750000, 2012);
        return logan;
    }

    public void menu(Coche menu) {
        int op = 0;
        int op2 = 0;
        int op3 = 0;
        char respuesta;

        do {
            System.out.println("Bienvenido a la concecionaria: ");
            System.out.println("Seleccione una Marca: ");
            System.out.println("1. Audi: ");
            System.out.println("2. Renault: ");
            System.out.println("3. Volkswagen: ");
            System.out.println("0. SALIR: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ha seleccionado AUDI.");
                    System.out.println("1. AUDI A1: ");
                    System.out.println("2. AUDI A5: ");
                    op2 = sc.nextInt();

                    switch (op2) {
                        case 1:
                            System.out.println(A1());
                            System.out.println();
                            // Código para la opción 1 de la opción A
                            break;
                        case 2:
                            System.out.println(A5());
                            System.out.println();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Ha seleccionado RENAULT.");
                    System.out.println("1. CLIO");
                    System.out.println("2. LOGAN");
                    op2 = sc.nextInt();

                    switch (op2) {
                        case 1:
                            System.out.println(CLIO());
                            System.out.println();
                            break;
                        case 2:
                            System.out.println(LOGAN());
                            System.out.println();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 3:

                    System.out.println("Ha seleccionado la opción VOLKSWAGEN.");
                    System.out.println("1. UP");
                    System.out.println("2. FOX");
                    op3 = sc.nextInt();
                    switch (op3) {
                        case 1:
                            System.out.println(UP());
                            System.out.println();
                            break;
                        case 2:
                            System.out.println(FOX());
                            System.out.println();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del Catalogo...");
                    System.out.println("Gracias por utilizar nuestra app.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            respuesta = sc.next().charAt(0);
        } while (respuesta == 's');
        System.out.println("Gracias por utilizar nuestra app.");
    }
}
