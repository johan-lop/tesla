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
public class ProductoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Producto que se encuentran en la base de datos.
	 * @return lista de Producto
	 * @generated
	 */
	public List<Producto> obtenerTodos(){
		return em.createNamedQuery("Producto.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Producto dado su identificador. 	
	 * @param id identificador del elemento Producto
	 * @return Producto del id dado
	 * @generated
	 */
	public Producto obtener(Long id){
		return em.find(Producto.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Producto
	 * @param entidad Producto a guardar
	 * @return Producto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Producto guardar(Producto entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Producto con el identificador dado.
	 * @param id identificador del Producto
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Producto.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Producto.
	 * @param entidad Producto a actualizar
	 * @generated
	 */
	public void actualizar(Producto entidad){
		em.merge(entidad);
	}
	
	
}
