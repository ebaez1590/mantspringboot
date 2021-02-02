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
public class Departamento {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    String codigo;

    @Column
    private Boolean habilitado;

    @OneToMany(
            mappedBy = "departamento",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<BodegaInventario> departamentos;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<BodegaInventario> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<BodegaInventario> departamentos) {
        this.departamentos = departamentos;
    }

    
    
    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", codigo=" + codigo + ", habilitado=" + habilitado + '}';
    }

}
