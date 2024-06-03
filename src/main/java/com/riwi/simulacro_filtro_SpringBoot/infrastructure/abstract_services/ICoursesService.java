package com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.CoursesRequest;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.CoursesResponse;

public interface ICoursesService extends CrudService<CoursesRequest, CoursesResponse,Long>{
}
