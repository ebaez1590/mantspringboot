/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class BodegaInventario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @Column
    private String codigo;
    
    @Column
    private Boolean habilitado;
    
    @Column
    private String direccion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento", nullable = false)
    @JsonBackReference("departamentoBod")
     private Departamento departamento;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_bodega", nullable = false)
    @JsonBackReference("tipoBodegaBI")
    private TipoBodega tipoBodega;
    
    @OneToMany(mappedBy = "bodegaInventario", fetch = FetchType.LAZY)
    @JsonManagedReference("bodegaArt")
    private List<ArticuloInventario> articulosInventario;
   
    public BodegaInventario (){}

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


    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public TipoBodega getTipoBodega() {
        return tipoBodega;
    }

    public void setTipoBodega(TipoBodega tipoBodega) {
        this.tipoBodega = tipoBodega;
    }

    public List<ArticuloInventario> getArticulosInventario() {
        return articulosInventario;
    }

    public void setArticulosInventario(List<ArticuloInventario> articulosInventario) {
        this.articulosInventario = articulosInventario;
    }

    
    
    
}
