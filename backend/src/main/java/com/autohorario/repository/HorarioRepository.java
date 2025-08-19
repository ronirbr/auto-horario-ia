package com.autohorario.repository;

import com.autohorario.model.Horario;
import com.autohorario.model.Professor;
import com.autohorario.model.Sala;
import com.autohorario.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {
    List<Horario> findByProfessor(Professor professor);
    List<Horario> findByTurma(Turma turma);
    List<Horario> findBySala(Sala sala);
    List<Horario> findByDiaSemana(DayOfWeek diaSemana);

    @Query("SELECT h FROM Horario h WHERE h.professor.id = ?1 AND h.diaSemana = ?2")
    List<Horario> findByProfessorIdAndDiaSemana(Long professorId, DayOfWeek diaSemana);

    @Query("SELECT h FROM Horario h WHERE h.turma.id = ?1 AND h.diaSemana = ?2")
    List<Horario> findByTurmaIdAndDiaSemana(Long turmaId, DayOfWeek diaSemana);
}
