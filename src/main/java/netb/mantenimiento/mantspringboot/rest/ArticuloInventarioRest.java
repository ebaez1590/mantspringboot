/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.servicios.ArticuloInventarioServicio;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("articulo-inventario")
public class ArticuloInventarioRest {

    @Autowired
    private ArticuloInventarioServicio articuloInventarioServicio;

    @PostMapping
    public Boolean guardar(@RequestBody ArticuloInventario articuloInventario) {
        System.out.println("ArticuloInventario entrante: " + articuloInventario.toString());
        try {
            return articuloInventarioServicio.guardarArticuloInventario(articuloInventario);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el ArticuloInventario", ex);
        }
    }

    @PutMapping
    public Boolean actualizar(@RequestBody ArticuloInventario articuloInventario) {
        System.out.println("ArticuloInventario entrante: " + articuloInventario.toString());
        try {
            return articuloInventarioServicio.actualizarArticuloInventario(articuloInventario);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el ArticuloInventario", ex);
        }
    }

    @GetMapping
    public ResponseEntity<RespuestaServicio> listar(@RequestParam Optional<String> busqueda,
            @RequestParam Optional<Long> idBodegaInventario,
            @RequestParam Optional<String> skip,
            @RequestParam Optional<String> take) {
        RespuestaServicio<ArticuloInventario> articulosInventarioRecuperados;
        try {
            String skipCast = "0";
            String takeCast = "10";

            if (skip.isPresent()) {
                skipCast = skip.get();
            }

            if (take.isPresent()) {
                takeCast = take.get();
            }
            articulosInventarioRecuperados = articuloInventarioServicio.articuloInventarioPorParametros(busqueda, idBodegaInventario, skipCast, takeCast);
            return ResponseEntity.status(HttpStatus.OK).body(articulosInventarioRecuperados);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

    @GetMapping("/reporteBodega")
    public ResponseEntity<List<ArticuloInventario>> reporteBodega(@RequestParam Long bodegaInvId,
            @RequestParam String fechaInicio,
            @RequestParam String fechaFin) {

        List<ArticuloInventario> listArticuloInventarios;
        try {
            Date fechaIniCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaInicio);
            Date fechaFinCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaFin);

            listArticuloInventarios = articuloInventarioServicio.articuloInventarioPorBodega(bodegaInvId, fechaIniCast, fechaFinCast);
            return ResponseEntity.status(HttpStatus.OK).body(listArticuloInventarios);

        } catch (Exception ex) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

    @GetMapping("/reporteArticuloInv")
    public ResponseEntity<List<ArticuloInventario>> reporteArticuloInv(@RequestParam Long bodegaInvId,
            @RequestParam Long articuloInvId,
            @RequestParam String fechaInicio,
            @RequestParam String fechaFin) {

        List<ArticuloInventario> listArticuloInventarios;
        try {
            Date fechaIniCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaInicio);
            Date fechaFinCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaFin);

            listArticuloInventarios = articuloInventarioServicio.articuloInventarioPorArticuloInv(bodegaInvId, articuloInvId, fechaIniCast, fechaFinCast);
            return ResponseEntity.status(HttpStatus.OK).body(listArticuloInventarios);

        } catch (Exception ex) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

}
