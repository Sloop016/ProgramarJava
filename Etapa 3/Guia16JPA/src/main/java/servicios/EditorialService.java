/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import persistencia.EditorialJpaController;

/**
 *
 * @author gabyg
 */
public class EditorialService {
    
    EditorialJpaController controladorEditorial;

    public EditorialService() {
        this.controladorEditorial = new EditorialJpaController();
    }
    
    
}
