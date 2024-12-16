package br.com.alura.forum_hub_alura.repository;

import br.com.alura.forum_hub_alura.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long> {
}
