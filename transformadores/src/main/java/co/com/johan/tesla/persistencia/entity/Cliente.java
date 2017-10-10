package co.com.johan.tesla.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author johan.lopez
  *  @generated	  
*/
@Entity
@Table(name="Cliente")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Cliente.obtenerTodos", query="select e from Cliente e")
})
public class Cliente {

	/**
	 * Identificador de la tabla Cliente. 	
	 */
	@Id
    //@Column(name = "Cliente_id")
    @GeneratedValue(generator = "ClienteGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ClienteGen", sequenceName = "Cliente_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre")
    private String nombre;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombreContacto")
    private String nombreContacto;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "telefonoContacto")
    private String telefonoContacto;
    
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    * @generated
    */
    public String getNombreContacto() {
        return this.nombreContacto;
    }
    
    /**
    * @generated
    */
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    
    /**
    * @generated
    */
    public String getTelefonoContacto() {
        return this.telefonoContacto;
    }
    
    /**
    * @generated
    */
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
	
}
