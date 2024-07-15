package com.guoliveira.demo.topico;

import com.guoliveira.demo.curso.Curso;

public record DTOAtualizaTopico(Long id,
                                String titulo,
                                String mensagem,
                                boolean status,
                                Curso curso) {
}
