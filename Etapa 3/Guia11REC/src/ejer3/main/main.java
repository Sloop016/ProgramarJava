/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3.main;

import ejer3.servicio.BarajaServicio;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BarajaServicio barajaService = new BarajaServicio();

        int menu = 0;
        do {
            System.out.println("1. Crear baraja");
            System.out.println("2. Mezclar baraja");
            System.out.println("3. Dar cartas");
            System.out.println("4. Mostrar cartas del monton");
            System.out.println("5. Cartas disponibles");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("*--------------------------*");
                    barajaService.crearBaraja();
                    break;
                case 2:
                    System.out.println("*--------------------------*");
                    barajaService.barajar();
                    break;
                case 3:
                    System.out.println("*--------------------------*");
                    barajaService.darCartas();
                    break;
                case 4:
                    System.out.println("*--------------------------*");
                    barajaService.cartasMonton();
                    break;
                case 5:
                    System.out.println("*--------------------------*");
                    barajaService.cartasDisponibles();
                    break;
                case 6:
                    System.out.println("*--------------------------*");
                    barajaService.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("*--------------------------*");
        } while (menu != 7);
    }
}
