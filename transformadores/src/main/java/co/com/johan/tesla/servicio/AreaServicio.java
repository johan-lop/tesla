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
@Path("/Area")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AreaServicio {
	
	@EJB
    private AreaLogica logica;

	
	/**
	* retorna una lista con los Area que se encuentran en la base de datos
	* @return retorna una lista de AreaDTO
	* @generated
	*/
	@GET
	public List<AreaDTO> obtenerTodosAreas(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Area
	* @return Area del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public AreaDTO obtenerArea(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Area
	 * @param dto Area a guardar
	 * @return Area con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public AreaDTO guardarArea(AreaDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Area con el identificador dado
	 * @param id identificador del Area
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarArea(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
