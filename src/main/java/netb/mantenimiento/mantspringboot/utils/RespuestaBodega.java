/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.utils;

/**
 *
 * @author chamb
 */
public class RespuestaBodega {
    
    private String nombre;
    private String descripcion;
    private boolean esMantenimiento;

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

    public boolean isEsMantenimiento() {
        return esMantenimiento;
    }

    public void setEsMantenimiento(boolean esMantenimiento) {
        this.esMantenimiento = esMantenimiento;
    }
    
    
    
}
