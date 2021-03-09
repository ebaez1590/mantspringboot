/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.DepartamentoDAO;
import netb.mantenimiento.mantspringboot.model.Departamento;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServicioImpl implements DepartamentoServicio{
    
    @Autowired
    private DepartamentoDAO departamentoDAO;

    @Override
    public Boolean guardarDepartamento(Departamento departamento) throws Exception {
        departamentoDAO.save(departamento);
        return true;
    }

    @Override
    public Boolean actualizarDepartamento(Departamento departamento) throws Exception {
        departamentoDAO.save(departamento);
        return true;
    }

    @Override
    public Boolean eliminarDepartamentoPorId(Long Id) throws Exception {
        departamentoDAO.deleteById(Id);
        return true;
    }

    @Override
    public RespuestaServicio<Departamento> departamentoPorParametros(Optional<String> busqueda, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        RespuestaServicio<Departamento> respuestaServicio = new RespuestaServicio<Departamento>();
        List<Departamento> listDepartamentos = null;
        if (busqueda.isPresent()) {
            listDepartamentos = departamentoDAO.departamentoPorParametro(busqueda, sortedById);
            respuestaServicio.setListaObjetos(listDepartamentos);
            respuestaServicio.setCantidadRegistros(departamentoDAO.count());
            return respuestaServicio;
        }else {
            return null;
        }
    }
    
    


    
}
