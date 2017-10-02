package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author johan.lopez
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProduccionDTO {

    public ProduccionDTO(){
        //constructor base
    }
    
    public ProduccionDTO(Long id){
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
    private String fechaInicio;
    
    /**
    * @generated
    */
    private String fechaFin;
    
    
    /**
    * @generated
    */
    private ProductoDTO producto;
    
    /**
    * @return
    * @generated
    */
    public String getFechaInicio() {
        return this.fechaInicio;
    }
    
    /**
    * @param
    * @generated
    */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
    * @return
    * @generated
    */
    public String getFechaFin() {
        return this.fechaFin;
    }
    
    /**
    * @param
    * @generated
    */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
	/**
	* @return
	* @generated
	*/
	public ProductoDTO getProducto() {
	    return this.producto;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setProducto(ProductoDTO producto) {
	    this.producto = producto;
	}
	
}
