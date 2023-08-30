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
public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta:{"
                + "Titular='" + titular + '\''
                + ", Saldo=" + saldo
                + '}';
    }

    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        Cuenta nuevaCuenta = new Cuenta();
        System.out.println("Titular:");
        nuevaCuenta.setTitular(leer.nextLine());
        System.out.println("Saldo:");
        nuevaCuenta.setSaldo(leer.nextDouble());
        return nuevaCuenta;
    }

    public void retirarDinero(Cuenta cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto desea retirar?");
        double retiro = leer.nextDouble();
        if (cuenta.getSaldo() < retiro) {
            System.out.println("No es posible retirar esa cantidad!");
        } else {
            cuenta.setSaldo(saldo - retiro);
        }
    }
}
