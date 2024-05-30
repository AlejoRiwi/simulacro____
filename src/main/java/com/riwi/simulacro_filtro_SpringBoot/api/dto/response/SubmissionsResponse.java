package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import java.math.BigDecimal;
import java.util.Date;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Assignments;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionsResponse {
    private Long submission_id;
    private String content;
    private Date submission_date;
    private BigDecimal grade;
    private Users users;
    private Assignments assignments;
}
