/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.BodegaInventario;
import netb.mantenimiento.mantspringboot.model.TipoBodega;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaInventarioDAO extends PagingAndSortingRepository<BodegaInventario, Long>{
    
    @Query("SELECT bi FROM BodegaInventario bi where bi.departamento.id = :idDepartamento  and bi.nombre LIKE %:busqueda%")
    List<BodegaInventario> bodegaInventarioPorParametro(@Param("busqueda") Optional<String> busqueda, @Param("idDepartamento")Long idDepartamento, Pageable page);
    
    @Query("SELECT bi.nombre, bi.descripcion, tb.esMantenimiento FROM BodegaInventario bi JOIN bi.tipoBodega tb where bi.id = :idBodegaInventario")
    Object bodegaInventarioPorId(@Param("idBodegaInventario") Long idBodegaInventario);
    
}
