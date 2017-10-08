package co.com.johan.tesla.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/**
 * @generated @author johan.lopez
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductoWrapperDTO {

    private ProductoDTO producto;

    private List<TipoSubprocesoDTO> tiposSubproceso;

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public List<TipoSubprocesoDTO> getTiposSubproceso() {
        return tiposSubproceso;
    }

    public void setTiposSubproceso(List<TipoSubprocesoDTO> tiposSubproceso) {
        this.tiposSubproceso = tiposSubproceso;
    }

}
