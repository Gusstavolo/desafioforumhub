package com.guoliveira.demo.topico;

import com.guoliveira.demo.curso.Curso;
import com.guoliveira.demo.usuario.Usuario;

import java.time.LocalDateTime;

public record DTOCriaTopico(Long id,
                            String titulo,
                            String mensagem,
                            LocalDateTime data,
                            boolean status,
                            Curso curso,
                            Usuario usuario) {
}
