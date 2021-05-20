package com.example.demo.dto;

import com.example.demo.model.Usuario;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)  //@AllArgsContructor: Cria um construtor privado com todos os atributos.
@Getter
public class UsuarioRespostaDTO {
    private Long id;
    private String nome;
    private String email;
    private boolean admin;

    public static UsuarioRespostaDTO transformaEmDTO(Usuario usuario) {
        return new UsuarioRespostaDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
    }
}
