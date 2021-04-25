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
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MantenimientoServicioImpl implements MantenimientoServicio {

    @Autowired
    private MantenimientoDAO mantenimientoDAO;

    @Override
    public Boolean guardarMantenimiento(Mantenimiento mantenimiento) throws Exception {
        mantenimientoDAO.save(mantenimiento);
        return true;
    }

    @Override
    public Boolean actualizarMantenimiento(Mantenimiento mantenimiento) throws Exception {
        boolean actualizar = false;
        if (null != mantenimiento) {
            Long idMant = mantenimiento.getId();
            Mantenimiento objAux = mantenimientoDAO.findById(idMant).get();
            if (null != objAux) {
                objAux.setNombreTecnico((null != mantenimiento.getNombreTecnico()) ? mantenimiento.getNombreTecnico() : objAux.getNombreTecnico());
                objAux.setCedulaTecnico((null != mantenimiento.getCedulaTecnico()) ? mantenimiento.getCedulaTecnico() : objAux.getCedulaTecnico());
                objAux.setNombre((null != mantenimiento.getNombre()) ? mantenimiento.getNombre() : objAux.getNombre());
                objAux.setEstado((null != mantenimiento.getEstado()) ? mantenimiento.getEstado() : objAux.getEstado());
                objAux.setFechaEntrega((null != mantenimiento.getFechaEntrega()) ? mantenimiento.getFechaEntrega() : objAux.getFechaEntrega());
                objAux.setFechaIniciaMantenimiento((null != mantenimiento.getFechaIniciaMantenimiento()) ? mantenimiento.getFechaIniciaMantenimiento() : objAux.getFechaIniciaMantenimiento());
                objAux.setFechaEntrega((null != mantenimiento.getFechaEntrega()) ? mantenimiento.getFechaEntrega() : objAux.getFechaEntrega());
                objAux.setFechaTerminaMantenimiento((null != mantenimiento.getFechaTerminaMantenimiento()) ? mantenimiento.getFechaTerminaMantenimiento() : objAux.getFechaTerminaMantenimiento());
                objAux.setTipoMantenimiento((null != mantenimiento.getTipoMantenimiento()) ? mantenimiento.getTipoMantenimiento() : objAux.getTipoMantenimiento());
                mantenimientoDAO.save(objAux);
                actualizar = true;
                
            }
        }
        
        return actualizar;

    }

    @Override
    public List<Mantenimiento> reportesMantenimiento(Date fechaInicio, Date fechaFin, Optional<Long> articulo, Optional<String> estado, Optional<String> cedulaTecnico) throws Exception {
        return mantenimientoDAO.reportesMantenimiento(fechaInicio, fechaFin, articulo, estado, cedulaTecnico);
    }

    @Override
    public List<Mantenimiento> reporteEstado(Optional<String> estado, Date fechaInicio, Date fechaFin) throws Exception {
        return mantenimientoDAO.reporteEstado(estado, fechaInicio, fechaFin);
    }

    @Override
    public List<Mantenimiento> reporteCedula(String cedulaTecnico, Date fechaInicio, Date fechaFin) throws Exception {
        return mantenimientoDAO.reporteCedula(cedulaTecnico, fechaInicio, fechaFin);
    }

    @Override
    public List<Mantenimiento> reporteArticuloInventario(Long articuloInvId, Date fechaInicio, Date fechaFin) throws Exception {
        return mantenimientoDAO.reporteArticuloInventario(articuloInvId, fechaInicio, fechaFin);
    }

    @Override
    public RespuestaServicio<Mantenimiento> mantenimientoPorParametros(Long articuloInvId, Optional<String> estado, Optional<String> busqueda, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        RespuestaServicio<Mantenimiento> respuestaServicio = new RespuestaServicio<Mantenimiento>();
        List<Mantenimiento> listMantenimientos = null;
        if (busqueda.isPresent()) {
            listMantenimientos = mantenimientoDAO.mantenimientoPorParametros(articuloInvId, estado, busqueda, sortedById);
            respuestaServicio.setListaObjetos(listMantenimientos);
            respuestaServicio.setCantidadRegistros(mantenimientoDAO.count());
            return respuestaServicio;
        } else {
            return null;
        }
    }

}
