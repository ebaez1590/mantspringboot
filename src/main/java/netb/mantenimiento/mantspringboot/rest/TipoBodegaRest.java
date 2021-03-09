/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.TipoBodega;
import netb.mantenimiento.mantspringboot.servicios.TipoBodegaServicio;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("tipo-bodega")
public class TipoBodegaRest {

    @Autowired
    private TipoBodegaServicio tipoBodegaServicio;

    @PostMapping
    public Boolean guardar(@RequestBody TipoBodega tipoBodega) {
        System.out.println("TipoBdega entrante: " + tipoBodega.toString());
        try {
            return tipoBodegaServicio.guardarTipoBodega(tipoBodega);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el tipo Bodega", ex);
        }
    }

    @PutMapping
    public Boolean actualizar(@RequestBody TipoBodega tipoBodega) {
        System.out.println("TipoBdega entrante: " + tipoBodega.toString());
        try {
            return tipoBodegaServicio.guardarTipoBodega(tipoBodega);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el tipo Bodega", ex);
        }
    }

    @DeleteMapping
    public Boolean eliminar(@PathVariable("id") Long id) {
        System.out.println("Tipo Bodega a eliminar: " + id);
        try {
            return tipoBodegaServicio.eliminarTipoBodegaPorId(id);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible eliminar el TipoBodega", ex);
        }
    }

    @GetMapping
    public ResponseEntity<RespuestaServicio> listar(@RequestParam Optional<String> busqueda,
            @RequestParam Optional<String> skip,
            @RequestParam Optional<String> take) {
        RespuestaServicio<TipoBodega> tiposBodegaRecuperados;
        try {
            String skipCast = "0";
            String takeCast = "10";

            if (skip.isPresent()) {
                skipCast = skip.get();
            }

            if (take.isPresent()) {
                takeCast = take.get();
            }
            tiposBodegaRecuperados = tipoBodegaServicio.tipoBodegaPorParametros(busqueda, skipCast, takeCast);
            return ResponseEntity.status(HttpStatus.OK).body(tiposBodegaRecuperados);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

}
