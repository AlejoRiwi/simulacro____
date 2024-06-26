package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Courses;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Enrollments;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Messages;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Submissions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private List<SubmissionsBasicResponse> submissions;
    private List<Courses> courses;
    private List<Enrollments> enrollments;
    private List<Messages> messages;
}
