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

public interface MantenimientoServicio {

    Boolean guardarMantenimiento(Mantenimiento mantenimiento) throws Exception;

    Boolean actualizarMantenimiento(Mantenimiento mantenimiento) throws Exception;

    List<Mantenimiento> reportesMantenimiento (Date fechaInicio, Date fechaFin, Optional<Long> articulo, Optional<String> estado, Optional<String> cedulaTecnico) throws Exception;

}
