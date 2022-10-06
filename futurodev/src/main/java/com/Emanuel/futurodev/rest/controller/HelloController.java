package com.Emanuel.futurodev.rest.controller;

import com.Emanuel.futurodev.domain.service.UsuarioService;
import com.Emanuel.futurodev.rest.dto.UsuarioDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v2")

public class HelloController {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping("/hello")
    public String getMeuNome() {
        return "Hello  World";
    }


    @PostMapping("/usuario")
    public String salvarUsuario(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvar(usuarioDto);
        return "Usuário salvo com sucesso!";
    }

}

