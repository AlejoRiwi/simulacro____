package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Enrollments;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Lessons;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Messages;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoursesResponse {
    private Long course_id;
    private String course_name;
    private String description;
    private List<Lessons> lessons;
    private Users instructor;
    private List<Enrollments> enrollments;
    private List<Messages> message;
}
