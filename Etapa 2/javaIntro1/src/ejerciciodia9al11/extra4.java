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
public class extra4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de alumnos a promediar: ");
        int alu = sc.nextInt();
        int apr = 0;
        int des = 0;
        double[][] notas = new double[10][4];
        double[] promedio = new double[10];
        
        intNotas(notas, alu);
        
        promedio(notas,promedio, alu);
        
        for (int i = 0; alu >= i+1; i++) {
            if (promedio[i]>=7) {
                apr++;
            }else{
                des++;
            }
        }
        System.out.println("");
        System.out.println("La cantidad de aprobados es: " + apr);
        System.out.println("");
        System.out.println("La cantidad de desaprobados es: " + des);
        System.out.println("");
    }

    public static void intNotas(double[][] notas, int alu) {

        for (int i = 0; i < alu; i++) {

            System.out.println("ingrese las notas para el alumno:" + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println("" + (j + 1) + "º →");
                notas[i][j] = sc.nextDouble();
            }

        }
        

    }

    public static void promedio(double[][] notas, double[] promedio, int alu) {
        for (int i = 0; i < alu; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        promedio[i] += notas[i][j] * 0.10;
                        break;
                    case 1:
                        promedio[i] += notas[i][j] * 0.15;
                        break;
                    case 2:
                        promedio[i] += notas[i][j] * 0.25;
                        break;
                    case 3:
                        promedio[i] += notas[i][j] * 0.50;
                        break;
                }
            }
        }

    }
}   