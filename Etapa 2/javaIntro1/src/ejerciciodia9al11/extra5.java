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
public class extra5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ingrese cantidad de filas: ");
        int n = sc.nextInt();
        System.out.println("ingrese cantidad de columnas: ");
        int m = sc.nextByte();
        int[][] matriz = new int[n][m];
        int suma = 0 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]= (int)(Math.random()*(10-1)+1);
                suma= suma+matriz[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos es : "+suma);
    }
    
            
}
