package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionsBasicResponse {
    private Long submission_id;
    private String content;
    private Date submission_date;
    private BigDecimal grade;
}
