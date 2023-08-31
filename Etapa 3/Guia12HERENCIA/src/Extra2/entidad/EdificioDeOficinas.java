/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra2.entidad;

/**
 *
 * @author gabyg
 */
public class EdificioDeOficinas extends Edificio {

    private int numOfi;
    private int cantPers;
    private int numPiso;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOfi, int cantPers, int numPiso, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOfi = numOfi;
        this.cantPers = cantPers;
        this.numPiso = numPiso;
    }

    public int getNumOfi() {
        return numOfi;
    }

    public void setNumOfi(int numOfi) {
        this.numOfi = numOfi;
    }

    public int getCantPers() {
        return cantPers;
    }

    public void setCantPers(int cantPers) {
        this.cantPers = cantPers;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: " + ancho*largo);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: "+ ancho*alto*largo);
    }
    
    public void cantPeronas(){
        System.out.println("Cantidad de personas por Piso: "+cantPers*numOfi);
        System.out.println("Cantidad de personas por Edificio: "+cantPers*numOfi*numPiso);
    }
}
