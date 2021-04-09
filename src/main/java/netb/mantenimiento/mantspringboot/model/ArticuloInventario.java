/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class ArticuloInventario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private Integer stock;

    @Column
    private String descripcion;

    @Column
    private String codigo;

    @Column
    private String codigoAuxiliar;

    @Column
    private Boolean habilitado;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bodega_inv", nullable = false)
    @JsonBackReference("bodegaArt")
    private BodegaInventario bodegaInventario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false)
    @JsonBackReference("productoArt")
    private Producto producto;

    @OneToMany(mappedBy = "articuloInventario", fetch = FetchType.LAZY)
    @JsonManagedReference("articuloInvK")
    private List<Kardex> kardexs;

    @OneToMany(mappedBy = "articuloInventario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("articuloInvM")
    private List<Mantenimiento> mantenimientos;
    
    @Transient
    private Long tipoBodegaId;

    @PrePersist
    public void prePersist() {
        fechaCreacion = new Date();
    }

    public ArticuloInventario() {
        mantenimientos = new ArrayList<Mantenimiento>();
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public BodegaInventario getBodegaInventario() {
        return bodegaInventario;
    }

    public void setBodegaInventario(BodegaInventario bodegaInventario) {
        this.bodegaInventario = bodegaInventario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Kardex> getKardexs() {
        return kardexs;
    }

    public void setKardexs(List<Kardex> kardexs) {
        this.kardexs = kardexs;
    }

    public List<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public void setMantenimientos(List<Mantenimiento> mantenimientos) {
        this.mantenimientos = mantenimientos;
    }

    public void addMantenimiento(Mantenimiento mantenimiento) {
        mantenimientos.add(mantenimiento);
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getTipoBodegaId() {
        return tipoBodegaId;
    }

    public void setTipoBodegaId(Long tipoBodegaId) {
        this.tipoBodegaId = tipoBodegaId;
    }
    
    

    @Override
    public String toString() {
        return "ArticuloInventario{" + "id=" + id + ", nombre=" + nombre + ", stock=" + stock + ", descripcion=" + descripcion + ", codigo=" + codigo + ", codigoAuxiliar=" + codigoAuxiliar + ", habilitado=" + habilitado + '}';
    }

}
