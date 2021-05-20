package com.example.demo.dto;

import com.example.demo.model.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDto {

    private String nome;
    private String email;
    private String senha;

    public Usuario transformaParaObjeto(){
        return new Usuario(nome, email, senha);
    }
}
