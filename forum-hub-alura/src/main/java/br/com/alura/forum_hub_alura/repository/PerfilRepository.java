package br.com.alura.forum_hub_alura.repository;

import br.com.alura.forum_hub_alura.entity.Perfil;
import br.com.alura.forum_hub_alura.records.PerfilRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface PerfilRepository extends JpaRepository<Perfil, Long> {

    Optional<Perfil> findByNomeEqualsIgnoreCase(String nome);
}
