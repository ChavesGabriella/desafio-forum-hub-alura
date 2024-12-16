package br.com.alura.forum_hub_alura.records;

import br.com.alura.forum_hub_alura.entity.Autor;
import br.com.alura.forum_hub_alura.entity.Curso;

import java.time.LocalDateTime;

public record DadosRetornoTopico(String título, String mensagem, LocalDateTime dataDeCriacao, boolean status, Autor autor,Curso curso) {
}
