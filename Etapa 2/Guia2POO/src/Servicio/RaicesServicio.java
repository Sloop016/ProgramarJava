/*



Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package Servicio;

import Entity.Raices;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class RaicesServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void datos (Raices r){
        System.out.println("ingrese las variables a b y c");
        r.setA(sc.nextInt());
        r.setB(sc.nextInt());
        r.setC(sc.nextInt());
    }

        /*Método getDiscriminante(): devuelve el valor del discriminante (double). 
    El discriminante tiene la siguiente fórmula: (b^2)-4*a*c */
    public double getDiscriminante(Raices r) {

        double discriminante = (Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));
        return discriminante;
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos 
    soluciones, para que esto ocurra, el discriminante debe ser 
    mayor o igual que 0.*/
    public boolean tieneRaices(Raices r) {

        double discriminante = getDiscriminante(r);
        return discriminante > 0;
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
    el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaiz(Raices r) {
        double discriminante = getDiscriminante(r);
        return discriminante == 0;
    }
   /* Método obtenerRaices(): llama a tieneRaices() 
    y si devolvió true, imprime las 2 posibles soluciones.*/
    
    public void obtenerRaices(Raices r){
        double discriminante = getDiscriminante(r);
        double raiz1 = ((-r.getB() + Math.sqrt(discriminante)) / (2 * r.getA()));
        double raiz2 = ((-r.getB() - Math.sqrt(discriminante)) / (2 * r.getA()));
        if (tieneRaices(r)) {
            System.out.println("La raiz 1 es: " + raiz1);
            System.out.println("La raiz 2 es: " + raiz2);
        } else {
            System.out.println("No tiene raices.");
        }
       
    }
    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. 
    Es en el caso en que se tenga una única solución posible.*/
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)) {
            double i = (-r.getB() / (2 * r.getA()));
            System.out.println("Unica solucion: " + i);
        } else {
            System.out.println("No existe una única solución.");
        }
    }
    
    /*Método calcular(): este método llamara tieneRaices() y a tieneRaiz(), y mostrara
    por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o 
    obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrara un mensaje.*/
    public void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("No existen soluciones reales.");
        }
        System.out.println("================================================");
    }

   }
