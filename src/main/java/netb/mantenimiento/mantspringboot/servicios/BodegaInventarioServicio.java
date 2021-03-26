/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.BodegaInventario;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;


public interface BodegaInventarioServicio {
    
    Boolean guardarBodegaInventario(BodegaInventario bodegaInventario) throws Exception;
    
    Boolean actualizarBodegaInventario(BodegaInventario bodegaInventario) throws Exception;
    
    Boolean eliminarBodegaInventarioPorId(Long Id) throws Exception;
    
    RespuestaServicio<BodegaInventario> bodegaInventarioPorParametros (Optional<String> busqueda, Long idDepartamento, String skip, String take) throws Exception;
    
}
