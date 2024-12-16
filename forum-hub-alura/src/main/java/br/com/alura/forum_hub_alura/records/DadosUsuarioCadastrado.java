package br.com.alura.forum_hub_alura.records;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosUsuarioCadastrado(@NotNull Long id, @NotNull @NotBlank String nome, @NotNull @NotBlank @Email String email) {
}
