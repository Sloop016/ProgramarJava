/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3y4;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class main {
   
    public static void main(String[] args) {
        /**
         * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
         * números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
         * para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int.
         * Por ultimo realizar una división con los dos numeros y mostrar el resultado.
         */
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero 1:");
        String num1 = sc.next();
        System.out.println("Ingrese el numero 2:");
        String num2 = sc.next();

        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        try {
            System.out.println(numero1/numero2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("***");
        }
    
}
}
