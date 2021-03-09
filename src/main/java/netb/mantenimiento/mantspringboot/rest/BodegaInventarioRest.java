/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.BodegaInventario;
import netb.mantenimiento.mantspringboot.servicios.BodegaInventarioServicio;
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
@RequestMapping("bodega-inventario")
public class BodegaInventarioRest {

    @Autowired
    private BodegaInventarioServicio bodegaInventarioServicio;

    @PostMapping
    public Boolean guardar(@RequestBody BodegaInventario bodegaInventario) {
        System.out.println("BodegaInventario entrante: " + bodegaInventario.toString());
        try {
            return bodegaInventarioServicio.guardarBodegaInventario(bodegaInventario);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar la bodegaInventario", ex);
        }
    }

    @PutMapping
    public Boolean actualizar(@RequestBody BodegaInventario bodegaInventario) {
        System.out.println("BodegaInventario entrante: " + bodegaInventario.toString());
        try {
            return bodegaInventarioServicio.actualizarBodegaInventario(bodegaInventario);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar la bodegaInventario", ex);
        }
    }


    @GetMapping
    public ResponseEntity<RespuestaServicio> listar(@RequestParam Optional<String> busqueda,
            @RequestParam Optional<String> skip,
            @RequestParam Optional<String> take) {
        RespuestaServicio<BodegaInventario> bodegasInventarioRecuperados;
        try {
            String skipCast = "0";
            String takeCast = "10";

            if (skip.isPresent()) {
                skipCast = skip.get();
            }

            if (take.isPresent()) {
                takeCast = take.get();
            }
            bodegasInventarioRecuperados = bodegaInventarioServicio.bodegaInventarioPorParametros(busqueda, skipCast, takeCast);
            return ResponseEntity.status(HttpStatus.OK).body(bodegasInventarioRecuperados);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

}
