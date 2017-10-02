package co.com.johan.tesla.servicio;

import co.com.johan.tesla.dto.*;
import co.com.johan.tesla.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *  @author johan.lopez
 *  @generated
 */
@Stateless
@Path("/Produccion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProduccionServicio {
	
	@EJB
    private ProduccionLogica logica;

	
	/**
	* retorna una lista con los Produccion que se encuentran en la base de datos
	* @return retorna una lista de ProduccionDTO
	* @generated
	*/
	@GET
	public List<ProduccionDTO> obtenerTodosProduccions(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Produccion
	* @return Produccion del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public ProduccionDTO obtenerProduccion(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Produccion
	 * @param dto Produccion a guardar
	 * @return Produccion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public ProduccionDTO guardarProduccion(ProduccionDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Produccion con el identificador dado
	 * @param id identificador del Produccion
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarProduccion(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
