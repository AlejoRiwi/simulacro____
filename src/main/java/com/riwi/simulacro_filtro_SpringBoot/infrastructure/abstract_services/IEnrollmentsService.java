package com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.EnrollmentsRequest;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.EnrollmentsResponse;

public interface IEnrollmentsService extends CrudService <EnrollmentsRequest, EnrollmentsResponse, Long>{
}
