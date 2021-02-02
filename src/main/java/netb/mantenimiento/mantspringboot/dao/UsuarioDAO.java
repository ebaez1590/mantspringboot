/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.dao;

import java.util.List;
import netb.mantenimiento.mantspringboot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>{
    
    @Query("SELECT us FROM Usuario us where us.nombre = :nombreUsuario")
    List<Usuario> buscarPorNombreUsuario (@Param("nombreUsuario")String nombreUsuario);
        
    
    
}
