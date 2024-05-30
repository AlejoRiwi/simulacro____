package com.riwi.simulacro_filtro_SpringBoot.api.dto.request;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Courses;

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
public class LessonsRequest {
    @NotBlank(message = "Este campo es requerido")
    @Size(max = 100, message = "En este campo solo se pueden hasta 100 caracteres")
    private String lesson_title;

    @NotBlank(message = "Este campo es requerido")
    private String content;

    @NotBlank(message = "Este campo es requerido")
    private Courses courses;
}
