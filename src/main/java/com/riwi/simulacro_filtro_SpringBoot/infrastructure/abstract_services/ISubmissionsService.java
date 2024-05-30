package com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.SubmissionsRequest;
import com.riwi.simulacro_filtro_SpringBoot.domain.repositories.SubmissionsRepository;

/**
 * ISubmissionsService
 */
public interface ISubmissionsService extends CrudService<SubmissionsRequest,SubmissionsRepository, Long>{
}