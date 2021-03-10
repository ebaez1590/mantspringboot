/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Usuario;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;


public interface UsuarioServicio {
    
    Boolean guardarUsuario(Usuario usuario) throws Exception;
    
    Boolean actualizarUsuario(Usuario usuario) throws Exception;
    
    Boolean eliminarUsuarioPorId(Long Id) throws Exception;
    
    Usuario buscarPorCedulaUsuario (String cedula) throws Exception;
    
    List<Usuario> listarTodos () throws Exception;
    
    RespuestaServicio<Usuario> listarPorParametros (Optional<String> busqueda, String skip, String take) throws Exception;
    
    Usuario loginUsuario (String usuario, String password) throws Exception;
}
