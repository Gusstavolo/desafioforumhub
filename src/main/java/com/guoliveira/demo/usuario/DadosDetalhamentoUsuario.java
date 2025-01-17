package com.guoliveira.demo.usuario;

public record DadosDetalhamentoUsuario(String nome, String email) {
    public DadosDetalhamentoUsuario(Usuario atualizaUsuario) {
        this(atualizaUsuario.getNome(), atualizaUsuario.getEmail());
    }
}
