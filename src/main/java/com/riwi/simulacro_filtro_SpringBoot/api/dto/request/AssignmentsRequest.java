package com.riwi.simulacro_filtro_SpringBoot.api.dto.request;

import java.util.Date;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Lessons;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentsRequest {
    @NotBlank(message = "Este campo es requerido")
    @Size(max = 100, message = "El tamaño maximo es de 100 caracteres")
    private String assignment_title;

    @NotBlank(message = "Este campo es requerido")
    private String description;

    @NotBlank(message = "Este campo es requerido")
    private Date due_date;

    @NotBlank(message = "Este campo es requerido")
    private Lessons lessons;
}
