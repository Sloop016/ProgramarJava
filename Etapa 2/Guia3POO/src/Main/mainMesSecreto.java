/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class mainMesSecreto {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int numMesSecreto = elegirMesSecreto();
        String mesSecreto = meses[numMesSecreto];

//        System.out.println(mesSecreto);

        System.out.println("Ingrese el mes que cree que es el mes Secreto:");
        boolean adivinado = false;
        do {
            String mesUsuario = sc.nextLine();
            if (mesUsuario.equalsIgnoreCase(meses[numMesSecreto])) {
                System.out.println("¡Ha acertado!");
                adivinado = true;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }


        } while (adivinado == false);
        //Comentario

    }

    public static int elegirMesSecreto() {
        Random random = new Random();
        int mes = random.nextInt(11) + 1;
        return mes;
    }
}

