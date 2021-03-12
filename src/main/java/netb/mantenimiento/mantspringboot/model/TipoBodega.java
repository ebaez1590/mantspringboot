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
public class TipoBodega implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @Column
    private boolean habilitado;
    
    @Column
    private boolean esMantenimiento;
    
    @OneToMany(mappedBy = "tipoBodega", fetch = FetchType.LAZY)
    @JsonManagedReference("tipoBodegaBI")
    private List<BodegaInventario> bodegaInventarios;

    public TipoBodega() {
    }

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

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isEsMantenimiento() {
        return esMantenimiento;
    }

    public void setEsMantenimiento(boolean esMantenimiento) {
        this.esMantenimiento = esMantenimiento;
    }

    public List<BodegaInventario> getBodegaInventarios() {
        return bodegaInventarios;
    }

    public void setBodegaInventarios(List<BodegaInventario> bodegaInventarios) {
        this.bodegaInventarios = bodegaInventarios;
    }
    
}
