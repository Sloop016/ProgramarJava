/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos 
capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
(la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters.
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para 
llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse
llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera
la cantidad de café indicada
 */
package g8_ej2_cafetera.serivicios;

import g8_ej2_cafetera.entidades.Cafetera;
import java.util.Scanner;


public class servicioCafetera {
Scanner leer= new Scanner (System.in);
 
    public void llenarCafetera(Cafetera cf1){
      // Cafetera cf1= new Cafetera();//Instancio el objeto vacio cafetera y luego le cargo los valores a los atributos del mismo.
       cf1.setcantidadActual(cf1.getcapacidadMaxima());//Igualo la cantidad actual de cafe a la capacidad máxima.
       System.out.println("La capicidad máxima es de " + cf1.getcantidadActual() + " mililitros");
    }

    public void servirTaza(Cafetera cf1){
        System.out.println("Ingresa la capacidad de la taza en mililitros");
        int taza= leer.nextInt();
        if (taza<= cf1.getcantidadActual()) {
            cf1.setcantidadActual (cf1.getcantidadActual()-taza);  
        } else {
            taza= cf1.getcantidadActual();
            System.out.println("No es posible llenar esta taza. Solo se sirvieron " + cf1.getcantidadActual() + " mililitros de cafe");
            cf1.setcantidadActual(0);
        }
    }   
    public void vaciarCafetera(Cafetera cf1){
         cf1.setcantidadActual(0);
    }
   
    public void agregarCafe(Cafetera cf1){
         System.out.println("Ingresa la cantidad de cafe en mililitros");
         int agregar= leer.nextInt();
    
        while (agregar>cf1.getcapacidadMaxima()){
            System.out.println("Esa cantidad supera la capacidad máxima de la cafetera");
            System.out.println("Ingresa una nueva cantidad de cafe en militros");
            agregar= leer.nextInt();
        } 
            cf1.setcantidadActual(agregar);
    }
}



