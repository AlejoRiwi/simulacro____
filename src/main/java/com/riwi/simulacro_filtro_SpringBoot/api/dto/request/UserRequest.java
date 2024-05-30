package com.riwi.simulacro_filtro_SpringBoot.api.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "El nombre es requerido")
    @Size(max = 50, message = "El nombre debe de ser de maximo 50 caracteres")
    private String userName;

    @NotBlank(message = "La contraseña es requerido")
    @Size(max = 255, message = "La contraseña debe de ser de maximo 255 caracteres")
    private String password;

    @NotBlank(message = "El Email es requerido")
    @Size(max = 100, message = "El email es de maximo 100 caracteres")
    private String email;

    @NotBlank(message = "El nombre Completo es requerido")
    @Size(max = 100, message = "El nombre completo debe de ser de maximo 100 caracteres")
    private String fullName;

}
