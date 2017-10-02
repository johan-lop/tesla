package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

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
    private Integer horasFabricacion;
    
    
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
    public Integer getHorasFabricacion() {
        return this.horasFabricacion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setHorasFabricacion(Integer horasFabricacion) {
        this.horasFabricacion = horasFabricacion;
    }
    
	
}
