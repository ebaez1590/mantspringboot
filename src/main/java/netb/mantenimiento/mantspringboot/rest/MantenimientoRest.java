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
    public ResponseEntity<RespuestaServicio> listar(
            @RequestParam Long articuloInvId,
            @RequestParam Optional<String> estado,
            @RequestParam Optional<String> busqueda,
            @RequestParam Optional<String> skip,
            @RequestParam Optional<String> take) {
        RespuestaServicio<Mantenimiento> mantenimientosRecuperados;
        try {
            String skipCast = "0";
            String takeCast = "10";

            if (skip.isPresent()) {
                skipCast = skip.get();
            }

            if (take.isPresent()) {
                takeCast = take.get();
            }
            
            mantenimientosRecuperados = mantenimientoServicio.mantenimientoPorParametros(articuloInvId, estado, busqueda, skipCast, takeCast);
            return ResponseEntity.status(HttpStatus.OK).body(mantenimientosRecuperados);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }
    
    @GetMapping("/reporteEstado")
    public ResponseEntity<List<Mantenimiento>> reporteEstado(
            @RequestParam Optional<String> estado,
            @RequestParam String fechaInicio, 
            @RequestParam String fechaFin) {
        List<Mantenimiento> reporteMantenimientos;
        try {
            Date fechaIniCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaInicio);
            Date fechaFinCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaFin);
            
            reporteMantenimientos = mantenimientoServicio.reporteEstado(estado, fechaIniCast, fechaFinCast);
            System.out.println("Reporte: " + reporteMantenimientos.get(0).getArticuloInventario().getNombre());
            return ResponseEntity.status(HttpStatus.OK).body(reporteMantenimientos);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }
 
    }
    
    @GetMapping("/reporteCedula")
    public ResponseEntity<List<Mantenimiento>> reporteCedula(
            @RequestParam String cedulaTecnico, 
            @RequestParam String fechaInicio, 
            @RequestParam String fechaFin) {
        List<Mantenimiento> reporteMantenimientos;
        try {
            Date fechaIniCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaInicio);
            Date fechaFinCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaFin);
            
            reporteMantenimientos = mantenimientoServicio.reporteCedula(cedulaTecnico, fechaIniCast, fechaFinCast);
            System.out.println("Reporte Cedula: " + reporteMantenimientos.size());
            return ResponseEntity.status(HttpStatus.OK).body(reporteMantenimientos);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }
 
    }
    
    @GetMapping("/reporteArticuloInv")
    public ResponseEntity<List<Mantenimiento>> reporteArticuloInventario(
            @RequestParam Long articuloInvId, 
            @RequestParam String fechaInicio, 
            @RequestParam String fechaFin) {
        List<Mantenimiento> reporteMantenimientos;
        try {
            Date fechaIniCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaInicio);
            Date fechaFinCast = new SimpleDateFormat("dd-MM-yyyy").parse(fechaFin);
            
            reporteMantenimientos = mantenimientoServicio.reporteArticuloInventario(articuloInvId, fechaIniCast, fechaFinCast);
            System.out.println("Reporte: " + reporteMantenimientos.get(0).getArticuloInventario().getNombre());
            return ResponseEntity.status(HttpStatus.OK).body(reporteMantenimientos);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }
 
    }
}
