package co.com.johan.tesla.persistencia.entity;


import java.time.*;
import javax.persistence.*;

/**
  *  
  *  @author johan.lopez
  *  @generated	  
*/
@Entity
@Table(name="Produccion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Produccion.obtenerTodos", query="select e from Produccion e")
})
public class Produccion {

	/**
	 * Identificador de la tabla Produccion. 	
	 */
	@Id
    //@Column(name = "Produccion_id")
    @GeneratedValue(generator = "ProduccionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ProduccionGen", sequenceName = "Produccion_SEQ",allocationSize = 1)
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
    
    //@Column(name = "fechaInicio")
    private LocalDate fechaInicio;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "fechaFin")
    private LocalDate fechaFin;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "disenio")
    private String disenio;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "op")
    private String op;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "serie")
    private String serie;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "observaciones")
    @Column(columnDefinition = "TEXT")
    private String observaciones;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Cliente cliente;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Ciudad ciudad;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Producto producto;
    
    
    /**
    * @generated
    */
    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }
    
    /**
    * @generated
    */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    /**
    * @generated
    */
    public LocalDate getFechaFin() {
        return this.fechaFin;
    }
    
    /**
    * @generated
    */
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    /**
    * @generated
    */
    public String getDisenio() {
        return this.disenio;
    }
    
    /**
    * @generated
    */
    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }
    
    /**
    * @generated
    */
    public String getOp() {
        return this.op;
    }
    
    /**
    * @generated
    */
    public void setOp(String op) {
        this.op = op;
    }
    
    /**
    * @generated
    */
    public String getSerie() {
        return this.serie;
    }
    
    /**
    * @generated
    */
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    /**
    * @generated
    */
    public String getObservaciones() {
        return this.observaciones;
    }
    
    /**
    * @generated
    */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
	
	/**
	* @generated
	*/
	public Ciudad getCiudad() {
	    return this.ciudad;
	}
	
	/**
	* @generated
	*/
	public void setCiudad(Ciudad ciudad) {
	    this.ciudad = ciudad;
	}
	
	/**
	* @generated
	*/
	public Cliente getCliente() {
	    return this.cliente;
	}
	
	/**
	* @generated
	*/
	public void setCliente(Cliente cliente) {
	    this.cliente = cliente;
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
