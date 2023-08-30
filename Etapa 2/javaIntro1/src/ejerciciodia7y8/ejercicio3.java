/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia7y8;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad en euros");
        double euros = read.nextDouble();
        System.out.println("Seleccione a que moneda desea convertir\nA- Dólares\nB- Yenes\nC- Libras\n");
        String sel = read.next();
        
        cambio(euros,sel);
        
    }
    
    
    
    public static void cambio(double euros, String moneda){
        
        switch (moneda.toUpperCase()){
            case "A" : {
                double dolar = euros * 1.28611;
                System.out.println(euros + " euros equivalen a $ " + dolar + " Dólares.");
                break;
            }
            case "B" : {
                double yen = euros * 129.852;
                System.out.println(euros + " euros equivalen a Y " + yen + " Yenes.");
                break;
            }
            case "C" : {
                double libra = euros * 0.86;
                System.out.println(libra + " euros equivalen a L " + libra + " Libras");
                break;
            }
        }
    }
    
}