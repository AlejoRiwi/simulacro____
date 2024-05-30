package com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.LessonsRequest;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.LessonsResponse;

public interface ILessonsService extends CrudService<LessonsRequest, LessonsResponse, Long>{

}
