/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Mantenimiento;
import netb.mantenimiento.mantspringboot.model.Producto;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;

public interface MantenimientoServicio {

    Boolean guardarMantenimiento(Mantenimiento mantenimiento) throws Exception;

    Boolean actualizarMantenimiento(Mantenimiento mantenimiento) throws Exception;

    List<Mantenimiento> reportesMantenimiento (Date fechaInicio, Date fechaFin, Optional<Long> articulo, Optional<String> estado, Optional<String> cedulaTecnico) throws Exception;
    //@Param("estado") String estado, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin
    List<Mantenimiento> reporteEstado (String estado, Date fechaInicio, Date fechaFin) throws Exception;
    //@Param("cedulaTecnico") String cedulaTecnico, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin
    List<Mantenimiento> reporteCedula (String cedulaTecnico, Date fechaInicio, Date fechaFin) throws Exception;
    //@Param("articuloInvId") Long articuloInvId, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin
    List<Mantenimiento> reporteArticuloInventario (Long articuloInvId, Date fechaInicio, Date fechaFin) throws Exception;
    
    RespuestaServicio<Mantenimiento> mantenimientoPorParametros (Long articuloInvId, Optional<String> busqueda, String skip, String take) throws Exception;

}
