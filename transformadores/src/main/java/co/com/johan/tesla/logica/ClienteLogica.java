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
public class ClienteLogica {
	
	@EJB
    private ClienteDAO persistencia;


	
	/**
	* Retorna una lista con los Cliente que se encuentran en la base de datos
	* @return retorna una lista de ClienteDTO
	* @generated
	*/
	public List<ClienteDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Cliente dado su identificador. 	
	* @param id identificador del elemento Cliente
	* @return Cliente del id dado
	* @generated
	*/
	public ClienteDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Cliente
	 * @param dto Cliente a guardar
	 * @return Cliente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public ClienteDTO guardar(ClienteDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Cliente con el identificador dado
	 * @param id identificador del Cliente
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Cliente
	 * @param dto Cliente a guardar
	 * @generated
	 */
	public void actualizar(ClienteDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un ClienteDTO en la entidad Cliente.  
	* @param dto a convertir
	* @return entidad Cliente
	* @generated
	*/
	public Cliente convertirDTO(ClienteDTO dto){
		if(dto==null)return null;
		Cliente entidad=new Cliente();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setNombreContacto(dto.getNombreContacto());
			entidad.setTelefonoContacto(dto.getTelefonoContacto());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  ClienteDTO en una lista de Cliente.  
	* @param dtos a convertir
	* @return entidades List<Cliente>
	* @generated
	*/
	public List<Cliente> convertirDTO(List<ClienteDTO> dtos){
		List<Cliente> entidades=new ArrayList<Cliente>();
		for(ClienteDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Cliente en un DTO ClienteDTO.  
	* @param entidad a convertir
	* @return dto ClienteDTO
	* @generated
	*/
	public ClienteDTO convertirEntidad(Cliente entidad){
		ClienteDTO dto=new ClienteDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
				dto.setNombreContacto(entidad.getNombreContacto());
				dto.setTelefonoContacto(entidad.getTelefonoContacto());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Cliente en una lista de ClienteDTO.  
	* @param entidades a convertir
	* @return dtos List<ClienteDTO>
	* @generated
	*/
	public List<ClienteDTO> convertirEntidad(List<Cliente> entidades){
		List<ClienteDTO> dtos=new ArrayList<ClienteDTO>();
		for(Cliente entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
