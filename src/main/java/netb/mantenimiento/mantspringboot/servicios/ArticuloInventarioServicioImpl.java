/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.ArticuloInventarioDAO;
import netb.mantenimiento.mantspringboot.dao.TipoBodegaDAO;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.model.TipoBodega;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInventarioServicioImpl implements ArticuloInventarioServicio {

    @Autowired
    private ArticuloInventarioDAO articuloInventarioDAO;

    @Override
    public Boolean guardarArticuloInventario(ArticuloInventario articuloInventario) throws Exception {
        articuloInventarioDAO.save(articuloInventario);
        return true;
    }

    @Override
    public Boolean actualizarArticuloInventario(ArticuloInventario articuloInventario) throws Exception {
        boolean actualizar = false;
        if (null != articuloInventario) {
            Long idArt = articuloInventario.getId();
            ArticuloInventario objAux = articuloInventarioDAO.findById(idArt).get();
            if (null != objAux) {
                objAux.setNombre((null != articuloInventario.getNombre()) ? articuloInventario.getNombre() : objAux.getNombre());
                objAux.setStock((null != articuloInventario.getStock()) ? articuloInventario.getStock() : objAux.getStock());
                objAux.setDescripcion((null != articuloInventario.getDescripcion()) ? articuloInventario.getDescripcion() : objAux.getDescripcion());
                objAux.setCodigo((null != articuloInventario.getCodigo()) ? articuloInventario.getCodigo() : objAux.getCodigo());
                objAux.setCodigoAuxiliar((null != articuloInventario.getCodigoAuxiliar()) ? articuloInventario.getCodigoAuxiliar() : objAux.getCodigoAuxiliar());
                objAux.setHabilitado((null != articuloInventario.getHabilitado()) ? articuloInventario.getHabilitado() : objAux.getHabilitado());
                objAux.setFechaCreacion((null != articuloInventario.getFechaCreacion()) ? articuloInventario.getFechaCreacion() : objAux.getFechaCreacion());
                articuloInventarioDAO.save(objAux);
                actualizar = true;

            }
        }

        return actualizar;
    }

    @Override
    public RespuestaServicio<ArticuloInventario> articuloInventarioPorParametros(Optional<String> busqueda, Long idBodegaInventario, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        RespuestaServicio<ArticuloInventario> respuestaServicio = new RespuestaServicio<ArticuloInventario>();
        List<ArticuloInventario> listArticuloInventario = null;
        if (busqueda.isPresent()) {
            listArticuloInventario = articuloInventarioDAO.articuloInventarioPorParametro(busqueda, idBodegaInventario, sortedById);
            respuestaServicio.setListaObjetos(listArticuloInventario);
            respuestaServicio.setCantidadRegistros(articuloInventarioDAO.count());
            return respuestaServicio;
        } else {
            return null;
        }
    }

    @Override
    public Optional<ArticuloInventario> obtenerPorId(Long id) throws Exception {
        return articuloInventarioDAO.findById(id);
    }

    @Override
    public List<ArticuloInventario> articuloInventarioPorBodega(Long bodegaInvId, Date fechaInicio, Date fechaFin) throws Exception {
        return articuloInventarioDAO.articuloInventarioPorBodega(bodegaInvId, fechaInicio, fechaFin);
    }

    @Override
    public List<ArticuloInventario> articuloInventarioPorArticuloInv(Long bodegaInvId, Long articuloInvId, Date fechaInicio, Date fechaFin) throws Exception {
        return articuloInventarioDAO.articuloInventarioPorArticuloInv(bodegaInvId, articuloInvId, fechaInicio, fechaFin);
    }

}
