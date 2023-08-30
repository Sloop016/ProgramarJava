/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author gabyg
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private double precio;
    private int año;

    public Coche() {
    }

    public Coche(String marca, String modelo, double precio, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAño() {
        return año;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + "\nMarca: " + marca + "\nModelo: " + modelo + "\nPRECIO: $" + precio + "\nA\u00f1o: " + año;
    }
}
