/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entity.Cadena;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class CadenaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena c1) {
        /*deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.*/
        int contadorVocales = 0;
        System.out.println(c1.getLongitud());
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().charAt(i) == 'a' || c1.getFrase().charAt(i) == 'e' || c1.getFrase().charAt(i) == 'i' || c1.getFrase().charAt(i) == 'o' || c1.getFrase().charAt(i) == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println();
    }

    public void invertirFrase(Cadena c1) {
        String fraseOri = c1.getFrase();
        String fraseNueva = "";
        char letra;
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            letra = fraseOri.charAt(i);
            fraseNueva = fraseNueva.concat(String.valueOf(letra));
        }
        System.out.println("Frase invertida: " + fraseNueva);
        System.out.println();
    }

    public void vecesRepetido(Cadena c1) {
        System.out.println("Letra a buscar para contar veces que se repite:");
        String letraBuscada = String.valueOf(sc.next().charAt(0));
        String frase = c1.getFrase();
        int cont = 0;
        char letra;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letraBuscada.equalsIgnoreCase(String.valueOf(letra))) {
                cont++;
            }
        }
        System.out.println("Letra " + "'" + letraBuscada + "'" + " cantidad de veces repetida: " + cont);
        System.out.println();
    }

    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese una nueva frase para comparar las longitudes: ");
        String fraseNueva = sc.nextLine();
        if (fraseNueva.length() == c1.getFrase().length()) {
            System.out.println("Las longitudes son iguales");
        } else {
            System.out.println("Las longitudes son diferentes");
        }
    }

    public void unirFrases(Cadena c1) {
        /* deberá unir la frase contenida en la
        clase Cadena con una nueva frase ingresada por el usuario y mostrar
        la frase resultante.*/
        System.out.println("Ingrese una nueva frase para concatenarlas: ");
        String fraseUsuario = sc.nextLine();
        String fraseNueva = c1.getFrase().concat(fraseUsuario);
        System.out.println("Frase resultante: " + fraseNueva);
        System.out.println();
    }

    public void reemplazar(Cadena c1) {
        /*deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.*/
        System.out.println("Ingrese el valor por el cual desea reemplazar las letras 'a':");
        String letra = sc.next();
        String frase = c1.getFrase();
        frase = frase.replace("a", letra);
        System.out.println("Resultado: ");
        System.out.println(frase);
        System.out.println();
    }

    public void contiene(Cadena c1) {
        /*deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.*/

        String frase = c1.getFrase();
        System.out.println("Letra a buscar dentro de la frase: ");
        char letraBuscada = sc.next().charAt(0);
        char letra;
        boolean contiene = false;
        for (int i = 0; i < c1.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letra == letraBuscada) {
                contiene = true;
                break;
            }
        }
        if (contiene) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

    }
}
