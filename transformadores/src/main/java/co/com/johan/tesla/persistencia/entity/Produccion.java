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
