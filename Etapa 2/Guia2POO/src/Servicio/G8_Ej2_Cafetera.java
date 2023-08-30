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
package g8_ej2_cafetera;

import g8_ej2_cafetera.serivicios.servicioCafetera;
import g8_ej2_cafetera.entidades.Cafetera;
import java.util.Scanner;

public class G8_Ej2_Cafetera {

    public static void main(String[] args) {
        
        servicioCafetera sv= new servicioCafetera();
        Cafetera C1= new Cafetera();
       
        Scanner leer= new Scanner(System.in);
        boolean opcion=true;
        System.out.println("Ingrese una opcion");
        System.out.println("1. Llenar la cafetera");
        System.out.println("2. Servir una taza");
        System.out.println("3. Vaciar la cafetera");
        System.out.println("4. Agregar más café");
        System.out.println("5. Salir");
        int num= leer.nextInt();
        
        do {
            switch (num) {
                case 1:sv.llenarCafetera(C1);
                break;
                case 2: sv.servirTaza(C1);
                break;
                case 3: sv.vaciarCafetera(C1);
                break;
                case 4: sv.agregarCafe(C1);
                break;
                case 5: opcion=false;
                break;
                default: System.out.println("Opcion inválida. Ingrese nuevamente");
            }
            
        } while (opcion);
        
        
    }
    
    
}

  
