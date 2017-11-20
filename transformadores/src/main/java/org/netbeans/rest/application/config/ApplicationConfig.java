
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import co.com.johan.tesla.servicio.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas como servicios REST
 * @author johan.lopez
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.com.johan.tesla.servicio.AreaServicio.class);
resources.add(co.com.johan.tesla.servicio.CiudadServicio.class);
resources.add(co.com.johan.tesla.servicio.ClienteServicio.class);
resources.add(co.com.johan.tesla.servicio.DepartamentoServicio.class);
        resources.add(co.com.johan.tesla.servicio.ProduccionServicio.class);
        resources.add(co.com.johan.tesla.servicio.ProductoServicio.class);
        resources.add(co.com.johan.tesla.servicio.SubprocesoServicio.class);
        resources.add(co.com.johan.tesla.servicio.TipoSubprocesoServicio.class);
    }
    
}

