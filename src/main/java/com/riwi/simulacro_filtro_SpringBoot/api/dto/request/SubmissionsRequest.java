package com.riwi.simulacro_filtro_SpringBoot.api.dto.request;

import java.math.BigDecimal;
import java.util.Date;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Assignments;
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
public class SubmissionsRequest {
    @NotBlank(message = "Este campo es requerido")
    private String content;

    @NotBlank(message = "Este campo es requerido")
    private Date submission_date;

    @NotBlank(message = "Este campo es requerido")
    private BigDecimal grade;

    @NotBlank(message = "Este campo es requerido")
    private Users users;

    @NotBlank(message = "Este campo es requerido")
    private Assignments assignments;
}
