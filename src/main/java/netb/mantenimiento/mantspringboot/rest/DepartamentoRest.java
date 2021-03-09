/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import netb.mantenimiento.mantspringboot.servicios.DepartamentoServicio;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("departamentos")
public class DepartamentoRest {

    
    @Autowired
    private DepartamentoServicio departamentoServicio;

    @PostMapping
    public Boolean guardar(@RequestBody Departamento departamento) {
        try {
            System.out.println("Departamento entrante: " + departamento.toString());
            return departamentoServicio.guardarDepartamento(departamento);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el departamento", ex);
        }
    }

    @PutMapping
    public Boolean actualizar(@RequestBody Departamento departamento) {
        try {
            System.out.println("Departamento entrante: " + departamento.toString());
            return departamentoServicio.actualizarDepartamento(departamento);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible actualizar el departamento", ex);
        }
    }

    @DeleteMapping
    public Boolean eliminar(@PathVariable("id") Long id) {
        try {
            return departamentoServicio.eliminarDepartamentoPorId(id);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible eliminar el departamento", ex);
        }
    }

    @GetMapping
    public ResponseEntity<RespuestaServicio> listar(@RequestParam Optional<String> busqueda,
            @RequestParam Optional<String> skip,
            @RequestParam Optional<String> take) {
        RespuestaServicio<Departamento> departamentosRecuperados;
        try {
            String skipCast = "0";
            String takeCast = "10";

            if (skip.isPresent()) {
                skipCast = skip.get();
            }

            if (take.isPresent()) {
                takeCast = take.get();
            }
            departamentosRecuperados = departamentoServicio.departamentoPorParametros(busqueda, skipCast, takeCast);
            return ResponseEntity.status(HttpStatus.OK).body(departamentosRecuperados);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

}

