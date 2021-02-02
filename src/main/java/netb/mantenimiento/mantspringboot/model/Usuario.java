/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column
    private String nombre;
    
    @Column
    private String cedula;
    
    @Column
    private String usuario;
    
    @Column
    private String password;
    
    @Column
    private Boolean habilitado;
    
    @Column
    private Boolean gestionaProductos;
    
    @Column
    private Boolean gestionaBodegas;
    
    @Column
    private Boolean gestionaDepartamentos;
    
    @Column
    private Boolean gestionaInventario;
    
    @Column
    private Boolean daMantenimiento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Boolean getGestionaProductos() {
        return gestionaProductos;
    }

    public void setGestionaProductos(Boolean gestionaProductos) {
        this.gestionaProductos = gestionaProductos;
    }

    public Boolean getGestionaBodegas() {
        return gestionaBodegas;
    }

    public void setGestionaBodegas(Boolean gestionaBodegas) {
        this.gestionaBodegas = gestionaBodegas;
    }

    public Boolean getGestionaDepartamentos() {
        return gestionaDepartamentos;
    }

    public void setGestionaDepartamentos(Boolean gestionaDepartamentos) {
        this.gestionaDepartamentos = gestionaDepartamentos;
    }

    public Boolean getGestionaInventario() {
        return gestionaInventario;
    }

    public void setGestionaInventario(Boolean gestionaInventario) {
        this.gestionaInventario = gestionaInventario;
    }

    public Boolean getDaMantenimiento() {
        return daMantenimiento;
    }

    public void setDaMantenimiento(Boolean daMantenimiento) {
        this.daMantenimiento = daMantenimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", usuario=" + usuario + ", password=" + password + ", habilitado=" + habilitado + ", gestionaProductos=" + gestionaProductos + ", gestionaBodegas=" + gestionaBodegas + ", gestionaDepartamentos=" + gestionaDepartamentos + ", gestionaInventario=" + gestionaInventario + ", daMantenimiento=" + daMantenimiento + '}';
    }
    
    
}
