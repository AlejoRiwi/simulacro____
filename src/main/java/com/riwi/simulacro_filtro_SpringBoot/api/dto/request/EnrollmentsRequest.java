package com.riwi.simulacro_filtro_SpringBoot.api.dto.request;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Courses;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Users;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentsRequest {
    @NotBlank(message = "Este campo es requerido")
    private Date enrollment_date;

    @NotBlank(message = "Este campo es requerido")
    private Users users;

    @NotBlank(message = "Este campo es requerido")
    private Courses courses;
}
