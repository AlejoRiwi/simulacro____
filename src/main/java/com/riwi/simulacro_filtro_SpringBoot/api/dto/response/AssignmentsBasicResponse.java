package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentsBasicResponse {
    private Long assignment_id;
    private String assignment_title;
    private String description;
    private Date due_date;
}
