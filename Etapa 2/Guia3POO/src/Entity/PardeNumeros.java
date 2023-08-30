/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author gabyg
 */
public class PardeNumeros {
    private double num1;
    private double num2;

    public PardeNumeros() {
        this.num1= (int) (Math.random()* (10-1+1))+1;
        this.num2= (int) (Math.random()* (10-1+1))+1;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "PardeNumeros{" 
                + "num1=" + num1 
                + ", num2=" + num2 + 
                '}';
    }



}
