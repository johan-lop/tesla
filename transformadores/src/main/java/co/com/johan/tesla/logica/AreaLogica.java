package co.com.johan.tesla.logica;

import co.com.johan.tesla.dto.*;
import co.com.johan.tesla.persistencia.*;
import co.com.johan.tesla.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author johan.lopez
  */
@Stateless
public class AreaLogica {
	
	@EJB
    private AreaDAO persistencia;


	
	/**
	* Retorna una lista con los Area que se encuentran en la base de datos
	* @return retorna una lista de AreaDTO
	* @generated
	*/
	public List<AreaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Area dado su identificador. 	
	* @param id identificador del elemento Area
	* @return Area del id dado
	* @generated
	*/
	public AreaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Area
	 * @param dto Area a guardar
	 * @return Area con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public AreaDTO guardar(AreaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Area con el identificador dado
	 * @param id identificador del Area
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Area
	 * @param dto Area a guardar
	 * @generated
	 */
	public void actualizar(AreaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un AreaDTO en la entidad Area.  
	* @param dto a convertir
	* @return entidad Area
	* @generated
	*/
	public Area convertirDTO(AreaDTO dto){
		if(dto==null)return null;
		Area entidad=new Area();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  AreaDTO en una lista de Area.  
	* @param dtos a convertir
	* @return entidades List<Area>
	* @generated
	*/
	public List<Area> convertirDTO(List<AreaDTO> dtos){
		List<Area> entidades=new ArrayList<Area>();
		for(AreaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Area en un DTO AreaDTO.  
	* @param entidad a convertir
	* @return dto AreaDTO
	* @generated
	*/
	public AreaDTO convertirEntidad(Area entidad){
		AreaDTO dto=new AreaDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Area en una lista de AreaDTO.  
	* @param entidades a convertir
	* @return dtos List<AreaDTO>
	* @generated
	*/
	public List<AreaDTO> convertirEntidad(List<Area> entidades){
		List<AreaDTO> dtos=new ArrayList<AreaDTO>();
		for(Area entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
