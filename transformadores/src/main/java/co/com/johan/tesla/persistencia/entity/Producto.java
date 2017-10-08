package co.com.johan.tesla.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author johan.lopez
  *  @generated	  
*/
@Entity
@Table(name="Producto")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Producto.obtenerTodos", query="select e from Producto e")
})
public class Producto {

	/**
	 * Identificador de la tabla Producto. 	
	 */
	@Id
    //@Column(name = "Producto_id")
    @GeneratedValue(generator = "ProductoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ProductoGen", sequenceName = "Producto_SEQ",allocationSize = 1)
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
    
    //@Column(name = "descripcion")
    private String descripcion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "horasFabricacion")
    private Double horasFabricacion;
    
    
    
    /**
    * @generated
    */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
    * @generated
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getHorasFabricacion() {
        return horasFabricacion;
    }

    public void setHorasFabricacion(Double horasFabricacion) {
        this.horasFabricacion = horasFabricacion;
    }
   	
}
