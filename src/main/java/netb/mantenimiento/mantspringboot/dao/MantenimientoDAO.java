/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Mantenimiento;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenimientoDAO extends PagingAndSortingRepository<Mantenimiento, Long> {

    @Query("SELECT mt FROM Mantenimiento mt where mt.fechaIngreso between :fechaInicio and :fechaFin and "
            + "(:articulo is null or mt.articuloInventario.id = :articulo) and "
            + "(:estado is null or mt.estado = :estado) and "
            + "(:cedulaTecnico is null or mt.cedulaTecnico = :cedulaTecnico) ")
    List<Mantenimiento> reportesMantenimiento(
            @Param("fechaInicio") Date fechaInicio,
            @Param("fechaFin") Date fechaFin,
            @Param("articulo") Optional<Long> articulo,
            @Param("estado") Optional<String> estado,
            @Param("cedulaTecnico") Optional<String> cedulaTecnico);

    //Reporte por estado y las fechas obligatorias
    @Query("SELECT mt FROM Mantenimiento mt where mt.estado = :estado and "
            + "mt.fechaIngreso between :fechaInicio and :fechaFin")
    List<Mantenimiento> reporteEstado(@Param("estado") String estado, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);

    //Reporte por cedula_tecnico y las fechas obligatorias
    @Query("SELECT mt FROM Mantenimiento mt where mt.cedulaTecnico like %:cedulaTecnico% and "
            + "mt.fechaIngreso between :fechaInicio and :fechaFin")
    List<Mantenimiento> reporteCedula(@Param("cedulaTecnico") String cedulaTecnico, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);
    
    //Reporte por articulo inventario y fechas obligatorio
    @Query("SELECT mt FROM Mantenimiento mt where mt.articuloInventario.id = :articuloInvId and "
            + "mt.fechaIngreso between :fechaInicio and :fechaFin")
    List<Mantenimiento> reporteArticuloInventario(@Param("articuloInvId") Long articuloInvId, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);
    

    @Query("SELECT mt FROM Mantenimiento mt where mt.articuloInventario.id = :articuloInvId and "
            + "(:busqueda is null or mt.nombreTecnico like %:busqueda%)")
    List<Mantenimiento> mantenimientoPorParametros(@Param("articuloInvId") Long articuloInvId, @Param("busqueda") Optional<String> busqueda, Pageable page);

}
