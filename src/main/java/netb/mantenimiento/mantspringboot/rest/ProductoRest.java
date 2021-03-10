/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Producto;
import netb.mantenimiento.mantspringboot.servicios.ProductoServicio;
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
@RequestMapping("productos")
public class ProductoRest {

    @Autowired
    private ProductoServicio productoServicio;

    @PostMapping
    public Boolean guardar(@RequestBody Producto producto) {
        System.out.println("Producto entrante: " + producto.toString());
        try {
            return productoServicio.guardarProducto(producto);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el producto", ex);
        }
    }

    @PutMapping
    public Boolean actualizar(@RequestBody Producto producto) {
        System.out.println("Producto entrante: " + producto.toString());
        try {
            return productoServicio.actualizarProducto(producto);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible actualizar el producto", ex);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public Boolean eliminar(@PathVariable("id") Long id) {
        System.out.println("Producto a eliminar: " + id);
        try {
            return productoServicio.eliminarProductoPorId(id);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible eliminar el producto", ex);
        }
    }

    @GetMapping
    public ResponseEntity<RespuestaServicio> listar(@RequestParam Optional<String> busqueda,
            @RequestParam Optional<String> skip,
            @RequestParam Optional<String> take) {
        RespuestaServicio<Producto> productosRecuperados;
        try {
            String skipCast = "0";
            String takeCast = "10";

            if (skip.isPresent()) {
                skipCast = skip.get();
            }

            if (take.isPresent()) {
                takeCast = take.get();
            }
            productosRecuperados = productoServicio.productoPorParametros(busqueda, skipCast, takeCast);
            return ResponseEntity.status(HttpStatus.OK).body(productosRecuperados);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

}
