/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.servicios;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.dao.UsuarioDAO;
import netb.mantenimiento.mantspringboot.model.Usuario;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public Boolean guardarUsuario(Usuario usuario) throws Exception {
        usuarioDAO.save(usuario);
        return true;
    }

    @Override
    public Boolean actualizarUsuario(Usuario usuario) throws Exception {
        usuarioDAO.save(usuario);
        return true;
    }

    @Override
    public Boolean eliminarUsuarioPorId(Long id) throws Exception {
        usuarioDAO.deleteById(id);
        return true;
    }

    @Override
    public Usuario buscarPorCedulaUsuario(String cedula) throws Exception {
        Usuario usuarioRecuperado = usuarioDAO.buscarPorCedulaUsuario(cedula);

        if (null != usuarioRecuperado) {
            return usuarioRecuperado;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario no Existe");
        }
    }

    @Override
    public List<Usuario> listarTodos() throws Exception {
        List<Usuario> listUsuarios = (List<Usuario>) usuarioDAO.findAll();
        if (null != listUsuarios && listUsuarios.size() > 0) {
            return listUsuarios;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No Existen Usuarios");
        }

    }

    @Override
    public RespuestaServicio<Usuario> listarPorParametros(Optional<String> busqueda, String skip, String take) throws Exception {
        Pageable sortedById = PageRequest.of(Integer.parseInt(skip), Integer.parseInt(take), Sort.by("id").descending());
        RespuestaServicio<Usuario> respuestaServicio = new RespuestaServicio<Usuario>();
        List<Usuario> listUsuarios = null;
        
        if(busqueda.isPresent()){
            listUsuarios = usuarioDAO.usuariosPorParametros(busqueda, sortedById);
            respuestaServicio.setListaObjetos(listUsuarios);
            respuestaServicio.setCantidadRegistros(usuarioDAO.count());
            return respuestaServicio;
        }else return null;

    }

    @Override
    public Usuario loginUsuario(String usuario, String password) throws Exception {
        Usuario usuarioResponse = usuarioDAO.loginUsuario(usuario, password);
        if (null != usuarioResponse){
            return usuarioResponse;
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No Existen Usuarios");
        }
    }

}
