package com.example.demo.controller;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.dto.UsuarioRespostaDTO;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
	UsuarioService usuarioService;

//	@PostMapping("/usuario")
//    public Usuario salvaUsuario(@RequestBody Usuario usuario){
//        return usuarioService.save(usuario);
//    }

//    public Usuario salvaUsuario(@RequestBody UsuarioDto usuarioDto){
//        return usuarioService.save(usuarioDto.transformaParaObjeto());
//    }

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioRespostaDTO> salvar(@RequestBody UsuarioDto usuarioDto) {
        Usuario usuario = usuarioService.save(usuarioDto.transformaParaObjeto());
        return new ResponseEntity<>(UsuarioRespostaDTO.transformaEmDTO(usuario), HttpStatus.CREATED);
    }
	
}
