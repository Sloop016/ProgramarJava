package ejerciciodia4a6;

import java.util.Scanner;

public class extra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = sc.next();
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es una vocal");
        }
    }
}
