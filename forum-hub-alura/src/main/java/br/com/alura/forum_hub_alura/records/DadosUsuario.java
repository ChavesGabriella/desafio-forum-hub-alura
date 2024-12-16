package br.com.alura.forum_hub_alura.records;

import java.util.List;

public record DadosUsuario(String nome, String email, String senha, List<PerfilRecord> perfils) {
}
