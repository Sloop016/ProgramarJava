/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entity.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayor(Persona p1) {
        return p1.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Persona PC = new Persona();
        boolean s = false;
        System.out.println("Nombre:");
        PC.setNombre(leer.next());

        System.out.println("Ingresa tu edad");
        PC.setEdad(leer.nextInt());

        do {
            System.out.println("Ingresa tu sexo (H = Hombre, M = Mujer, O = Otro)");
            PC.setSexo(leer.next());
            if (PC.sexo.equalsIgnoreCase("M") || PC.sexo.equalsIgnoreCase("H") || PC.sexo.equalsIgnoreCase("O")) {
                System.out.println("Es correcto");
                s = true;
            } else {
                System.out.println("Es incorrecto");
            }
        }
        while (!s);

        System.out.println("Ingresa tu peso");
        PC.setPeso(leer.nextFloat());

        System.out.println("Ingresa tu altura (en metros)");
        PC.setAltura(leer.nextFloat());

        return PC;
    }
    public int calcularIMC(Persona p1){
        //kg/(altura^2)
        if (p1.peso/(p1.altura*p1.altura) < 20){
            System.out.println(p1.nombre + " esta por debajo de su peso ideal");
            return -1;
        }
        else if (p1.peso/(p1.altura*p1.altura) >= 20 && p1.peso/(p1.altura*p1.altura) <= 25){
            System.out.println(p1.nombre + " esta en su peso ideal");
            return 0;
        }
        else{
            System.out.println(p1.nombre + " esta por encima de su peso ideal");
            return 1;
        }
    }
}
