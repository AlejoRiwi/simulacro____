package com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.UserRequest;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.UserResponse;

public interface IUserService extends CrudService<UserRequest, UserResponse, Long>{

}
