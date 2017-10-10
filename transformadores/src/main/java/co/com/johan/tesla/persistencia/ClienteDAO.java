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
public class ClienteDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Cliente que se encuentran en la base de datos.
	 * @return lista de Cliente
	 * @generated
	 */
	public List<Cliente> obtenerTodos(){
		return em.createNamedQuery("Cliente.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Cliente dado su identificador. 	
	 * @param id identificador del elemento Cliente
	 * @return Cliente del id dado
	 * @generated
	 */
	public Cliente obtener(Long id){
		return em.find(Cliente.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Cliente
	 * @param entidad Cliente a guardar
	 * @return Cliente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Cliente guardar(Cliente entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Cliente con el identificador dado.
	 * @param id identificador del Cliente
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Cliente.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Cliente.
	 * @param entidad Cliente a actualizar
	 * @generated
	 */
	public void actualizar(Cliente entidad){
		em.merge(entidad);
	}
	
	
}
