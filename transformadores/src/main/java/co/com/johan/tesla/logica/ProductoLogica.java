package co.com.johan.tesla.logica;

import co.com.johan.tesla.dto.*;
import co.com.johan.tesla.persistencia.*;
import co.com.johan.tesla.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.omg.CORBA.portable.ApplicationException;

/**
 * @generated @author johan.lopez
 */
@Stateless
public class ProductoLogica {

    @EJB
    private ProductoDAO persistencia;

    @EJB
    private SubprocesoLogica subprocesoLogica;

    @EJB
    private SubprocesoDAO subprocesoDAO;

    /**
     * Retorna una lista con los Producto que se encuentran en la base de datos
     *
     * @return retorna una lista de ProductoDTO
     * @generated
     */
    public List<ProductoDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * Obtiene Producto dado su identificador.
     *
     * @param id identificador del elemento Producto
     * @return Producto del id dado
     * @generated
     */
    public ProductoDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * Almacena la informacion de Producto
     *
     * @param dto Producto a guardar
     * @return Producto con los cambios realizados por el proceso de guardar
     * @generated
     */
    public ProductoDTO guardar(ProductoDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Producto con el identificador dado
     *
     * @param id identificador del Producto
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * Actualiza la informacion de Producto
     *
     * @param dto Producto a guardar
     * @generated
     */
    public void actualizar(ProductoDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    public void guardarproductoSubprocesos(ProductoWrapperDTO productoWrapper) throws Exception{
        ProductoDTO producto = new ProductoDTO();
        if (productoWrapper.getProducto() != null && productoWrapper.getProducto().getId() != null) {
            producto = productoWrapper.getProducto();
            this.actualizar(producto);
        } else {
            producto = this.guardar(producto);
        }
        if (producto.getId() != null) {
            subprocesoDAO.borrarPorProceso(producto.getId());
            if (productoWrapper.getTiposSubproceso() != null) {
                for (TipoSubprocesoDTO tipoSubproceso : productoWrapper.getTiposSubproceso()) {
                    SubprocesoDTO subprocesoDTO = new SubprocesoDTO();
                    subprocesoDTO.setHoras(tipoSubproceso.getHoras());
                    subprocesoDTO.setProducto(producto);
                    subprocesoDTO.setTipoSubproceso(tipoSubproceso);
                    subprocesoDTO.setOrden(productoWrapper.getTiposSubproceso().indexOf(tipoSubproceso));                    
                    subprocesoLogica.guardar(subprocesoDTO);
                }
            }
        } else {
            throw new Exception("Error al guardar el producto");
        }
    }
    
    /**
     * Convierte un ProductoDTO en la entidad Producto.
     *
     * @param dto a convertir
     * @return entidad Producto
     * @generated
     */
    public Producto convertirDTO(ProductoDTO dto) {
        if (dto == null) {
            return null;
        }
        Producto entidad = new Producto();
        entidad.setId(dto.getId());
        entidad.setDescripcion(dto.getDescripcion());
        entidad.setHorasFabricacion(dto.getHorasFabricacion());

        return entidad;
    }

    /**
     * Convierte una lista de ProductoDTO en una lista de Producto.
     *
     * @param dtos a convertir
     * @return entidades List<Producto>
     * @generated
     */
    public List<Producto> convertirDTO(List<ProductoDTO> dtos) {
        List<Producto> entidades = new ArrayList<Producto>();
        for (ProductoDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * Convierte Producto en un DTO ProductoDTO.
     *
     * @param entidad a convertir
     * @return dto ProductoDTO
     * @generated
     */
    public ProductoDTO convertirEntidad(Producto entidad) {
        ProductoDTO dto = new ProductoDTO();
        dto.setId(entidad.getId());
        dto.setDescripcion(entidad.getDescripcion());
        dto.setHorasFabricacion(entidad.getHorasFabricacion());

        return dto;
    }

    /**
     * Convierte una lista de Producto en una lista de ProductoDTO.
     *
     * @param entidades a convertir
     * @return dtos List<ProductoDTO>
     * @generated
     */
    public List<ProductoDTO> convertirEntidad(List<Producto> entidades) {
        List<ProductoDTO> dtos = new ArrayList<ProductoDTO>();
        for (Producto entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
