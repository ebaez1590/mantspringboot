/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column(unique = true)
    private String codigo;
    
    @Column(unique = true)
    private String codigoAuxiliar;
    
    @Column
    private String imagenUrl;
    
    @Column
    private Boolean habilitado;
    
    
    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference("productoDet")
    private List<DetallesAdicionales> detallesAdicionales;
    
    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
    @JsonManagedReference("productoArt")
    private List<ArticuloInventario> articulosInventario;

    public Producto() {
        
        this.detallesAdicionales = new ArrayList<DetallesAdicionales>();
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

    public List<DetallesAdicionales> getDetallesAdicionales() {
        return detallesAdicionales;
    }

    public void setDetallesAdicionales(List<DetallesAdicionales> detallesAdicionales) {
        this.detallesAdicionales = detallesAdicionales;
    }

    public List<ArticuloInventario> getArticulosInventario() {
        return articulosInventario;
    }

    public void setArticulosInventario(List<ArticuloInventario> articulosInventario) {
        this.articulosInventario = articulosInventario;
    }

    
    
    public void addDetallesAdicionales (DetallesAdicionales detalle){
        detallesAdicionales.add(detalle);
    }

    
   
}
