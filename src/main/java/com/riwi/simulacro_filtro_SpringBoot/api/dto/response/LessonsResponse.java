package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import java.util.List;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Assignments;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Courses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonsResponse {
    private Long lesson_id;
    private String lesson_title;
    private String content;
    private List<Assignments> assignments;
    private Courses courses;
}
