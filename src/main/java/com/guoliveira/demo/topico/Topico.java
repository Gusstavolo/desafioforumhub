package com.guoliveira.demo.topico;

import com.guoliveira.demo.curso.Curso;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensagem;

    private LocalDateTime data;

    private boolean status;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Topico(DTOCriaTopico dTOCriaTopico) {
        this.id = dTOCriaTopico.id();
        this.titulo = dTOCriaTopico.titulo();
        this.mensagem = dTOCriaTopico.mensagem();
        this.data = dTOCriaTopico.data();
        this.status = dTOCriaTopico.status();
        this.curso = dTOCriaTopico.curso();
        this.usuario = dTOCriaTopico.usuario();
    }
    public void atualizaTopico(DTOAtualizaTopico atualizaTopico) {
        if (DTOAtualizaTopico.titulo() != null){
            this.titulo = atualizaTopico.titulo();
        }
        if (DTOAtualizaTopico.mensagem() != null){
            this.mensagem = atualizaTopico.mensagem();
        }
        if (DTOAtualizaTopico.curso() != null){
            this.curso = atualizaTopico.curso();
        }
    }
}
