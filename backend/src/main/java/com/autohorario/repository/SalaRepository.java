package com.autohorario.repository;

import com.autohorario.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
    List<Sala> findByTipoSala(String tipoSala);
    List<Sala> findByCapacidadeGreaterThanEqual(Integer capacidade);
    List<Sala> findByNomeContaining(String nome);
}
