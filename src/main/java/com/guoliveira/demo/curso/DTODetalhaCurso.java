package com.guoliveira.demo.curso;

public record DTODetalhaCurso(Long id, String nome, String categoria) {
    public DTODetalhaCurso(Curso atualizaCurso) {
        this(atualizaCurso.getId(),
                atualizaCurso.getNome(),
                atualizaCurso.getCategoria());
    }
}
