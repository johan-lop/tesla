package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author johan.lopez
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TipoSubprocesoDTO {

    public TipoSubprocesoDTO(){
        //constructor base
    }
    
    public TipoSubprocesoDTO(Long id){
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
    
    private Double horas;
    
    
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

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }
    
    
	
}
