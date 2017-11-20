package co.com.johan.tesla.persistencia.entity;

import javax.persistence.*;

/**
 *
 * @author johan.lopez
 * @generated
 */
@Entity
@Table(name = "TipoSubproceso")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "TipoSubproceso.obtenerTodos", query = "select e from TipoSubproceso e ORDER BY e.id")
})
public class TipoSubproceso {

    /**
     * Identificador de la tabla TipoSubproceso.
     */
    @Id
    //@Column(name = "TipoSubproceso_id")
    @GeneratedValue(generator = "TipoSubprocesoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoSubprocesoGen", sequenceName = "TipoSubproceso_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated 1-1-false
     */
    //@Column(name = "descripcion")
    private String descripcion;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private Area area;

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

    /**
     * @generated
     */
    public Area getArea() {
        return this.area;
    }

    /**
     * @generated
     */
    public void setArea(Area area) {
        this.area = area;
    }

}
