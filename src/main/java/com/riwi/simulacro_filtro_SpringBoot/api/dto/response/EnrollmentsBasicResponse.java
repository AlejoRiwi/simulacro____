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
public class EnrollmentsBasicResponse {
    private Long enrollment_id;
    private Date enrollment_date;
}
