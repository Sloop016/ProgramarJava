/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Arrays;

/**
 *
 * @author gabyg
 */
public class Ahorcado {
    private int longitud;
    private char[] palabra = new char[longitud];
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(int longitud,char[] palabra, int letrasEncontradas, int jugadasMax) {
        this.longitud = longitud;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
        this.palabra = palabra;
    }

    public int getLongitud() {
        return longitud;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "mainAhorcado{" 
                + "longitud=" + longitud 
                + ", palabra=" + Arrays.toString(palabra) 
                + ", letrasEncontradas=" + letrasEncontradas 
                + ", jugadasMax=" + jugadasMax + '}';
    }
    
    
    
}
