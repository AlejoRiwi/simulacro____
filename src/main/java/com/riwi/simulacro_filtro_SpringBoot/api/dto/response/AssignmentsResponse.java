package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import java.util.Date;
import java.util.List;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Lessons;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Submissions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentsResponse {
    private Long assignment_id;
    private String assignment_title;
    private String description;
    private Date due_date;
    private List<Submissions> submissions;
    private Lessons lessons;
}
