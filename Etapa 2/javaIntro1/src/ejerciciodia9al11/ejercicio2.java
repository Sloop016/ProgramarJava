/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia9al11;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores
  aleatorios y le pida al usuario un número a buscar en el vector. El
  programa mostrará dónde se encuentra el numero y si se encuentra repetido
 * @author gabyg
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int dimV = sc.nextInt();
        
        int[] vector = new int [dimV];
        llenarV(vector, dimV);
        
        System.out.println("ingrese un nùmero a buscar");
        int num = sc.nextInt();
        
        int cantidad;
        cantidad = busca(vector, dimV, num);
                if (cantidad>1) {
                    System.out.println("El numero se encuenta mas de una vez");
            
        } else if (cantidad == 0) {
                    System.out.println("el numero no se encontro");
        }
    }
    public static void llenarV(int[] vector, int dimV){
        for (int i = 0; i < dimV; i++) {
            vector[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
    
    }
    public static int busca(int[] vector,int dimV, int num){
        int cont = 0;
        for (int i = 0; i < dimV; i++) {
            if (vector[i]== num) {
                if (cont == 0) {
                    System.out.println("El número se encontró en el índice: [" + i + "]");
                }
                cont++;
            }
        }
        return cont;
    }
    
}