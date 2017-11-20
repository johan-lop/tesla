package co.com.johan.tesla.logica;

import co.com.johan.tesla.dto.*;
import co.com.johan.tesla.persistencia.*;
import co.com.johan.tesla.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @generated @author johan.lopez
 */
@Stateless
public class TipoSubprocesoLogica {

    @EJB
    private TipoSubprocesoDAO persistencia;

    /**
     * Retorna una lista con los TipoSubproceso que se encuentran en la base de
     * datos
     *
     * @return retorna una lista de TipoSubprocesoDTO
     * @generated
     */
    public List<TipoSubprocesoDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * Obtiene TipoSubproceso dado su identificador.
     *
     * @param id identificador del elemento TipoSubproceso
     * @return TipoSubproceso del id dado
     * @generated
     */
    public TipoSubprocesoDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * Almacena la informacion de TipoSubproceso
     *
     * @param dto TipoSubproceso a guardar
     * @return TipoSubproceso con los cambios realizados por el proceso de
     * guardar
     * @generated
     */
    public TipoSubprocesoDTO guardar(TipoSubprocesoDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro TipoSubproceso con el identificador dado
     *
     * @param id identificador del TipoSubproceso
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * Actualiza la informacion de TipoSubproceso
     *
     * @param dto TipoSubproceso a guardar
     * @generated
     */
    public void actualizar(TipoSubprocesoDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * Convierte un TipoSubprocesoDTO en la entidad TipoSubproceso.
     *
     * @param dto a convertir
     * @return entidad TipoSubproceso
     * @generated
     */
    public TipoSubproceso convertirDTO(TipoSubprocesoDTO dto) {
        if (dto == null) {
            return null;
        }
        TipoSubproceso entidad = new TipoSubproceso();
        entidad.setId(dto.getId());
        entidad.setDescripcion(dto.getDescripcion());

        if (dto.getArea() != null) {
            entidad.setArea(new Area());
            entidad.getArea().setId(dto.getArea().getId());
        }

        return entidad;
    }

    /**
     * Convierte una lista de TipoSubprocesoDTO en una lista de TipoSubproceso.
     *
     * @param dtos a convertir
     * @return entidades List<TipoSubproceso>
     * @generated
     */
    public List<TipoSubproceso> convertirDTO(List<TipoSubprocesoDTO> dtos) {
        List<TipoSubproceso> entidades = new ArrayList<TipoSubproceso>();
        for (TipoSubprocesoDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * Convierte TipoSubproceso en un DTO TipoSubprocesoDTO.
     *
     * @param entidad a convertir
     * @return dto TipoSubprocesoDTO
     * @generated
     */
    public TipoSubprocesoDTO convertirEntidad(TipoSubproceso entidad) {
        TipoSubprocesoDTO dto = new TipoSubprocesoDTO();
        dto.setId(entidad.getId());
        dto.setDescripcion(entidad.getDescripcion());

        if (entidad.getArea() != null) {
            dto.setArea(new AreaDTO(entidad.getArea().getId()));
            dto.getArea().setNombre(entidad.getArea().getNombre());
        }

        return dto;
    }

    /**
     * Convierte una lista de TipoSubproceso en una lista de TipoSubprocesoDTO.
     *
     * @param entidades a convertir
     * @return dtos List<TipoSubprocesoDTO>
     * @generated
     */
    public List<TipoSubprocesoDTO> convertirEntidad(List<TipoSubproceso> entidades) {
        List<TipoSubprocesoDTO> dtos = new ArrayList<TipoSubprocesoDTO>();
        for (TipoSubproceso entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
