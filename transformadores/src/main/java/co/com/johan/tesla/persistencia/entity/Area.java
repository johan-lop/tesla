package co.com.johan.tesla.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author johan.lopez
  *  @generated	  
*/
@Entity
@Table(name="Area")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Area.obtenerTodos", query="select e from Area e")
})
public class Area {

	/**
	 * Identificador de la tabla Area. 	
	 */
	@Id
    //@Column(name = "Area_id")
    @GeneratedValue(generator = "AreaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AreaGen", sequenceName = "Area_SEQ",allocationSize = 1)
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
    
	
}
