/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Kardex;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KardexDAO extends PagingAndSortingRepository<Kardex, Long>{
    
    @Query("SELECT kx FROM Kardex kx where kx.articuloInventario.id =:articulo and kx.fechaCreacion between :fechaInicio and :fechaFin")
    List<Kardex> buscarKardexPorParametros(
            @Param("articulo") Optional<String> articulo,
            @Param("fechaInicio") Optional<String> fechaInicio,
            @Param("fechaFin") Optional<String> fechaFin);
    
}
