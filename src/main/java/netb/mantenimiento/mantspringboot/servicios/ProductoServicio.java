/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Producto;

public interface ProductoServicio {
    
    Boolean guardarProducto(Producto producto)throws Exception;
    
    Boolean actualizarProducto(Producto producto)throws Exception;
    
    Boolean eliminarProductoPorId(Long Id) throws Exception;
    
    List<Producto> listarTodos() throws Exception;
    
    List<Producto> productoPorParametros (Optional<String> busqueda, String skip, String take) throws Exception;
    
    
    
}
