/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.BodegaInventarioDAO;
import netb.mantenimiento.mantspringboot.model.BodegaInventario;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BodegaInventarioServicioImpl implements BodegaInventarioServicio{
    
    @Autowired
    private BodegaInventarioDAO bodegaInventarioDAO;

    @Override
    public Boolean guardarBodegaInventario(BodegaInventario bodegaInventario) throws Exception {
        bodegaInventarioDAO.save(bodegaInventario);
        return true;
    }

    @Override
    public Boolean actualizarBodegaInventario(BodegaInventario bodegaInventario) throws Exception {
        bodegaInventarioDAO.save(bodegaInventario);
        return true;
    }

    @Override
    public Boolean eliminarBodegaInventarioPorId(Long Id) throws Exception {
        bodegaInventarioDAO.deleteById(Id);
        return true;
    }

    @Override
    public RespuestaServicio<BodegaInventario> bodegaInventarioPorParametros(Optional<String> busqueda, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        RespuestaServicio<BodegaInventario> respuestaServicio = new RespuestaServicio<BodegaInventario>();
        List<BodegaInventario> listBodegaInventario = null;
        if (busqueda.isPresent()) {
            listBodegaInventario = bodegaInventarioDAO.bodegaInventarioPorParametro(busqueda, sortedById);
            respuestaServicio.setListaObjetos(listBodegaInventario);
            respuestaServicio.setCantidadRegistros(bodegaInventarioDAO.count());
            return respuestaServicio;
        }else {
            return null;
        }
    }
    
}