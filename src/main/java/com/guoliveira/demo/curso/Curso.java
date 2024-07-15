package com.guoliveira.demo.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Getter
        private Long id;

        @Column
        private String nome;

        @Column
        private String categoria;

        public Curso(DTOCriaCurso dTOcriaCurso) {
            this.id = dTOcriaCurso.id();
            this.nome = dTOcriaCurso.nome();
            this.categoria = dTOcriaCurso.categoria();
        }

        public void atualizaCurso(DTOAtualizaCurso atualizaCurso) {
            this.id = atualizaCurso.id();
            this.nome = atualizaCurso.nome();
            this.categoria = atualizaCurso.categoria();
        }



}

