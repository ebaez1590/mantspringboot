/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Usuario;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends PagingAndSortingRepository<Usuario, Long> {

    @Query("SELECT us FROM Usuario us where us.cedula = :cedulaUsuario")
    Usuario buscarPorCedulaUsuario(@Param("cedulaUsuario") String cedulaUsuario);

    @Query("SELECT us FROM Usuario us where us.habilitado = :habilitado")
    List<Usuario> usuariosHabilitados(@Param("habilitado") Boolean habilitado);

    @Query("SELECT us FROM Usuario us where us.gestionaProductos = :gProducto")
    List<Usuario> usuariosGestionaProductos(@Param("gProducto") Boolean gProducto);

    @Query("SELECT us FROM Usuario us where us.gestionaBodegas = :gBodega")
    List<Usuario> usuariosGestionaBodegas(@Param("gBodega") Boolean gBodega);

    @Query("SELECT us FROM Usuario us where us.gestionaDepartamentos = :gDepartamento")
    List<Usuario> usuariosGestionaDepartamentos(@Param("gDepartamento") Boolean gDepartamento);

    @Query("SELECT us FROM Usuario us where us.gestionaInventario = :gInventario")
    List<Usuario> usuariosGestionaInventarios(@Param("gInventario") Boolean gInventario);

    @Query("SELECT us FROM Usuario us where us.daMantenimiento = :daMant")
    List<Usuario> usuariosDaMantenimiento(@Param("daMant") Boolean daMant);
    
    @Query("SELECT us FROM Usuario us where us.cedula LIKE %:busqueda%")
    List<Usuario> usuariosPorParametros(@Param("busqueda") Optional<String> busqueda, Pageable page);
    
    @Query("SELECT us FROM Usuario us where us.usuario = :usuario and us.password = :password")
    Usuario loginUsuario(@Param("usuario") String usuario, @Param("password") String password);
    

}
