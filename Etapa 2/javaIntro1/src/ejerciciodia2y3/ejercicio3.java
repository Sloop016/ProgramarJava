package ejerciciodia2y3;
import java.util.Scanner;
/**
Escribir un programa que pida una 
* frase y la muestre toda en 
* mayúsculas y después toda en minúsculas.  */
public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su frase");
        String frase = leer.nextLine();
        System.out.println("Su Frase en MAYUS es: " + frase.toLowerCase());
        System.out.println("Su Frase en min es: " + frase.toUpperCase());
    }
    
}
