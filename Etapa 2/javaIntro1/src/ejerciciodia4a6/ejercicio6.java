/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia4a6;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Ingresa dos numeros positivos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean bucle = true;
        String respuesta;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:  {
                    int suma = num1 + num2;
                    System.out.println(suma);
                    System.out.println("=============");
                    break;
                }
                case 2 : {
                    int resta = num1 - num2;
                    System.out.println(resta);
                    System.out.println("=============");
                    break;
                }
                case 3 : {
                    int multiplicacion = num1 * num2;
                    System.out.println(multiplicacion);
                    System.out.println("=============");
                    break;
                }
                case 4 :{
                    int division = num1 / num2;
                    
                    System.out.println(division);
                    System.out.println("=============");
                break;
                }
                case 5 : {
                        System.out.println("=============");
                    System.out.println("Estas seguro que desea salir del programa (S/N)?");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Ha salido exitosamente del programa");
                        bucle = false;
                    }
                }
            }
        } while (bucle);
    }
}
