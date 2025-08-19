package com.autohorario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HorarioDTO {
    private Long id;

    @NotNull(message = "ID do professor é obrigatório")
    private Long professorId;

    @NotNull(message = "ID da turma é obrigatório")
    private Long turmaId;

    @NotNull(message = "ID da sala é obrigatório")
    private Long salaId;

    @NotNull(message = "Dia da semana é obrigatório")
    private DayOfWeek diaSemana;

    @NotNull(message = "Hora de início é obrigatória")
    private LocalTime horaInicio;

    @NotNull(message = "Hora de fim é obrigatória")
    private LocalTime horaFim;
}
