/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodia9al11;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra2 {
    
static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        System.out.println("Ingrese el tamaño de los vectores");
        int dimv = read.nextInt();
        
        int[] v1 = new int[dimv];
        int[] v2 = new int[dimv];
        
        System.out.println("Llene el primer vector");
        llenarVector(v1);
        
        System.out.println("Llene el vector a comparar");
        llenarVector(v2);

        
        if (comparar(v1, v2)) {
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores son diferentes");
        }
        
    }
    
    public static void llenarVector(int[] v1){
        for (int i = 0; i < v1.length; i++) {
            System.out.print("[" + i + "] >> ");
            v1[i] = read.nextInt();
        }
    }
    
    public static boolean comparar(int[] v1, int[] v2){
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }
        return true;
    }
    
}
