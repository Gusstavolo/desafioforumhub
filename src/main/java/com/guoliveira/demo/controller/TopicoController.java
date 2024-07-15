package com.guoliveira.demo.controller;

import com.guoliveira.demo.topico.DTOCriaTopico;
import com.guoliveira.demo.topico.Topico;
import com.guoliveira.demo.topico.TopicoRepository;
import com.guoliveira.demo.topico.TopicoRequest;
import jakarta.validation.constraints.NotNull;
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



    private Topico topico;
    @Autowired
    private TopicoRepository topicoRepository;



    @PostMapping
    public ResponseEntity<String> CadastrarTopico(@RequestBody @Validated DTOCriaTopico dTOCriaTopico){
        if (topicoRepository.existsByTituloAndMensagem(dTOCriaTopico.titulo(), dTOCriaTopico.mensagem())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Tópico duplicado.");
        }else {
            topicoRepository.save(new Topico(dTOCriaTopico));
        }


    }

}
