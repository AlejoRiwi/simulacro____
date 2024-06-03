package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Courses;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentsResponse {
    private Long enrollment_id;
    private Date enrollment_date;
    private Users users;
    private Courses courses;
}
