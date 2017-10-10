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
    private String disenio;
    
    /**
    * @generated
    */
    private String op;
    
    /**
    * @generated
    */
    private String serie;
    
    /**
    * @generated
    */
    private String observaciones;
    
    
    /**
    * @generated
    */
    private ClienteDTO cliente;
    
    /**
    * @generated
    */
    private CiudadDTO ciudad;
    
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
    public String getDisenio() {
        return this.disenio;
    }
    
    /**
    * @param
    * @generated
    */
    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }
    /**
    * @return
    * @generated
    */
    public String getOp() {
        return this.op;
    }
    
    /**
    * @param
    * @generated
    */
    public void setOp(String op) {
        this.op = op;
    }
    /**
    * @return
    * @generated
    */
    public String getSerie() {
        return this.serie;
    }
    
    /**
    * @param
    * @generated
    */
    public void setSerie(String serie) {
        this.serie = serie;
    }
    /**
    * @return
    * @generated
    */
    public String getObservaciones() {
        return this.observaciones;
    }
    
    /**
    * @param
    * @generated
    */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
	/**
	* @return
	* @generated
	*/
	public CiudadDTO getCiudad() {
	    return this.ciudad;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setCiudad(CiudadDTO ciudad) {
	    this.ciudad = ciudad;
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
	public ClienteDTO getCliente() {
	    return this.cliente;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setCliente(ClienteDTO cliente) {
	    this.cliente = cliente;
	}
	
}
