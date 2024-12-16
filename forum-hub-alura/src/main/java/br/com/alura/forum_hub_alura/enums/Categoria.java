package br.com.alura.forum_hub_alura.enums;

public enum Categoria {
    PROGRAMACAO("Programação"),
    BANCO_DE_DADOS("Banco de dados");

    private final String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }
}
