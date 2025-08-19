package com.autohorario.repository;

import com.autohorario.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Optional<Professor> findByEmail(String email);
    List<Professor> findByDisciplinasContaining(String disciplina);
    boolean existsByEmail(String email);
}
