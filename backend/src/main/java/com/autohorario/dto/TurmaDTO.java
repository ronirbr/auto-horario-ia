package com.autohorario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurmaDTO {
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Série é obrigatória")
    private String serie;

    @Positive(message = "Total de alunos deve ser um número positivo")
    private Integer totalAlunos;

    private Set<String> disciplinasObrigatorias = new HashSet<>();
}
