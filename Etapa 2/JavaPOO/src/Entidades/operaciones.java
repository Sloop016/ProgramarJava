/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class operaciones {

    static Scanner sc = new Scanner(System.in);
    private int num1;
    private int num2;
    private int opc;

    public operaciones() {

    }
//---------------------------------------------------------------- 
// Constructor
//----------------------------------------------------------------    

    public operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

//----------------------------------------------------------------
// Getting y Setting    
//----------------------------------------------------------------
    public int getLadoA() {
        return num1;
    }

    public void setLadoA(int num1) {
        this.num1 = num1;
    }

    public int getLadoB() {
        return num2;
    }

    public void setLadoB(int num2) {
        this.num2 = num2;
    }
    //----------------------------------------------------------------
    // Lectura de datos
    //----------------------------------------------------------------

    public void crearOP() {
        System.out.println("Ingrese los dos numeros solicitados: ");

        System.out.println("Numero 1:");
        num1 = sc.nextInt();
        System.out.println("Numero 2:");
        num2 = sc.nextInt();
    }

    //----------------------------------------------------------------
    // Switch
    //----------------------------------------------------------------
    public int opcion() {
        opc = sc.nextInt();
        if ((opc > 4) || (opc != 0)) {
            return opc;
        }
        return 0;
    }

    //----------------------------------------------------------------
    // Operaciones
    //----------------------------------------------------------------
    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public double multiplicacion() {
        if ((num1 != 0) && (num2 != 0)) {
            return num1 * num2;
        } else {
            System.out.println("No se puede multiplicar por 0.");
        }
        return 0;
    }

    public double division() {
        if ((num1 != 0) && (num2 != 0)) {
            return num1 / num2;
        } else {
            System.out.println("No se puede Dividir por 0.");
        }
        return 0;
    }
}
