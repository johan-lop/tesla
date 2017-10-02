package co.com.johan.tesla.persistencia;

import co.com.johan.tesla.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 *  @generated
 *  @author johan.lopez
 */
@Stateless
public class ProduccionDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Produccion que se encuentran en la base de datos.
	 * @return lista de Produccion
	 * @generated
	 */
	public List<Produccion> obtenerTodos(){
		return em.createNamedQuery("Produccion.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Produccion dado su identificador. 	
	 * @param id identificador del elemento Produccion
	 * @return Produccion del id dado
	 * @generated
	 */
	public Produccion obtener(Long id){
		return em.find(Produccion.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Produccion
	 * @param entidad Produccion a guardar
	 * @return Produccion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Produccion guardar(Produccion entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Produccion con el identificador dado.
	 * @param id identificador del Produccion
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Produccion.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Produccion.
	 * @param entidad Produccion a actualizar
	 * @generated
	 */
	public void actualizar(Produccion entidad){
		em.merge(entidad);
	}
	
	
}
