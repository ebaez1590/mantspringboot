/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.utils;

import java.util.List;


public class RespuestaServicio<T> {
    
    private List<T> listaObjetos;
    private Long cantidadRegistros = 0L;

    public List<T> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<T> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public Long getCantidadRegistros() {
        return cantidadRegistros;
    }

    public void setCantidadRegistros(Long cantidadRegistros) {
        this.cantidadRegistros = cantidadRegistros;
    }
    
    
    
}
