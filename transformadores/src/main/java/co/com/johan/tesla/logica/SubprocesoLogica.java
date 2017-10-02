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
public class SubprocesoLogica {
	
	@EJB
    private SubprocesoDAO persistencia;


	
	/**
	* Retorna una lista con los Subproceso que se encuentran en la base de datos
	* @return retorna una lista de SubprocesoDTO
	* @generated
	*/
	public List<SubprocesoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Subproceso dado su identificador. 	
	* @param id identificador del elemento Subproceso
	* @return Subproceso del id dado
	* @generated
	*/
	public SubprocesoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Subproceso
	 * @param dto Subproceso a guardar
	 * @return Subproceso con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public SubprocesoDTO guardar(SubprocesoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Subproceso con el identificador dado
	 * @param id identificador del Subproceso
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Subproceso
	 * @param dto Subproceso a guardar
	 * @generated
	 */
	public void actualizar(SubprocesoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un SubprocesoDTO en la entidad Subproceso.  
	* @param dto a convertir
	* @return entidad Subproceso
	* @generated
	*/
	public Subproceso convertirDTO(SubprocesoDTO dto){
		if(dto==null)return null;
		Subproceso entidad=new Subproceso();
		entidad.setId(dto.getId());
			entidad.setHoras(dto.getHoras());
			entidad.setOrden(dto.getOrden());
		
			if(dto.getProducto()!=null){
				entidad.setProducto(new Producto());
				entidad.getProducto().setId(dto.getProducto().getId());
			}
			if(dto.getTipoSubproceso()!=null){
				entidad.setTipoSubproceso(new TipoSubproceso());
				entidad.getTipoSubproceso().setId(dto.getTipoSubproceso().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  SubprocesoDTO en una lista de Subproceso.  
	* @param dtos a convertir
	* @return entidades List<Subproceso>
	* @generated
	*/
	public List<Subproceso> convertirDTO(List<SubprocesoDTO> dtos){
		List<Subproceso> entidades=new ArrayList<Subproceso>();
		for(SubprocesoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Subproceso en un DTO SubprocesoDTO.  
	* @param entidad a convertir
	* @return dto SubprocesoDTO
	* @generated
	*/
	public SubprocesoDTO convertirEntidad(Subproceso entidad){
		SubprocesoDTO dto=new SubprocesoDTO();
		dto.setId(entidad.getId());
				dto.setHoras(entidad.getHoras());
				dto.setOrden(entidad.getOrden());
		
			if(entidad.getProducto()!=null){
				dto.setProducto(
					new ProductoDTO(
						entidad.getProducto().getId()));
			}
			if(entidad.getTipoSubproceso()!=null){
				dto.setTipoSubproceso(
					new TipoSubprocesoDTO(
						entidad.getTipoSubproceso().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Subproceso en una lista de SubprocesoDTO.  
	* @param entidades a convertir
	* @return dtos List<SubprocesoDTO>
	* @generated
	*/
	public List<SubprocesoDTO> convertirEntidad(List<Subproceso> entidades){
		List<SubprocesoDTO> dtos=new ArrayList<SubprocesoDTO>();
		for(Subproceso entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
