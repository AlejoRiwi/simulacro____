package com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.AssignmentsRequest;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.AssignmentsResponse;

public interface IAssignmentsService extends CrudService<AssignmentsRequest,AssignmentsResponse, Long>{
    
}
