/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;


public interface ArticuloInventarioServicio {
    
    Boolean guardarArticuloInventario(ArticuloInventario articuloInventario) throws Exception;
    
    Boolean actualizarArticuloInventario(ArticuloInventario articuloInventario) throws Exception;
    
    RespuestaServicio<ArticuloInventario> articuloInventarioPorParametros (Optional<String> busqueda, String skip, String take) throws Exception;
    
}
