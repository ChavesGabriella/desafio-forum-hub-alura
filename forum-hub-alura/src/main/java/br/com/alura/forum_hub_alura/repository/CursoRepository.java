package br.com.alura.forum_hub_alura.repository;

import br.com.alura.forum_hub_alura.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
