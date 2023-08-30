package Servicio;

import Entity.Estudiante;
import java.util.Scanner;


public class EstServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Estudiante crearEstudiante(){
        Estudiante e1 = new Estudiante();
        System.out.println("Nombre del estudiante:");
        e1.setNombre(leer.next()); 
        System.out.println("Nota:");
        e1.setNota(leer.nextFloat()) ;
        return e1;
    }
    
    //Calcular y mostrar el promedio de notas de todo el curso
    public String[] calcular(Estudiante[] e1){
        float t = 0; int c1 = 0; int c2 = 0;
        for (Estudiante est : e1) {
            t+= est.getNota();
        }
        System.out.println("El promedio del curso es de: " + (t/e1.length));
        
        for (Estudiante est : e1) {
            if (est.getNota() > t/e1.length){
                c1++;
            }
        }
        String[] mayorPromedio = new String[c1];
        
        for (Estudiante est : e1) {
            if((est.getNota() > t/e1.length)){
                mayorPromedio[c2] = est.getNombre() + " con la nota de: " + est.getNota();
                c2++;
            }
                
        }
        return mayorPromedio;
    }
}
