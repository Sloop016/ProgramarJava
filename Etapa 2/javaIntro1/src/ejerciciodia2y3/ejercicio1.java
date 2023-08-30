package ejerciciodia2y3;

import java.util.Scanner;

/**
Escribir un programa que pida dos números 
* enteros por teclado y calcule la suma 
* de los dos. El programa deberá después 
* mostrar el resultado de la suma
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el valor de los numeros");
                int num1 = leer.nextInt();
                int num2 = leer.nextInt();
                
                int suma = num1 + num2 ;
                
                System.out.println("El resultado de la suma es: " + suma);
    }
    
}
