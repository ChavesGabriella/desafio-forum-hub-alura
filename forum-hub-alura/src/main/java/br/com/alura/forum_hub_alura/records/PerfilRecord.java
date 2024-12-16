package br.com.alura.forum_hub_alura.records;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotBlank;

public record PerfilRecord(@Nonnull @NotBlank String nome, int nivel) {
}