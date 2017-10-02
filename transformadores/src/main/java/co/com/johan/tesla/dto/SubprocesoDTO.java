package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author johan.lopez
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubprocesoDTO {

    public SubprocesoDTO(){
        //constructor base
    }
    
    public SubprocesoDTO(Long id){
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
    private Double horas;
    
    /**
    * @generated
    */
    private Integer orden;
    
    
    /**
    * @generated
    */
    private ProductoDTO producto;
    
    /**
    * @generated
    */
    private TipoSubprocesoDTO tipoSubproceso;
    
    /**
    * @return
    * @generated
    */
    public Double getHoras() {
        return this.horas;
    }
    
    /**
    * @param
    * @generated
    */
    public void setHoras(Double horas) {
        this.horas = horas;
    }
    /**
    * @return
    * @generated
    */
    public Integer getOrden() {
        return this.orden;
    }
    
    /**
    * @param
    * @generated
    */
    public void setOrden(Integer orden) {
        this.orden = orden;
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
	/**
	* @return
	* @generated
	*/
	public TipoSubprocesoDTO getTipoSubproceso() {
	    return this.tipoSubproceso;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setTipoSubproceso(TipoSubprocesoDTO tipoSubproceso) {
	    this.tipoSubproceso = tipoSubproceso;
	}
	
}
