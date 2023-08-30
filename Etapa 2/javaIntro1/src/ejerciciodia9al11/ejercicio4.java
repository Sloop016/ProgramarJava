/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia9al11;

/**
 *
 * @author gabyg
 */
public class ejercicio4 {

    public static void main(String[] args) {
        int[][] num = new int[4][4];
        
        System.out.println("\n===========================");
        llenar(num);
        System.out.println("Arreglo original\n");
        mostrar(num);
        System.out.println("\n===========================\n");
        System.out.println("Arreglo Traspuesto\n");
        mostrarTraspuesto(num);
        System.out.println("===========================\n");

    }

    public static void llenar(int[][] num) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 98) + 1;
            }
        }
    }

    public static void mostrar(int[][] num) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" |" + num[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    public static void mostrarTraspuesto(int[][] num) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" |" + num[j][i] + "| ");
            }
            System.out.println("");
        }
    }
}
