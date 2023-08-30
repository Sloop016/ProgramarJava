package eggproyect;

import java.util.Scanner;

public class ej8pdf {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero del 1 al 10: ");
        int resp = input.nextInt();
        
       while (11 <= resp) {
      	 
    	System.out.println("Incorrecto, ingrese un numero del 1 al 10:");
    	resp = input.nextInt();
   	   }
        System.out.println("Su numero es correcto");
    }
}
