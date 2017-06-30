package unipa.uni;
// Generated 29/06/2017 09:18:03 PM by Hibernate Tools 5.1.0.Final


import java.util.HashSet;
import java.util.Set;

/**
 * Equipo generated by hbm2java
 */
public class Equipo  implements java.io.Serializable {


     private String placa;
     private String tipoDeAireA;
     private Integer capacidadBtu;
     private String ubicacion;
     private Float amperaje;
     private Float voltaje;
     private Integer presionAlta;
     private Integer presionBaja;
     private String refrigerante;
     private Set<EquipoHasServicio> equipoHasServicios = new HashSet<EquipoHasServicio>(0);

    public Equipo() {
    }

	
    public Equipo(String placa) {
        this.placa = placa;
    }
    public Equipo(String placa, String tipoDeAireA, Integer capacidadBtu, String ubicacion, Float amperaje, Float voltaje, Integer presionAlta, Integer presionBaja, String refrigerante, Set<EquipoHasServicio> equipoHasServicios) {
       this.placa = placa;
       this.tipoDeAireA = tipoDeAireA;
       this.capacidadBtu = capacidadBtu;
       this.ubicacion = ubicacion;
       this.amperaje = amperaje;
       this.voltaje = voltaje;
       this.presionAlta = presionAlta;
       this.presionBaja = presionBaja;
       this.refrigerante = refrigerante;
       this.equipoHasServicios = equipoHasServicios;
    }
   
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getTipoDeAireA() {
        return this.tipoDeAireA;
    }
    
    public void setTipoDeAireA(String tipoDeAireA) {
        this.tipoDeAireA = tipoDeAireA;
    }
    public Integer getCapacidadBtu() {
        return this.capacidadBtu;
    }
    
    public void setCapacidadBtu(Integer capacidadBtu) {
        this.capacidadBtu = capacidadBtu;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Float getAmperaje() {
        return this.amperaje;
    }
    
    public void setAmperaje(Float amperaje) {
        this.amperaje = amperaje;
    }
    public Float getVoltaje() {
        return this.voltaje;
    }
    
    public void setVoltaje(Float voltaje) {
        this.voltaje = voltaje;
    }
    public Integer getPresionAlta() {
        return this.presionAlta;
    }
    
    public void setPresionAlta(Integer presionAlta) {
        this.presionAlta = presionAlta;
    }
    public Integer getPresionBaja() {
        return this.presionBaja;
    }
    
    public void setPresionBaja(Integer presionBaja) {
        this.presionBaja = presionBaja;
    }
    public String getRefrigerante() {
        return this.refrigerante;
    }
    
    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
    public Set<EquipoHasServicio> getEquipoHasServicios() {
        return this.equipoHasServicios;
    }
    
    public void setEquipoHasServicios(Set<EquipoHasServicio> equipoHasServicios) {
        this.equipoHasServicios = equipoHasServicios;
    }




}

