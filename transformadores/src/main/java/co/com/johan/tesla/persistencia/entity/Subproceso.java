package co.com.johan.tesla.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author johan.lopez
  *  @generated	  
*/
@Entity
@Table(name="Subproceso")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Subproceso.obtenerTodos", query="select e from Subproceso e"),
	@NamedQuery(name="Subproceso.obtenerPorProducto", query="select e from Subproceso e where e.producto.id = :productoId")
})
public class Subproceso {

	/**
	 * Identificador de la tabla Subproceso. 	
	 */
	@Id
    //@Column(name = "Subproceso_id")
    @GeneratedValue(generator = "SubprocesoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SubprocesoGen", sequenceName = "Subproceso_SEQ",allocationSize = 1)
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
    
    //@Column(name = "horas")
    private Double horas;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "orden")
    private Integer orden;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoSubproceso tipoSubproceso;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Producto producto;
    
    
    /**
    * @generated
    */
    public Double getHoras() {
        return this.horas;
    }
    
    /**
    * @generated
    */
    public void setHoras(Double horas) {
        this.horas = horas;
    }
    
    /**
    * @generated
    */
    public Integer getOrden() {
        return this.orden;
    }
    
    /**
    * @generated
    */
    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    
	
	/**
	* @generated
	*/
	public TipoSubproceso getTipoSubproceso() {
	    return this.tipoSubproceso;
	}
	
	/**
	* @generated
	*/
	public void setTipoSubproceso(TipoSubproceso tipoSubproceso) {
	    this.tipoSubproceso = tipoSubproceso;
	}
	
	/**
	* @generated
	*/
	public Producto getProducto() {
	    return this.producto;
	}
	
	/**
	* @generated
	*/
	public void setProducto(Producto producto) {
	    this.producto = producto;
	}
	
}
