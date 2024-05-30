package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long user_id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
}
