/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Producto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductoDAO extends PagingAndSortingRepository<Producto, Long>{
    
    @Query("SELECT pr FROM Producto pr where pr.nombre LIKE %:busqueda%")
    List<Producto> productoPorParametros(@Param("busqueda") Optional<String> busqueda, Pageable page);
    
}
