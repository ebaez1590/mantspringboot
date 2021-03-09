/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Departamento;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;


public interface DepartamentoServicio {
    
    Boolean guardarDepartamento(Departamento departamento) throws Exception;
    
    Boolean actualizarDepartamento(Departamento departamento) throws Exception;
    
    Boolean eliminarDepartamentoPorId(Long Id) throws Exception;
    
    RespuestaServicio<Departamento> departamentoPorParametros (Optional<String> busqueda, String skip, String take) throws Exception;
    
}
