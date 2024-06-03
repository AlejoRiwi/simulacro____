package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import com.riwi.simulacro_filtro_SpringBoot.util.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicResponse {
    private Long user_id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private Role role;
}
