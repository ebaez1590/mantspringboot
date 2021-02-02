/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.NaturalId;

@Entity
@Table
public class BodegaInventario {
    
    @EmbeddedId
    private BodegaInventarioId id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("prodId")
    private Producto producto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bodId")
    private Bodega bodega;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("deptId")
    private Departamento departamento;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @NaturalId
    @Column(nullable = false, unique = true)
    private String codigo;
    
    @Column
    private String codigoAuxiliar;
    
    @Column 
    private Boolean habilitado;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bodegaInventario")
    private List<Mantenimiento> mantenimiento;
    
    private BodegaInventario (){}

    public BodegaInventario(BodegaInventarioId id, Producto producto, Bodega bodega, Departamento departamento, String nombre, String descripcion, String codigo, String codigoAuxiliar, Boolean habilitado, List<Mantenimiento> mantenimiento) {
        this.id = id;
        this.producto = producto;
        this.bodega = bodega;
        this.departamento = departamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.codigoAuxiliar = codigoAuxiliar;
        this.habilitado = habilitado;
        this.mantenimiento = mantenimiento;
    }

    

    public BodegaInventarioId getId() {
        return id;
    }

    public void setId(BodegaInventarioId id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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

    public String getCodigoAuxiliar() {
        return codigoAuxiliar;
    }

    public void setCodigoAuxiliar(String codigoAuxiliar) {
        this.codigoAuxiliar = codigoAuxiliar;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<Mantenimiento> getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(List<Mantenimiento> mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        BodegaInventario that = (BodegaInventario) o;
        return Objects.equals(producto, that.producto) &&
               Objects.equals(bodega, that.bodega) && Objects.equals(departamento, that.departamento);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(producto, bodega, departamento);
    }
    
}
