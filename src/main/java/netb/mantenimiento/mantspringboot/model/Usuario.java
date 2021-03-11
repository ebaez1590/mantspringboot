/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nombre;
    
    @Column(unique = true)
    private String cedula;
    
    @Column(unique = true)
    private String usuario;
    
    @Column
    private String password;
    
    @Column(columnDefinition = "boolean default true")
    private boolean habilitado = true;
    
    @Column(columnDefinition = "boolean default false")
    private boolean gestionaProductos = false;
    
    @Column(columnDefinition = "boolean default false")
    private boolean gestionaBodegas = false;
    
    @Column(columnDefinition = "boolean default false")
    private boolean gestionaDepartamentos = false;
    
    @Column(columnDefinition = "boolean default false")
    private boolean gestionaInventario = false;
    
    @Column(columnDefinition = "boolean default false")
    private boolean daMantenimiento = false;
    
    @Column(columnDefinition = "boolean default false")
    private boolean verReporte = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isGestionaProductos() {
        return gestionaProductos;
    }

    public void setGestionaProductos(boolean gestionaProductos) {
        this.gestionaProductos = gestionaProductos;
    }

    public boolean isGestionaBodegas() {
        return gestionaBodegas;
    }

    public void setGestionaBodegas(boolean gestionaBodegas) {
        this.gestionaBodegas = gestionaBodegas;
    }

    public boolean isGestionaDepartamentos() {
        return gestionaDepartamentos;
    }

    public void setGestionaDepartamentos(boolean gestionaDepartamentos) {
        this.gestionaDepartamentos = gestionaDepartamentos;
    }

    public boolean isGestionaInventario() {
        return gestionaInventario;
    }

    public void setGestionaInventario(boolean gestionaInventario) {
        this.gestionaInventario = gestionaInventario;
    }

    public boolean isDaMantenimiento() {
        return daMantenimiento;
    }

    public void setDaMantenimiento(boolean daMantenimiento) {
        this.daMantenimiento = daMantenimiento;
    }

    public boolean isVerReporte() {
        return verReporte;
    }

    public void setVerReporte(boolean verReporte) {
        this.verReporte = verReporte;
    }
    
    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", usuario=" + usuario + ", password=" + password + ", habilitado=" + habilitado + ", gestionaProductos=" + gestionaProductos + ", gestionaBodegas=" + gestionaBodegas + ", gestionaDepartamentos=" + gestionaDepartamentos + ", gestionaInventario=" + gestionaInventario + ", daMantenimiento=" + daMantenimiento + '}';
    }

    
}
