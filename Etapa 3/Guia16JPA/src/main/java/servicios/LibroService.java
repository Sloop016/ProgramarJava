/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import persistencia.LibroJpaController;

/**
 *
 * @author gabyg
 */
public class LibroService {
    LibroJpaController controladorLibro;

    public LibroService() {
        this.controladorLibro = new LibroJpaController();
    }
    
    
}
