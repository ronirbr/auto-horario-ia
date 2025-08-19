package com.autohorario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaDTO {
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @Positive(message = "Capacidade deve ser um número positivo")
    private Integer capacidade;

    private String tipoSala;
}
