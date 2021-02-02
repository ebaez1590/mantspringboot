/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Mantenimiento {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column
    private String nombreTecnico;
    
    @Column
    private String cedulaTecnico;
    
    @Column
    private String nombre;
    
    @Column
    private String estado;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date fechaIniciaMantenimiento;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    
     @ManyToOne
    @JoinColumns({
        @JoinColumn(
            name = "producto_id",
            referencedColumnName = "producto_id"),
        @JoinColumn(
            name = "departamento_id",
            referencedColumnName = "departamento_id"),
        @JoinColumn(
            name = "bodega_id",
            referencedColumnName = "bodega_id")
    })
    private BodegaInventario bodegaInventario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public String getCedulaTecnico() {
        return cedulaTecnico;
    }

    public void setCedulaTecnico(String cedulaTecnico) {
        this.cedulaTecnico = cedulaTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIniciaMantenimiento() {
        return fechaIniciaMantenimiento;
    }

    public void setFechaIniciaMantenimiento(Date fechaIniciaMantenimiento) {
        this.fechaIniciaMantenimiento = fechaIniciaMantenimiento;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public BodegaInventario getBodegaInventario() {
        return bodegaInventario;
    }

    public void setBodegaInventario(BodegaInventario bodegaInventario) {
        this.bodegaInventario = bodegaInventario;
    }
    
    
    
}
