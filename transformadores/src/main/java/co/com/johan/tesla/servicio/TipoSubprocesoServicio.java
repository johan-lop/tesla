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
@Path("/TipoSubproceso")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoSubprocesoServicio {
@EJB
    private TipoSubprocesoLogica logica;

	
	/**
	* retorna una lista con los TipoSubproceso que se encuentran en la base de datos
	* @return retorna una lista de TipoSubprocesoDTO
	* @generated
	*/
	@GET
	public List<TipoSubprocesoDTO> obtenerTodosTipoSubprocesos(){
            
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento TipoSubproceso
	* @return TipoSubproceso del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public TipoSubprocesoDTO obtenerTipoSubproceso(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de TipoSubproceso
	 * @param dto TipoSubproceso a guardar
	 * @return TipoSubproceso con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public TipoSubprocesoDTO guardarTipoSubproceso(TipoSubprocesoDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro TipoSubproceso con el identificador dado
	 * @param id identificador del TipoSubproceso
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarTipoSubproceso(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
