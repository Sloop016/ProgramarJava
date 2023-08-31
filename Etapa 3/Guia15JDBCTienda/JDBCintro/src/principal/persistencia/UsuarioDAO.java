/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.dominio_usuario.Usuario;

public final class UsuarioDAO extends DAO {

    private UsuarioDAO dao;

    public UsuarioDAO() {
        this.dao = new UsuarioDAO();
    }

    public void crearUsuario(String correoElectronico, String clave) throws Exception {
        try {

            //validaciones
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electronico");
            }
            if (correoElectronico.contains("@") == false) {
                throw new Exception("Correo electronico invalido");
            }
            if (clave == null || clave.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave");
            }
            if (clave.length() < 8) {
                throw new Exception("La clave no puede tener menos de 8 caracteres. ");
            }
            if (buscarUsuarioPorCorreoElectronico(correoElectronico) != null) {
                throw new Exception("El correo Electronico esta existe: " + correoElectronico);
            }

            // generacion de usuario
            Usuario usuario = new Usuario();
            usuario.setCorreoElectronico(correoElectronico);
            usuario.setClave(clave);
            dao.guardarUsuario(usuario);
        } catch (Exception e) {
            throw e;
        }
    }

    public void guardarUsuario(Usuario usuario) throws Exception {
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar un usuario");

            }

            String sql = "INSERT INTO Usuario (correoElectronico, clave)"
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception {
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar el usuario que desea modificar");
            }
            String sql = "UPDATE Usuario SET" + "clave = '" + usuario.getClave() + "'WHERE correoElectronico = '"
                    + usuario.getCorreoElectronico() + "' );";
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarUsuario(String correElectronico) throws Exception {
        try {
            String sql = "DELETE FROM Usuario WHERE correoElectronico = '" + correElectronico + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {
        try {
            String sql = "SELECT * FROM Usuario " + " WHERE correoElectronico = '" + correoElectronico + "'";
            consultarBase(sql);
            Usuario usuario = null;
            while (resultado.next()) {

                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));

            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Usuario> listarUsuarios() throws Exception {
        try {
            String sql = "SELECT correoElectrico, clave FROM Usuario ";
            consultarBase(sql);
            Usuario usuario = null;
            Collection<Usuario> usuarios = new ArrayList();
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setCorreoElectronico(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
                usuarios.add(usuario);
            }
            desconectarBase();
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

    public Usuario buscarUsuarioPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
