/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodia9al11;

import java.util.Scanner;

public class ejercicio6 {

    static Scanner sc = new Scanner(System.in); 
   
   /**
 *
 * @author gabyg
     * @param args
 */
    public static void main(String[] args) {

        int dimv;
        System.out.println("Ingrese el tamaño de la matriz, sin superar 10");
        dimv = sc.nextInt();
        
        if (dimv<1 || dimv>10) { //limito el tamaño a 10
            do {
               System.out.println("Ingrese un tamaño válido");
               dimv = sc.nextInt();
               //hasta que no se ingrese un tamaño entre 1 y 10 no se saldrá del bucle
            } while (dimv< 1 || dimv >10); 
        }

        int[][] array = new int[dimv][dimv];//defino el array
        
        llenar(array, dimv);//llamo a la función para rellenar el array
        
        boolean verif = magic(array, dimv);//retorno la verificación de las sumas
        
        mostrar(array,dimv);
        if (verif) {
            System.out.println("\n Es un cuadrado mágico :)\n");
        }else{
            System.out.println("\n No es un cuadrado mágico :(\n");
        }
        
        
    }
        
    
    public static void llenar(int[][] array, int dimv){
        int num;
        
        System.out.println("Rellene la matriz");
        
        for (int i = 0; i < dimv; i++) {
            for (int j = 0; j < dimv; j++) {
                do {
                    System.out.print("[" + i + ", " + j + "] >> ");
                    num = sc.nextInt();
                } while (num<1 || num>dimv*dimv);
                array[i][j] = num;
            }
        }  
    }
    
    public static boolean magic(int[][] array, int dimv){
        
        int diagPrinc = 0, diagSec = 0, sumaFila, sumaCol;
        boolean magic;
        
        for (int i = 0; i < dimv; i++) {
            diagPrinc += array[i][i];
            diagSec += array[i][dimv-1-i];
        }
        //comparo los valores de las sumas de las diagonales
        magic = (diagPrinc == diagSec);
        
        if (magic) {
            for (int i = 0; i < dimv; i++) {
                sumaFila = 0;
                sumaCol = 0;
                for (int j = 0; j < dimv; j++) {
                    sumaFila += array[i][j];
                    sumaCol += array[j][i];
                }
                //comparo las sumas de columnas y filas con la diagonal
                magic = (sumaFila == sumaCol) && (sumaFila == diagPrinc); 
            }
        }
        return magic;
    }
    
    public static void mostrar(int[][] array, int dimv){
        for (int i = 0; i < dimv; i++) {
            for (int j = 0; j < dimv; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("");
        }
    }
}