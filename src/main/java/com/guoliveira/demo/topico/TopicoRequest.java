package com.guoliveira.demo.topico;

import jakarta.validation.constraints.NotBlank;

public record TopicoRequest(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String curso
) {
}
