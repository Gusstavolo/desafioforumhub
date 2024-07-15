package com.guoliveira.demo.usuario;

public record DadosCriaUsuario(Long id, String nome,
                               String email, String senha,
                               boolean status) {
}
