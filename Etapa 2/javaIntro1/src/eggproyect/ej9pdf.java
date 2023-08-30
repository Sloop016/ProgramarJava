package eggproyect;

import java.util.Scanner;

public class ej9pdf {

    public static void main(String[] args) {

        int num = 0, suma = 0;
        int apos = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Intruce un numero: ");
            num = input.nextInt();
            suma = suma + num;
            apos = apos + 1;

        } while (num != 0 && 21 >= apos);
        System.out.println("La Suma de todos los numeros es: " + suma);

    }
}
