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
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloInventarioDAO extends PagingAndSortingRepository<ArticuloInventario, Long>{
    
    @Query("SELECT ar FROM ArticuloInventario ar where "
            + "(:idBodegaInventario is null or ar.bodegaInventario.id = :idBodegaInventario) and "
            + "(:busqueda is null or ar.nombre LIKE %:busqueda%)")
    List<ArticuloInventario> articuloInventarioPorParametro(@Param("busqueda") Optional<String> busqueda, @Param("idBodegaInventario") Optional<Long> idBodegaInventario, Pageable page);
    
    //Reporte de todos los articulos inventario por id de bodega inventraio y rango de fechas obligatorios
    //localhost:8080/articulo-inventario/reporteBodega?bodegaInvId?fechaInicio?fechaFin
    
    @Query("SELECT ar FROM ArticuloInventario ar where ar.bodegaInventario.id = :bodegaInvId and "
            + "ar.fechaCreacion between :fechaInicio and :fechaFin")
    List<ArticuloInventario> articuloInventarioPorBodega(@Param("bodegaInvId") Long bodegaInvId, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);
    //reporte por id de articulo inventario, bodega inventario y por rango de fechas todos obligatorios
    //localhost:8080/articulo-inventario/reporteArticuloInv?bodegaInvId?articuloInvId?fechaInicio?fechaFin
    
    @Query("SELECT ar FROM ArticuloInventario ar where ar.bodegaInventario.id = :bodegaInvId and "
            + "ar.id = :articuloInvId and "
            + "ar.fechaCreacion between :fechaInicio and :fechaFin")
    List<ArticuloInventario> articuloInventarioPorArticuloInv(@Param("bodegaInvId") Long bodegaInvId, @Param("articuloInvId") Long articuloInvId, @Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);
    
}
