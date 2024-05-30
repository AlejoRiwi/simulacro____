package com.riwi.simulacro_filtro_SpringBoot.infrastructure.services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.UserRequest;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.UserResponse;
import com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services.IUserService;

public class UserService implements IUserService {
    @Override
    public UserResponse getById(Long id) {
        return null;
    }

    @Override
    public UserResponse create(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserResponse update(UserRequest userRequest, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
