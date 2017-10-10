package co.com.johan.tesla.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author johan.lopez
  *  @generated	  
*/
@Entity
@Table(name="Ciudad")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Ciudad.obtenerTodos", query="select e from Ciudad e")
})
public class Ciudad {

	/**
	 * Identificador de la tabla Ciudad. 	
	 */
	@Id
    //@Column(name = "Ciudad_id")
    @GeneratedValue(generator = "CiudadGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CiudadGen", sequenceName = "Ciudad_SEQ",allocationSize = 1)
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
    
    //@Column(name = "divipo")
    private String divipo;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Departamento departamento;
    
    
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
    public String getDivipo() {
        return this.divipo;
    }
    
    /**
    * @generated
    */
    public void setDivipo(String divipo) {
        this.divipo = divipo;
    }
    
	
	/**
	* @generated
	*/
	public Departamento getDepartamento() {
	    return this.departamento;
	}
	
	/**
	* @generated
	*/
	public void setDepartamento(Departamento departamento) {
	    this.departamento = departamento;
	}
	
}
