package unipa.uni;
// Generated 29/06/2017 09:18:03 PM by Hibernate Tools 5.1.0.Final


import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private Integer idServicio;
     private String tipo;
     private String descripcion;
     private Set<OrdenServicio> ordenServicios = new HashSet<OrdenServicio>(0);

    public Servicio() {
    }

	
    public Servicio(String tipo) {
        this.tipo = tipo;
    }
    public Servicio(String tipo, String descripcion, Set<OrdenServicio> ordenServicios) {
       this.tipo = tipo;
       this.descripcion = descripcion;
       this.ordenServicios = ordenServicios;
    }
   
    public Integer getIdServicio() {
        return this.idServicio;
    }
    
    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<OrdenServicio> getOrdenServicios() {
        return this.ordenServicios;
    }
    
    public void setOrdenServicios(Set<OrdenServicio> ordenServicios) {
        this.ordenServicios = ordenServicios;
    }




}


