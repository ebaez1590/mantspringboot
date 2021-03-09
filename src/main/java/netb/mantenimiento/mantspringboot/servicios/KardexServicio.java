/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Kardex;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;


public interface KardexServicio {
    Boolean ingresosEgresos (Kardex kardex) throws Exception;
    
    RespuestaServicio<Kardex> buscarKardexPorParametros(Optional<String> articulo, Optional<String> fechaInicio, Optional<String> fechaFin) throws Exception;
    
}
