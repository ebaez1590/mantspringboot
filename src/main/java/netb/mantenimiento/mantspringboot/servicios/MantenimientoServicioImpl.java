/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.MantenimientoDAO;
import netb.mantenimiento.mantspringboot.model.Mantenimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MantenimientoServicioImpl implements MantenimientoServicio{
    
    @Autowired
    private MantenimientoDAO mantenimientoDAO;

    @Override
    public Boolean guardarMantenimiento(Mantenimiento mantenimiento) throws Exception {
        mantenimientoDAO.save(mantenimiento);
        return true;
    }

    @Override
    public Boolean actualizarMantenimiento(Mantenimiento mantenimiento) throws Exception {
        mantenimientoDAO.save(mantenimiento);
        return true;
    }

    @Override
    public List<Mantenimiento> reportesMantenimiento(Date fechaInicio, Date fechaFin, Optional<Long> articulo, Optional<String> estado, Optional<String> cedulaTecnico) throws Exception {
        return mantenimientoDAO.reportesMantenimiento(fechaInicio, fechaFin, articulo, estado, cedulaTecnico);
    }
    
    
    
}
