/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

/**
 *
 * @author gabyg
 */
import entidades.Cliente;
import persistencia.ClienteDAO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClienteService {
    private final ClienteDAO DAO;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ClienteService() {
        this.DAO = new ClienteDAO();
    }

    public void crearCliente() {
        Cliente cliente = new Cliente();
        try {
            while (true) {
                try {
                    System.out.println("Ingrese el documento del cliente");
                    cliente.setDocumento(leer.nextLong());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Tipo de dato incorrecto.");
                    leer.nextLine(); // Limpiar el buffer del scanner
                }
            }
            boolean existe = DAO.existeCliente(cliente);
            if (existe) {
                System.out.println("Ya existe un Cliente asociado a ese documento!");
                crearCliente();
            }else {
                System.out.println("Ingrese el nombre del cliente");
                cliente.setNombre(leer.next());

                System.out.println("Ingrese el apellido del cliente");
                cliente.setApellido(leer.next());

                System.out.println("Ingrese el telefono del cliente");
                cliente.setTelefono(leer.next());

                if (!existe) {
                    DAO.guardar(cliente);
                    System.out.println("Cliente creado");
                }
            }
        } catch (
                Exception e) {
            System.out.println("Error al ingresar los datos");
        }
    }

    public void listarClientes() {
        try {
            DAO.listarClientes();
        } catch (Exception e) {
            System.out.println("Error al listar los clientes");
        }
    }

    public Cliente buscarClientePorDocumento() {
        long documento;
        while (true) {
            try {
                System.out.println("Ingrese el documento del cliente a buscar:");
                documento = leer.nextLong();
                return DAO.buscarClientePorDocumento(documento);
            } catch (Exception e) {
                System.out.println("Error al ingresar el documento");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }
}
