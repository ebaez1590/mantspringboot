/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netb.mantenimiento.mantspringboot.rest;

import java.util.List;
import netb.mantenimiento.mantspringboot.dao.UsuarioDAO;
import netb.mantenimiento.mantspringboot.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioRest {
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    @PostMapping("/guardar")
    public void guardar(@RequestBody Usuario usuario){
        System.out.println("Usuario entrante: " + usuario.toString());
        usuarioDAO.save(usuario);
    }
    
    @GetMapping("/listar")
    public List<Usuario> listar(){
        return usuarioDAO.findAll();
    }
    
}
