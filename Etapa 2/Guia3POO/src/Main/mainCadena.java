/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class mainCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadenaServicio servicio = new CadenaServicio();
        Cadena c1 = new Cadena("La casa de la abuela");
        int menu;
        do {
            System.out.println("1. Mostrar vocales");
            System.out.println("2. Comparar Longitudes");
            System.out.println("3. Invertir Frase");
            System.out.println("4. Veces Repetido");
            System.out.println("5. Unir Frases");
            System.out.println("6. Reemplazar letra");
            System.out.println("7. Ver si contiene X letra");
            System.out.println("8. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    servicio.mostrarVocales(c1);
                    break;
                case 2:
                    servicio.compararLongitud(c1)
                    ;
                    break;
                case 3:
                    servicio.invertirFrase(c1);
                    break;
                case 4:
                    servicio.vecesRepetido(c1);
                    break;
                case 5:
                    servicio.unirFrases(c1);
                    break;
                case 6:
                    servicio.reemplazar(c1);
                    break;
                case 7:
                    servicio.contiene(c1);
                    break;
                case 8:
                    System.out.println("Saliendo....");
                    break;
                default:
                    break;
            }
        } while (menu != 8);

    }
}
