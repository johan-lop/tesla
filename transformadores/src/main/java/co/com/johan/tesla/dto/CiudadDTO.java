package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author johan.lopez
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CiudadDTO {

    public CiudadDTO(){
        //constructor base
    }
    
    public CiudadDTO(Long id){
        this.id=id;
    }

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private String divipo;
    
    
    /**
    * @generated
    */
    private DepartamentoDTO departamento;
    
    /**
    * @return
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * @return
    * @generated
    */
    public String getDivipo() {
        return this.divipo;
    }
    
    /**
    * @param
    * @generated
    */
    public void setDivipo(String divipo) {
        this.divipo = divipo;
    }
    
	/**
	* @return
	* @generated
	*/
	public DepartamentoDTO getDepartamento() {
	    return this.departamento;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setDepartamento(DepartamentoDTO departamento) {
	    this.departamento = departamento;
	}
	
}
