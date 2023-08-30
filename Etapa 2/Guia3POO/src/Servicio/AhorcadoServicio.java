/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entity.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class AhorcadoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");


    /*Le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.*/
    public Ahorcado crearJuego() {
        Ahorcado a = new Ahorcado();
        System.out.println("Ingrese la palabra:");
        String cadena = sc.next();
        //Setear longitud del arreglo
        a.setLongitud(cadena.length());
        //Pasar el String cadena dentro del arreglo letra por letra
        a.setPalabra(cadena.toCharArray());
        System.out.println("Cantidad de jugadas maximas:");
        a.setJugadasMax(sc.nextInt());
        return a;
    }

    public void Longitud(Ahorcado a) {
        System.out.println("La longitud de la palabra es " + a.getLongitud());
    }

    /*
    este método recibe una letra dada por el usuario y 
    busca si la letra ingresada es parte de la palabra o no. 
    También informará si la letra estaba o no.
     */
    public boolean buscar(Ahorcado a, String letra, char[] palabra) {
        /*Este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.*/
        int cont = 0;
        for (int i = 0; i < a.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(a.getPalabra()[i]))) {
                //Agrega la letra al vector Palabra
                palabra[i] = a.getPalabra()[i];
                cont++;
            }
        }
        a.setLetrasEncontradas(a.getLetrasEncontradas() + cont);
        return cont > 0;
    }

    public void encontradas(Ahorcado a, String letra, char[] palabra) {
        /*Que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.*/
        boolean esta = buscar(a, letra, palabra);
        if (esta) {
            System.out.println("Existe la letra en la palabra");
        } else {
            System.out.println("No existe la letra en la palabra");
            a.setJugadasMax(a.getJugadasMax() - 1);
        }
    }

    public void intentos(Ahorcado a, char[] palabra) {
        int encontradas = a.getLetrasEncontradas();
        int restantes = a.getLongitud() - a.getLetrasEncontradas();
        System.out.println(Arrays.toString(palabra));
        System.out.println("Número de letras (encontradas, faltantes): " + encontradas + "," + restantes);
        System.out.println("Intentos restantes: " + a.getJugadasMax());
    }
    /*El método juego se encargará de llamar todos los
    métodos previamente mencionados e informará cuando el usuario
    descubra toda la palabra o se quede sin intentos. Este método se
    llamará en el main.*/
    public void juego(Ahorcado a, char[] palabra) {
        System.out.println("Ingrese una letra a buscar");
        String letra = String.valueOf(sc.next().charAt(0));
        encontradas(a,letra,palabra);
        intentos(a,palabra);
    }
}
