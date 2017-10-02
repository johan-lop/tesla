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
public class TipoSubprocesoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los TipoSubproceso que se encuentran en la base de datos.
	 * @return lista de TipoSubproceso
	 * @generated
	 */
	public List<TipoSubproceso> obtenerTodos(){
		return em.createNamedQuery("TipoSubproceso.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene TipoSubproceso dado su identificador. 	
	 * @param id identificador del elemento TipoSubproceso
	 * @return TipoSubproceso del id dado
	 * @generated
	 */
	public TipoSubproceso obtener(Long id){
		return em.find(TipoSubproceso.class, id);
	}
	
	
	/**
	 * Almacena la informacion de TipoSubproceso
	 * @param entidad TipoSubproceso a guardar
	 * @return TipoSubproceso con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoSubproceso guardar(TipoSubproceso entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro TipoSubproceso con el identificador dado.
	 * @param id identificador del TipoSubproceso
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(TipoSubproceso.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de TipoSubproceso.
	 * @param entidad TipoSubproceso a actualizar
	 * @generated
	 */
	public void actualizar(TipoSubproceso entidad){
		em.merge(entidad);
	}
	
	
}
