package com.autohorario.repository;

import com.autohorario.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
    List<Turma> findBySerie(String serie);
    List<Turma> findByDisciplinasObrigatoriasContaining(String disciplina);
}
