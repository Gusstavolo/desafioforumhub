package com.guoliveira.demo.controller;

import com.guoliveira.demo.topico.Topico;
import com.guoliveira.demo.topico.TopicoRepository;
import com.guoliveira.demo.topico.TopicoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private Topico topico;

    @PostMapping
    public void CadastrarTopico(@RequestBody @Validated TopicoRequest topicoRequest){
        if (topicoRepository.existsByTituloAndMensagem(topicoRequest.titulo(), topicoRequest.mensagem())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Tópico duplicado.");
        }
    }

}
