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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Producto {
    
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String codigo;
    
    @Column
    private String codigoAuxiliar;
    
    @Column
    private String imagenUrl;
    
    @Column
    private Boolean habilitado;
    
    @OneToMany(
        mappedBy = "producto",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
    private List<BodegaInventario> productos;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
    private List<DetallesAdicionales> detalles;

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

    public String getCodigoAuxiliar() {
        return codigoAuxiliar;
    }

    public void setCodigoAuxiliar(String codigoAuxiliar) {
        this.codigoAuxiliar = codigoAuxiliar;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<BodegaInventario> getProductos() {
        return productos;
    }

    public void setProductos(List<BodegaInventario> productos) {
        this.productos = productos;
    }

    public List<DetallesAdicionales> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesAdicionales> detalles) {
        this.detalles = detalles;
    }

    

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", codigo=" + codigo + ", codigoAuxiliar=" + codigoAuxiliar + ", imagenUrl=" + imagenUrl + ", habilitado=" + habilitado + '}';
    }
    
}
