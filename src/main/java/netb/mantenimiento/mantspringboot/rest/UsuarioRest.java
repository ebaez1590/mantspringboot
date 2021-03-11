/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.util.List;
import java.util.Optional;
import netb.mantenimiento.mantspringboot.model.Usuario;
import netb.mantenimiento.mantspringboot.servicios.UsuarioServicio;
import netb.mantenimiento.mantspringboot.utils.RespuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("usuarios")
public class UsuarioRest {

    @Autowired
    private UsuarioServicio usuarioServicio;

    /*@Autowired
    private UsuarioDAO usuarioDAO;*/

    @PostMapping
    @CrossOrigin
    public Boolean guardar(@RequestBody Usuario usuario) {
        System.out.println("Usuario entrante: " + usuario.toString());
        try {
            return usuarioServicio.guardarUsuario(usuario);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Datos de usuario incorrectos", ex);
        }
    }

    @PutMapping
    public Boolean actualizar(@RequestBody Usuario usuario) {
        System.out.println("Usuario entrante: " + usuario.toString());
        try {
            return usuarioServicio.actualizarUsuario(usuario);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario no pudo Actualizarse", ex);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public Boolean eliminar(@PathVariable("id") Long id) {
        System.out.println("Usuario a Eliminar: " + id);
        try {
            return usuarioServicio.eliminarUsuarioPorId(id);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario no pudo Eliminarse", ex);
        }
    }

    /*@GetMapping("/{cedulaUsuario}")
    public Usuario recuperarPorCedula(@PathVariable String cedulaUsuario) {
        try {
            return usuarioServicio.buscarPorCedulaUsuario(cedulaUsuario);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No se ha encontrado usuario", ex);
        }
    }*/

    @GetMapping("/listar")
    public ResponseEntity<RespuestaServicio> listar(
            @RequestParam Optional<String> busqueda,
            @RequestParam Optional<String> skip,
            @RequestParam Optional<String> take) {
        RespuestaServicio<Usuario> usuariosRecuperados;
        try {
            String skipCast = "0";
            String takeCast = "10";

            if (skip.isPresent()) {
                skipCast = skip.get();
            }

            if (take.isPresent()) {
                takeCast = take.get();
            }

            usuariosRecuperados = usuarioServicio.listarPorParametros(busqueda, skipCast, takeCast);
            return ResponseEntity.status(HttpStatus.OK).body(usuariosRecuperados);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No existen Registros", ex);
        }

    }

    @GetMapping("/login")
    public ResponseEntity<Usuario> loginUsuario(
            @RequestParam String usuario,
            @RequestParam String password) {
        try {
            Usuario usuarioLogin = usuarioServicio.loginUsuario(usuario, password);
            return ResponseEntity.status(HttpStatus.OK).body(usuarioLogin);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario incorrecto", ex);
        }
    }

    /*@GetMapping("/hab/{habilitado}")
    public ResponseEntity<List<Usuario>> recuperarHabilitados(@PathVariable Boolean habilitado) {
        List<Usuario> usuariosRecuperados = usuarioDAO.usuariosHabilitados(habilitado);
        if (null != usuariosRecuperados && usuariosRecuperados.size() > 0) {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosRecuperados);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/gProd/{gProducto}")
    public ResponseEntity<List<Usuario>> recuperarGestionaProductos(@PathVariable Boolean gProducto) {
        List<Usuario> usuariosRecuperados = usuarioDAO.usuariosGestionaProductos(gProducto);
        if (null != usuariosRecuperados && usuariosRecuperados.size() > 0) {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosRecuperados);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/gBod/{gBodega}")
    public ResponseEntity<List<Usuario>> recuperarGestionaBodegas(@PathVariable Boolean gBodega) {
        List<Usuario> usuariosRecuperados = usuarioDAO.usuariosGestionaBodegas(gBodega);
        if (null != usuariosRecuperados && usuariosRecuperados.size() > 0) {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosRecuperados);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/gDep/{gDepartamento}")
    public ResponseEntity<List<Usuario>> recuperarGestionaDepartamentos(@PathVariable Boolean gDepartamento) {
        List<Usuario> usuariosRecuperados = usuarioDAO.usuariosGestionaDepartamentos(gDepartamento);
        if (null != usuariosRecuperados && usuariosRecuperados.size() > 0) {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosRecuperados);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/gInv/{gInventario}")
    public ResponseEntity<List<Usuario>> recuperarGestionaInventarios(@PathVariable Boolean gInventario) {
        List<Usuario> usuariosRecuperados = usuarioDAO.usuariosGestionaInventarios(gInventario);
        if (null != usuariosRecuperados && usuariosRecuperados.size() > 0) {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosRecuperados);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/gMant/{daMant}")
    public ResponseEntity<List<Usuario>> recuperarDaMatenimientos(@PathVariable Boolean daMant) {
        List<Usuario> usuariosRecuperados = usuarioDAO.usuariosDaMantenimiento(daMant);
        if (null != usuariosRecuperados && usuariosRecuperados.size() > 0) {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosRecuperados);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }*/
}
