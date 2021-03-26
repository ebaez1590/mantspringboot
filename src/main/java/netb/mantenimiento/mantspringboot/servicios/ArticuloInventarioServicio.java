/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;


public interface ArticuloInventarioServicio {
    
    Boolean guardarArticuloInventario(ArticuloInventario articuloInventario) throws Exception;
    
    Boolean actualizarArticuloInventario(ArticuloInventario articuloInventario) throws Exception;
    
    RespuestaServicio<ArticuloInventario> articuloInventarioPorParametros (Optional<String> busqueda, Long idBodegaInventario, String skip, String take) throws Exception;
    
    Optional<ArticuloInventario> obtenerPorId (Long id) throws Exception;
    
    //@Param("bodegaInvId") Long bodegaInvId, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin
    List<ArticuloInventario> articuloInventarioPorBodega (Long bodegaInvId, Date fechaInicio, Date fechaFin) throws Exception;
    
    //@Param("bodegaInvId") Long bodegaInvId, @Param("articuloInvId") Long articuloInvId, @Param("fechaInicio"
    List<ArticuloInventario> articuloInventarioPorArticuloInv (Long bodegaInvId, Long articuloInvId, Date fechaInicio, Date fechaFin) throws Exception;
    
}
