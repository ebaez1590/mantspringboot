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
import netb.mantenimiento.mantspringboot.model.Mantenimiento;
import netb.mantenimiento.mantspringboot.servicios.MantenimientoServicio;
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
@RequestMapping("mantenimiento")
public class MantenimientoRest {

    @Autowired
    private MantenimientoServicio mantenimientoServicio;

    @PostMapping
    public Boolean guardar(@RequestBody Mantenimiento mantenimiento) {
        System.out.println("Mantenimiento entrante: " + mantenimiento.toString());
        try {
            return mantenimientoServicio.guardarMantenimiento(mantenimiento);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible guardar el mantenimiento", ex);
        }
    }

    @PutMapping
    public Boolean actualizar(@RequestBody Mantenimiento mantenimiento) {
        System.out.println("Mantenimiento entrante: " + mantenimiento.toString());
        try {
            return mantenimientoServicio.actualizarMantenimiento(mantenimiento);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No fue posible actualizar el mantenimiento", ex);
        }
    }
    
    @GetMapping
    public ResponseEntity<List<Mantenimiento>> listar(
            @RequestParam String fechaInicio, 
            @RequestParam String fechaFin, 
            @RequestParam Optional<Long> articulo, 
            @RequestParam Optional<String> estado, 
            @RequestParam Optional<String> cedulaTecnico) {
        List<Mantenimiento> reporteMantenimientos;
        try {
            Date fechaIniCast = new SimpleDateFormat("yyyy-MM-dd").parse(fechaInicio);
            Date fechaFinCast = new SimpleDateFormat("yyyy-MM-dd").parse(fechaFin);
            
            reporteMantenimientos = mantenimientoServicio.reportesMantenimiento(fechaIniCast, fechaFinCast, articulo, estado, cedulaTecnico);
            System.out.println("Reporte: " + reporteMantenimientos.get(0).getArticuloInventario().getNombre());
            return ResponseEntity.status(HttpStatus.OK).body(reporteMantenimientos);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }
}
