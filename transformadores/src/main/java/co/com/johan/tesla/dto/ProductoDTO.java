package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
  * @generated
  *  @author johan.lopez
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductoDTO {

    public ProductoDTO(){
        //constructor base
    }
    
    public ProductoDTO(Long id){
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
    private String descripcion;
    
    /**
    * @generated
    */
    private Double horasFabricacion;
    
    
    /**
    * @return
    * @generated
    */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
    * @return
    * @generated
    */
    public Double getHorasFabricacion() {
        return this.horasFabricacion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setHorasFabricacion(Double horasFabricacion) {
        this.horasFabricacion = horasFabricacion;
    }
    
	
}
