package co.com.johan.tesla.logica;

import co.com.johan.tesla.dto.*;
import co.com.johan.tesla.persistencia.*;
import co.com.johan.tesla.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
  *  @generated
  *  @author johan.lopez
  */
@Stateless
public class ProduccionLogica {
	
	@EJB
    private ProduccionDAO persistencia;

	private final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	/**
	* Retorna una lista con los Produccion que se encuentran en la base de datos
	* @return retorna una lista de ProduccionDTO
	* @generated
	*/
	public List<ProduccionDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Produccion dado su identificador. 	
	* @param id identificador del elemento Produccion
	* @return Produccion del id dado
	* @generated
	*/
	public ProduccionDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Produccion
	 * @param dto Produccion a guardar
	 * @return Produccion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public ProduccionDTO guardar(ProduccionDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Produccion con el identificador dado
	 * @param id identificador del Produccion
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Produccion
	 * @param dto Produccion a guardar
	 * @generated
	 */
	public void actualizar(ProduccionDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un ProduccionDTO en la entidad Produccion.  
	* @param dto a convertir
	* @return entidad Produccion
	* @generated
	*/
	public Produccion convertirDTO(ProduccionDTO dto){
		if(dto==null)return null;
		Produccion entidad=new Produccion();
		entidad.setId(dto.getId());
			if(dto.getFechaInicio()!=null){
				entidad.setFechaInicio(LocalDate.parse(dto.getFechaInicio(), formatoFecha));
			}
			if(dto.getFechaFin()!=null){
				entidad.setFechaFin(LocalDate.parse(dto.getFechaFin(), formatoFecha));
			}
			entidad.setDisenio(dto.getDisenio());
			entidad.setOp(dto.getOp());
			entidad.setSerie(dto.getSerie());
			entidad.setObservaciones(dto.getObservaciones());
		
			if(dto.getCiudad()!=null){
				entidad.setCiudad(new Ciudad());
				entidad.getCiudad().setId(dto.getCiudad().getId());
			}
			if(dto.getCliente()!=null){
				entidad.setCliente(new Cliente());
				entidad.getCliente().setId(dto.getCliente().getId());
			}
			if(dto.getProducto()!=null){
				entidad.setProducto(new Producto());
				entidad.getProducto().setId(dto.getProducto().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  ProduccionDTO en una lista de Produccion.  
	* @param dtos a convertir
	* @return entidades List<Produccion>
	* @generated
	*/
	public List<Produccion> convertirDTO(List<ProduccionDTO> dtos){
		List<Produccion> entidades=new ArrayList<Produccion>();
		for(ProduccionDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Produccion en un DTO ProduccionDTO.  
	* @param entidad a convertir
	* @return dto ProduccionDTO
	* @generated
	*/
	public ProduccionDTO convertirEntidad(Produccion entidad){
		ProduccionDTO dto=new ProduccionDTO();
		dto.setId(entidad.getId());
				if(entidad.getFechaInicio()!=null){
					dto.setFechaInicio(formatoFecha.format(entidad.getFechaInicio()));
				}
				if(entidad.getFechaFin()!=null){
					dto.setFechaFin(formatoFecha.format(entidad.getFechaFin()));
				}
				dto.setDisenio(entidad.getDisenio());
				dto.setOp(entidad.getOp());
				dto.setSerie(entidad.getSerie());
				dto.setObservaciones(entidad.getObservaciones());
		
			if(entidad.getProducto()!=null){
				dto.setProducto(
					new ProductoDTO(
						entidad.getProducto().getId()));
			}
			if(entidad.getCiudad()!=null){
				dto.setCiudad(
					new CiudadDTO(
						entidad.getCiudad().getId()));
			}
			if(entidad.getCliente()!=null){
				dto.setCliente(
					new ClienteDTO(
						entidad.getCliente().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Produccion en una lista de ProduccionDTO.  
	* @param entidades a convertir
	* @return dtos List<ProduccionDTO>
	* @generated
	*/
	public List<ProduccionDTO> convertirEntidad(List<Produccion> entidades){
		List<ProduccionDTO> dtos=new ArrayList<ProduccionDTO>();
		for(Produccion entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
