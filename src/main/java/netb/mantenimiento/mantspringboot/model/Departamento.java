/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column(unique = true)
    String codigo;

    @Column
    private boolean habilitado;
    
    @OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY)
    @JsonManagedReference("departamentoBod")
    private List<BodegaInventario> bodegaInventarios;
    

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

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<BodegaInventario> getBodegaInventarios() {
        return bodegaInventarios;
    }

    public void setBodegaInventarios(List<BodegaInventario> bodegaInventarios) {
        this.bodegaInventarios = bodegaInventarios;
    }

          
    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", codigo=" + codigo + ", habilitado=" + habilitado + '}';
    }

}
