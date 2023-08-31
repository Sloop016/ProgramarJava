/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import javax.persistence.*;

/**
 *
 * @author gabyg
 */
public class DAO <T> {
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia16.1JPAPU");
    protected EntityManager em = emf.createEntityManager();

    protected void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void guardar(T entidad) {
        conectar();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        desconectar();
    }


    public void editar(T entidad) {
        conectar();
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
        desconectar();
    }


    public void eliminar(T entidad) {
        conectar();
        em.getTransaction().begin();
        em.remove(entidad);
        em.getTransaction().commit();
        desconectar();
    }


}

