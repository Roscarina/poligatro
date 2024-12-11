package com.poligatro.poligatro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poligatro.poligatro.models.Usuario;
import com.poligatro.poligatro.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class UsuarioController {

    @Autowired
    public UsuarioRepository usuarioRepository;

   @GetMapping("hola")
   public String getMethodName() {
       return "hola";
   }
   
   
    @GetMapping("/usuarios")
    public List<Usuario> getuser(){
        return usuarioRepository.findAll();
    }

}
