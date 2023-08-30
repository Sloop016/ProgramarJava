package ejerciciodia2y3;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número 
 * entero por teclado y muestre por pantalla 
 * el doble, el triple y la raíz cuadrada 
 * de ese número. 
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        int numdoble = num * 2;
        int numtriple = num * 3;
        double RCuadrada = Math.sqrt(num);
        System.out.println("Su doble es: " + numdoble);
        System.out.println("Su triple es : " + numtriple );
        System.out.println("Su raiz cuadrada es: " + RCuadrada );
        
    }
}
 
