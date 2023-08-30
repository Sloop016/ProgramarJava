package ejerciciodia4a6;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo");
        int limite = input.nextInt();
        int num;
        int suma = 0;
        do {
            num = input.nextInt();
            suma += num;
        } while (suma <= limite);

        System.out.println("La suma supera el limite: Su numero es " + suma);
    }
}
