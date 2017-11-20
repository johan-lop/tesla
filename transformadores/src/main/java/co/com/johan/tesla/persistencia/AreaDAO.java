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
public class AreaDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Area que se encuentran en la base de datos.
	 * @return lista de Area
	 * @generated
	 */
	public List<Area> obtenerTodos(){
		return em.createNamedQuery("Area.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Area dado su identificador. 	
	 * @param id identificador del elemento Area
	 * @return Area del id dado
	 * @generated
	 */
	public Area obtener(Long id){
		return em.find(Area.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Area
	 * @param entidad Area a guardar
	 * @return Area con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Area guardar(Area entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Area con el identificador dado.
	 * @param id identificador del Area
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Area.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Area.
	 * @param entidad Area a actualizar
	 * @generated
	 */
	public void actualizar(Area entidad){
		em.merge(entidad);
	}
	
	
}
