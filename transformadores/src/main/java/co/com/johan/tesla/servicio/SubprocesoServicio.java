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
 * @author johan.lopez
 * @generated
 */
@Stateless
@Path("/Subproceso")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SubprocesoServicio {

    @EJB
    private SubprocesoLogica logica;

    /**
     * retorna una lista con los Subproceso que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de SubprocesoDTO
     * @generated
     */
    @GET
    public List<SubprocesoDTO> obtenerTodosSubprocesos() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Subproceso
     * @return Subproceso del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public SubprocesoDTO obtenerSubproceso(@PathParam("id") Long id) {
        return logica.obtener(id);
    }
    
    @GET
    @Path("/Producto/{id}")
    public List<SubprocesoDTO> obtenerPorProducto(@PathParam("id") Long id) {
        return logica.obtenerPorProducto(id);
    }

    /**
     * almacena la informacion de Subproceso
     *
     * @param dto Subproceso a guardar
     * @return Subproceso con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public SubprocesoDTO guardarSubproceso(SubprocesoDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Subproceso con el identificador dado
     *
     * @param id identificador del Subproceso
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarSubproceso(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
