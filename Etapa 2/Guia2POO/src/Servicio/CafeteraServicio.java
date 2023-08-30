/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los 
atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y 
cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor 
vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
-Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
-El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entity.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    String op;

    public String menu(Cafetera c1) {

        System.out.println("\nQue desea hacer?");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir Taza");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Agregar Cafe");
        System.out.println("5. Cantidad de Cafe Actual");
        System.out.println("0. SALIR");
        op = leer.next();

        switch (op) {
            case "1":
                llenarCafetera(c1);
                break;
            case "2":
                System.out.println("Tamaño de la taza:");
                servirTaza(c1, leer.nextInt());
                break;
            case "3":
                vaciarCafetera(c1);
                break;
            case "4":
                System.out.println("Cuanto quiere agregar?(en ml):");
                agregarCafe(c1, leer.nextInt());
                break;
            case "5":
                System.out.println("Cafe actual: " + c1.cantActual + "ml");
                break;
            case "0":
                System.out.println("Gracias por utilizar esta cafetera");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        return op;
    }

    public void llenarCafetera(Cafetera c1) {
        c1.cantActual = c1.cantMaxima;
        System.out.println("Cafetera llenada");
    }

    public int servirTaza(Cafetera c1, int taza) {
        if (taza > c1.cantActual) {
            System.out.println("En la cafetera solo quedan " + c1.cantActual + "ml,se servira todo.");
            c1.cantActual = 0;
            return 0;
        } else {
            c1.cantActual -= taza;
            System.out.println("Se llenó la taza");
            return c1.cantActual;
        }
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantActual(0);
        System.out.println("Cafetera vaciada");
    }

    public int agregarCafe(Cafetera c1, int cantidad) {
        if (c1.cantActual + cantidad > 1000) {
            c1.cantActual = 1000;
            System.out.println("Se agrego demasiado cafe,se rellenara hasta el maximo");
        } else {
            c1.cantActual += cantidad;
            System.out.println("Se añadieron " + cantidad + "ml");
        }

        return c1.cantActual;
    }
}
