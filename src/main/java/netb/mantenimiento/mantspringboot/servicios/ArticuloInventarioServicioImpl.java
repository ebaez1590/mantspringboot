/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.ArticuloInventarioDAO;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInventarioServicioImpl implements ArticuloInventarioServicio{
    
    @Autowired
    private ArticuloInventarioDAO articuloInventarioDAO;

    @Override
    public Boolean guardarArticuloInventario(ArticuloInventario articuloInventario) throws Exception {
        articuloInventarioDAO.save(articuloInventario);
        return true;
    }

    @Override
    public Boolean actualizarArticuloInventario(ArticuloInventario articuloInventario) throws Exception {
        articuloInventarioDAO.save(articuloInventario);
        return true;
    }

    @Override
    public RespuestaServicio<ArticuloInventario> articuloInventarioPorParametros(Optional<String> busqueda, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        RespuestaServicio<ArticuloInventario> respuestaServicio = new RespuestaServicio<ArticuloInventario>();
        List<ArticuloInventario> listArticuloInventario = null;
        if (busqueda.isPresent()) {
            listArticuloInventario = articuloInventarioDAO.articuloInventarioPorParametro(busqueda, sortedById);
            respuestaServicio.setListaObjetos(listArticuloInventario);
            respuestaServicio.setCantidadRegistros(articuloInventarioDAO.count());
            return respuestaServicio;
        }else {
            return null;
        }
    }
    
}
