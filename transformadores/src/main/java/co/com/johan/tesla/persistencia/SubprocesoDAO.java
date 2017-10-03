package co.com.johan.tesla.persistencia;

import co.com.johan.tesla.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author johan.lopez
 */
@Stateless
public class SubprocesoDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * Retorna una lista con los Subproceso que se encuentran en la base de
     * datos.
     *
     * @return lista de Subproceso
     * @generated
     */
    public List<Subproceso> obtenerTodos() {
        return em.createNamedQuery("Subproceso.obtenerTodos").getResultList();
    }

    public List<Subproceso> obtenerPorProducto(Long idProducto) {
        return em.createNamedQuery("Subproceso.obtenerPorProducto")
                .setParameter("productoId", idProducto)
                .getResultList();
    }

    /**
     * Obtiene Subproceso dado su identificador.
     *
     * @param id identificador del elemento Subproceso
     * @return Subproceso del id dado
     * @generated
     */
    public Subproceso obtener(Long id) {
        return em.find(Subproceso.class, id);
    }

    /**
     * Almacena la informacion de Subproceso
     *
     * @param entidad Subproceso a guardar
     * @return Subproceso con los cambios realizados por el proceso de guardar
     * @generated
     */
    public Subproceso guardar(Subproceso entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * Elimina el registro Subproceso con el identificador dado.
     *
     * @param id identificador del Subproceso
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Subproceso.class, id));
    }

    /**
     * Actualiza la informacion de Subproceso.
     *
     * @param entidad Subproceso a actualizar
     * @generated
     */
    public void actualizar(Subproceso entidad) {
        em.merge(entidad);
    }

}
