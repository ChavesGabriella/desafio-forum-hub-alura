package br.com.alura.forum_hub_alura.records;

public record TopicoRecord(String titulo,String mensagem,String dataCriacao,boolean status,AutorRecord autor,CursoRecord curso) {
}
