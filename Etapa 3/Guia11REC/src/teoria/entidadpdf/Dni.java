/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.entidadpdf;

/**
 *
 * @author gabyg
 */
public class Dni {

    private char letra;
    private int numero;
    private Persona persona;

    public Dni() {
    }

    public Dni(char letra, int numero, Persona persona) {
        this.letra = letra;
        this.numero = numero;
        this.persona = persona;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
   

}
