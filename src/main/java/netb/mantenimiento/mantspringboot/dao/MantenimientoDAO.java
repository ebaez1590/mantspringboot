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
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenimientoDAO extends PagingAndSortingRepository<Mantenimiento, Long>{
    
    @Query("SELECT mt FROM Mantenimiento mt where mt.fechaIngreso between :fechaInicio and :fechaFin and "
            + "(:articulo is null or mt.articuloInventario.id = :articulo) and "
            + "(:estado is null or mt.estado = :estado) and "
            + "(:cedulaTecnico is null or mt.cedulaTecnico = :cedulaTecnico) ")
    List<Mantenimiento> reportesMantenimiento (
            @Param("fechaInicio") Date fechaInicio,
            @Param("fechaFin") Date fechaFin,
            @Param("articulo") Optional<Long> articulo,
            @Param("estado") Optional<String> estado,
            @Param("cedulaTecnico") Optional<String> cedulaTecnico);
    
}
