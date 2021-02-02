/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bodega {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String codigo;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String direccion;

    @Column
    private Boolean habilitado;

    @OneToMany(
            mappedBy = "bodega",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<BodegaInventario> bodegas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<BodegaInventario> getBodegas() {
        return bodegas;
    }

    public void setBodegas(List<BodegaInventario> bodegas) {
        this.bodegas = bodegas;
    }

    
    
    @Override
    public String toString() {
        return "Bodega{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", direccion=" + direccion + ", habilitado=" + habilitado + '}';
    }

}
