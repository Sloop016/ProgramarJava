/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra1;

import Extra1.Entidades.Alquiler;
import Extra1.Entidades.Barco;
import Extra1.Entidades.BarcosaMotor;
import Extra1.Entidades.Velero;
import Extra1.Entidades.Yate;
import Extra1.Servicio.AlquilerServicios;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        AlquilerServicios alquilerServicios = new AlquilerServicios();

        ArrayList<Barco> barcoArrayList = new ArrayList<>();

        Velero veleroObj = new Velero("ASD789", 20d, 2020, 3);
        barcoArrayList.add(veleroObj);
        BarcosaMotor barcoObJ = new BarcosaMotor("EFG123", 50d, 2012, 100);
        barcoArrayList.add(barcoObJ);
        Yate yateObj = new Yate("HIJ456", 30d, 2022, 110, 3);
        barcoArrayList.add(yateObj);

        System.out.println("Qué barco desea alquilar?");
        for (Barco aux : barcoArrayList) {
            if (aux instanceof Velero) {
                System.out.println("Velero: " + aux.getMatricula());
            }
            if (aux instanceof BarcosaMotor) {
                System.out.println("Barco a Motor: " + aux.getMatricula());
            }
            if (aux instanceof Yate) {
                System.out.println("Yate: " + aux.getMatricula());
            }
        }
        String barcoAlquiler = sc.next();
        for (Barco aux : barcoArrayList) {
            if (aux.getMatricula().equalsIgnoreCase(barcoAlquiler)) {
                Alquiler alquiler = new Alquiler();
                Alquiler alquilerBarco = alquiler.alquiler(aux);
                aux.setAlquiler(alquilerBarco);
                aux.totalAlquiler();
            }
        }
        alquilerServicios.mostrarAlquileres(veleroObj);
        //DONE
    }
}
