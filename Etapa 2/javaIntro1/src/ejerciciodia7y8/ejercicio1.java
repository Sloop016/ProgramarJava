package ejerciciodia7y8;

import java.util.Scanner;

/**
* Diseñe una función que pida el nombre y la edad de N 
* personas e imprima los datos de las personas ingresadas por teclado 
* e indique si son mayores o menores de edad. Después de cada persona, 
* el programa debe preguntarle al usuario si quiere seguir mostrando personas 
* y frenar cuando el usuario ingrese la palabra “No”.
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int sel;
        
        do {
            System.out.println("Elija una opción");
            System.out.println("\n1 - Sumar\n2 - Restar\n3 - Dividir\n4 - Multiplicar\n5 - Salir");
            sel = read.nextInt();
            
            switch (sel){
            case 1 : {
                int suma = sumar(num1,num2);
                System.out.println("El resultado de la suma es: "+ suma);
                }
            case 2 : {
                int resta = restar(num1,num2);
                System.out.println("El resultado de la resta es: "+ resta);
                }
            case 3 : {
                double div = dividir(num1,num2);
                System.out.println("El resultado de la división es: "+ div);
                }
            case 4 : {
                int mult = multip(num1,num2);
                System.out.println("El resultado de la multiplicación es: "+ mult);
                }
            case 5 : System.out.println("Eligió salir");
            }
        } while(sel != 5);
        
    }
    
    
    public static int sumar(int x,int y){
        return x+y;
    }
    
    
    public static int restar(int x,int y){
        return x-y;
    }
    
    
    public static double dividir(double x,double y){
        return x/y;
    }
    
    
    public static int multip(int x,int y){
        return x*y;
    }
    
    
}    

