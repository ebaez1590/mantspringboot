/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.model.Kardex;
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
    
    @PostMapping
    public Boolean guardar(@RequestBody Kardex kardex) {
        System.out.println("kardex entrante: " + kardex.toString());
        try {
            return kardexServicio.ingresosEgresos(kardex);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el Kardex", ex);
        }
    }
    
    @GetMapping
    public ResponseEntity<RespuestaServicio> reporteInventario(@RequestParam Optional<String> articulo,
            @RequestParam Optional<String> fechaInicio,
            @RequestParam Optional<String> fechaFin) {
        RespuestaServicio<Kardex> reporteKardex;
        try {
            
            reporteKardex = kardexServicio.buscarKardexPorParametros(articulo, fechaInicio, fechaFin);
            return ResponseEntity.status(HttpStatus.OK).body(reporteKardex);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }
    
}
