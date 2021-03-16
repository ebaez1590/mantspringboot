/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import netb.mantenimiento.mantspringboot.model.Kardex;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KardexDAO extends PagingAndSortingRepository<Kardex, Long>{
    
    @Query("SELECT kx FROM Kardex kx where kx.fechaCreacion between :fechaInicio and :fechaFin and "
            + "(:busqueda is null or kx.articuloInventario.id = :busqueda)")
    List<Kardex> buscarKardexPorParametros(
            @Param("fechaInicio") Date fechaInicio,
            @Param("fechaFin") Date fechaFin,
            @Param("busqueda") Optional<Long> busqueda
            );
    
}
