package br.com.alura.forum_hub_alura.repository;

import br.com.alura.forum_hub_alura.entity.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
