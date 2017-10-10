package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author johan.lopez
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteDTO {

    public ClienteDTO(){
        //constructor base
    }
    
    public ClienteDTO(Long id){
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
    private String nombreContacto;
    
    /**
    * @generated
    */
    private String telefonoContacto;
    
    
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
    public String getNombreContacto() {
        return this.nombreContacto;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    /**
    * @return
    * @generated
    */
    public String getTelefonoContacto() {
        return this.telefonoContacto;
    }
    
    /**
    * @param
    * @generated
    */
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
	
}
