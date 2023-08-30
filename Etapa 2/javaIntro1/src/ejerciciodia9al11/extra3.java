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
public class extra3 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño para el vector");
        int dimv = sc.nextInt();
        
        int[] v = new int[dimv];
        
        llenar(v);
        impr(v);
    }
    
    public static void llenar(int[] v){
        
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 99) + 1;
        }
        
    }
    
    public static void impr(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        
    }
    
  
    
}   

