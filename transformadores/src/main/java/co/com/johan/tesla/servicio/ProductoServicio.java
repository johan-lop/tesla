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
@Path("/Producto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductoServicio {

    @EJB
    private ProductoLogica logica;

    /**
     * retorna una lista con los Producto que se encuentran en la base de datos
     *
     * @return retorna una lista de ProductoDTO
     * @generated
     */
    @GET
    public List<ProductoDTO> obtenerTodosProductos() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Producto
     * @return Producto del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public ProductoDTO obtenerProducto(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Producto
     *
     * @param dto Producto a guardar
     * @return Producto con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public ProductoDTO guardarProducto(ProductoDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }
    
    @POST
    @Path("/ProductoSubproceso")
    public void guardarProductoSubproceso(ProductoWrapperDTO dto) throws Exception{
        logica.guardarproductoSubprocesos(dto);
    }

    /**
     * elimina el registro Producto con el identificador dado
     *
     * @param id identificador del Producto
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarProducto(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
