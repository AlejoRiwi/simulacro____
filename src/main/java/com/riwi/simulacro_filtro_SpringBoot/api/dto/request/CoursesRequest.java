package com.riwi.simulacro_filtro_SpringBoot.api.dto.request;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Users;
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
public class CoursesRequest {
    @NotBlank(message = "Este campo es requerido")
    @Size(max = 100, message = "Este campo unicamente puede contener 100 caracteres")
    private String course_name;

    @NotBlank(message = "Este campo es requerido")
    private String description;

    @NotBlank(message = "Este campo es requerido")
    private Users instructor;
}
