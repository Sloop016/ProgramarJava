 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Autor;
import persistencia.AutorDAO;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class AutorService {
    private final AutorDAO DAO;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AutorService() {
        this.DAO = new AutorDAO();
    }

    public void elminarAutor(){
        Autor autor1 = new Autor();
        System.out.println("ingrese el id del Autor a borrar: ");
        autor1.setId(leer.nextInt());
        
        boolean existe = DAO.existeAutor(autor1);
        
        try {
            if (!existe) {
                DAO.eliminar(autor1);
                System.out.println("autor eliminado correctamente");
            } else{
                System.out.println("el autor no esta.");
            }
                
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage()); 
       }
    }
    
    public void cargarAutor() {
        Autor autor = new Autor();
        System.out.println("Ingrese el nombre del autor:");
        autor.setNombre(leer.next());

        boolean existe = DAO.existeAutor(autor);
        try {
            if (!existe) {
                DAO.guardar(autor);
                System.out.println("Autor cargado correctamente");
            } else {
                System.out.println("El autor ya existe");
                cargarAutor();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void buscarAutorPorNombre() {
        try {
            System.out.println("Ingrese el nombre del autor:");
            String nombre = leer.next();
            DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Autor buscarAutorPorId() {
        try {
            System.out.println("Ingrese el id del autor:");
            int l = leer.nextInt();
            return DAO.buscarPorId(l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontró el autor");
            return null;
        }
    }

    public void listarAutores() {
        try {
            DAO.listarAutores();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarAutorPorId() {
        try {
            System.out.println("Ingrese el id del autor que desea modificar:");
            int l = 0;
            try {
                while (true) {
                    l = leer.nextInt();
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
            Autor autor = DAO.buscarPorId(l);
            if (autor != null) {
                System.out.println("Ingrese el nuevo nombre del autor:");
                autor.setNombre(leer.next());
                if (!DAO.existeAutor(autor)) {
                    DAO.editar(autor);
                    System.out.println("Autor modificado correctamente");
                } else {
                    System.out.println("El autor ya existe");
                    modificarAutorPorId();
                }
            } else {
                leer.next();
                modificarAutorPorId();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void altaBajaAutorPorId() {
        try {
            System.out.println("Ingrese el id del autor que desea dar de Alta/Baja:");
            Integer l = leer.nextInt();
            DAO.altaBajaAutor(l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 }