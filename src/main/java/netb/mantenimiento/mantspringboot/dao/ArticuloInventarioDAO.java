/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.ArticuloInventario;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloInventarioDAO extends PagingAndSortingRepository<ArticuloInventario, Long>{
    
    @Query("SELECT bi FROM BodegaInventario bi where bi.nombre LIKE %:busqueda%")
    List<ArticuloInventario> articuloInventarioPorParametro(@Param("busqueda") Optional<String> busqueda, Pageable page);
    
}