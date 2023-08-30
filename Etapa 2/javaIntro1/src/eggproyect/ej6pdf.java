package eggproyect;

import java.util.Scanner;

public class ej6pdf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > 25) {
            System.out.println("El primer numero es mayor a 25");

        } else if (num2 > 25) {
            System.out.println("El numero dos es mayor a 25");

        } else if (num2 > 25 & num1 > 25) {
            System.out.println("Ambos numeros son mayores a 25");

        } else {
            System.out.println("Ninguno de los numeros son mayor a 25");
        }

    }
}
