package ejerciciodia7y8;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        int num;
     
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para determinar si es primo o no");
        num = sc.nextInt();

        ejercicio4.esPrimo(num);

    }

    static void esPrimo(int num) {
        int j=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                j++;}
            }
        if(j==2) {
            System.out.println("El numero " + num + " es primo");

        }else {
            System.out.println("El numero "+ num + " no es primo");

        }

    }
}

