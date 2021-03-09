/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.TipoBodegaDAO;
import netb.mantenimiento.mantspringboot.model.TipoBodega;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TipoBodegaServicioImpl implements TipoBodegaServicio {

    @Autowired
    private TipoBodegaDAO tipoBodegaDAO;

    @Override
    public Boolean guardarTipoBodega(TipoBodega tipoBodega) throws Exception {
        tipoBodegaDAO.save(tipoBodega);
        return true;
    }

    @Override
    public Boolean actualizarTipoBodega(TipoBodega tipoBodega) throws Exception {
        tipoBodegaDAO.save(tipoBodega);
        return true;
    }

    @Override
    public Boolean eliminarTipoBodegaPorId(Long Id) throws Exception {
        tipoBodegaDAO.deleteById(Id);
        return true;
    }

    @Override
    public List<TipoBodega> listarTodos() throws Exception {
        List<TipoBodega> listTiposBodegas = (List<TipoBodega>) tipoBodegaDAO.findAll();
        if (null != listTiposBodegas && listTiposBodegas.size() > 0) {
            return listTiposBodegas;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No Existen Tipos Bodegas");
        }
    }

    @Override
    public RespuestaServicio<TipoBodega> tipoBodegaPorParametros(Optional<String> busqueda, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        RespuestaServicio<TipoBodega> respuestaServicio = new RespuestaServicio<TipoBodega>();
        List<TipoBodega> listTiposBodegas = null;
        if (busqueda.isPresent()) {
            listTiposBodegas = tipoBodegaDAO.tipoBodegaPorParametros(busqueda, sortedById);
            respuestaServicio.setListaObjetos(listTiposBodegas);
            respuestaServicio.setCantidadRegistros(tipoBodegaDAO.count());
            return respuestaServicio;
        }else {
            return null;
        }

    }

}
