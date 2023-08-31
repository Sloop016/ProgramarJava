/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra2.entidad;

/**
 *
 * @author gabyg
 */
public class Polideportivo extends Edificio {

    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, boolean techado) {
        super(ancho, alto, largo);
        this.techado = techado;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: " + ancho*largo);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: "+ ancho*alto*largo);
    }

}
