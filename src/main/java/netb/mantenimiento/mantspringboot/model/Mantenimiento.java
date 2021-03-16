/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Mantenimiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombreTecnico;

    @Column
    private String cedulaTecnico;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String estado;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaIngreso;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaIniciaMantenimiento;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaEntrega;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaTerminaMantenimiento;

    @Column
    private String tipoMantenimiento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_art_invent", nullable = false)
    @JsonBackReference("articuloInvM")
    private ArticuloInventario articuloInventario;

    @PrePersist
    public void prePersist() {
        fechaIngreso = new Date();
    }

    public Mantenimiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public ArticuloInventario getArticuloInventario() {
        return articuloInventario;
    }

    public void setArticuloInventario(ArticuloInventario articuloInventario) {
        this.articuloInventario = articuloInventario;
    }

    public Date getFechaTerminaMantenimiento() {
        return fechaTerminaMantenimiento;
    }

    public void setFechaTerminaMantenimiento(Date fechaTerminaMantenimiento) {
        this.fechaTerminaMantenimiento = fechaTerminaMantenimiento;
    }

}
