/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.model.Kardex;
import netb.mantenimiento.mantspringboot.servicios.ArticuloInventarioServicio;
import netb.mantenimiento.mantspringboot.servicios.KardexServicio;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("kardex")
public class KardexRest {

    @Autowired
    private KardexServicio kardexServicio;

    @Autowired
    private ArticuloInventarioServicio articuloInventarioServicio;

    @PostMapping
    public Boolean guardar(@RequestBody Kardex kardex) {
        System.out.println("kardex entrante: " + kardex.toString());
        Boolean actualiza = false;
        try {
            if (null != (kardex.getArticuloInventario()) && null != (kardex.getArticuloInventario().getId())) {
                Long idArtInv = kardex.getArticuloInventario().getId();
                Integer stock = kardex.getCantidad();
                
                ArticuloInventario articuloAux = articuloInventarioServicio.obtenerPorId(idArtInv).get();
                if (null != articuloAux) {
                    System.out.println("Articulo Inventario Recuperado: " + articuloAux.toString());
                    System.out.println("Boolean Suma: " + kardex.getSuma());
                    if (kardex.getSuma()) {
                        articuloAux.setStock(Integer.sum(articuloAux.getStock(), stock));
                        kardexServicio.ingresosEgresos(kardex);
                            articuloInventarioServicio.actualizarArticuloInventario(articuloAux);
                            actualiza = true;
                            System.out.println("articuloAux.Stock: " + articuloAux.getStock());
                    } else {
                        Integer stockActual = articuloAux.getStock();
                        if ((stockActual - stock) < 0) {
                            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el Kardex");
                        } else {
                            articuloAux.setStock(stockActual - stock);
                            System.out.println("Articulo Inventario Modificado: " + articuloAux.toString());
                            kardexServicio.ingresosEgresos(kardex);
                            articuloInventarioServicio.actualizarArticuloInventario(articuloAux);
                            actualiza = true;
                        }

                    }

                }

            }
            return actualiza;

        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el Kardex", ex);
        }
    }

    @GetMapping
    public ResponseEntity<RespuestaServicio> reporteInventario(
            @RequestParam String fechaInicio,
            @RequestParam String fechaFin,
            @RequestParam Optional<Long> busqueda) {
        RespuestaServicio<Kardex> reporteKardex;
        try {
            Date fechaIniCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaInicio);
            Date fechaFinCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaFin);
            reporteKardex = kardexServicio.buscarKardexPorParametros(fechaIniCast, fechaFinCast, busqueda);
            return ResponseEntity.status(HttpStatus.OK).body(reporteKardex);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

}
