/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra2;

import Extra2.entidad.Edificio;
import Extra2.entidad.EdificioDeOficinas;
import Extra2.entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author gabyg
 */
public class main {

    public static void main(String[] args) {
        ArrayList<Edificio> ed = new ArrayList();
        Polideportivo poli1 = new Polideportivo(20,3,30,true);
        Polideportivo poli2 = new Polideportivo(20,3,30,false);
        EdificioDeOficinas edo1 = new EdificioDeOficinas(10,15,10,3,5,5);
        EdificioDeOficinas edo2 = new EdificioDeOficinas(20,3,15,5,5,5);

        ed.add(poli1);
        ed.add(poli2);
        ed.add(edo1);
        ed.add(edo2);

        for (Edificio aux : ed) {
            if (aux instanceof Polideportivo) {
                aux.calcularSuperficie();
                aux.calcularVolumen();
                if (((Polideportivo) aux).isTechado()) {
                    System.out.println("Techado");
                } else {
                    System.out.println("No Techado");
                }

            }
            System.out.println();
            if (aux instanceof EdificioDeOficinas) {
                System.out.println("Edificio De Oficinas");
                aux.calcularSuperficie();
                aux.calcularVolumen();
                ((EdificioDeOficinas) aux).cantPeronas();
            }

        }

    }
}
