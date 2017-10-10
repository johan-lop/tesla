package co.com.johan.tesla.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author johan.lopez
  *  @generated	  
*/
@Entity
@Table(name="Departamento")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Departamento.obtenerTodos", query="select e from Departamento e")
})
public class Departamento {

	/**
	 * Identificador de la tabla Departamento. 	
	 */
	@Id
    //@Column(name = "Departamento_id")
    @GeneratedValue(generator = "DepartamentoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DepartamentoGen", sequenceName = "Departamento_SEQ",allocationSize = 1)
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
    
    private String codigo;
    
    
    
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
	
}
