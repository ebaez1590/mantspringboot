/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.TipoBodega;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;


public interface TipoBodegaServicio {
    
    Boolean guardarTipoBodega(TipoBodega tipoBodega) throws Exception;
    
    Boolean actualizarTipoBodega(TipoBodega tipoBodega) throws Exception;
    
    Boolean eliminarTipoBodegaPorId(Long Id) throws Exception;
    
    List<TipoBodega> listarTodos() throws Exception;
    
    RespuestaServicio<TipoBodega> tipoBodegaPorParametros (Optional<String> busqueda, String skip, String take) throws Exception;
    
}
