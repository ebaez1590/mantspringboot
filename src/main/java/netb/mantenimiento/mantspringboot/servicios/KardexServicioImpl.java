/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.KardexDAO;
import netb.mantenimiento.mantspringboot.model.Kardex;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KardexServicioImpl implements KardexServicio{
    
    @Autowired
    private KardexDAO kardexDAO;

    @Override
    public Boolean ingresosEgresos(Kardex kardex) throws Exception {
        kardexDAO.save(kardex);
        return true;
    }

    @Override
    public RespuestaServicio<Kardex> buscarKardexPorParametros(Optional<String> articulo, Optional<String> fechaInicio, Optional<String> fechaFin) throws Exception {
        RespuestaServicio<Kardex> respuestaServicio = new RespuestaServicio<Kardex>();
        List<Kardex> listKardex = null;
        if(articulo.isPresent() && fechaInicio.isPresent() && fechaFin.isPresent()){
            listKardex = kardexDAO.buscarKardexPorParametros(articulo, fechaInicio, fechaFin);
            respuestaServicio.setListaObjetos(listKardex);
            return respuestaServicio;
        }else return null;
        
    }
    
    
    
    
}
