package com.riwi.simulacro_filtro_SpringBoot.infrastructure.services;

import com.riwi.simulacro_filtro_SpringBoot.api.dto.request.UserRequest;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.UserBasicResponse;
import com.riwi.simulacro_filtro_SpringBoot.api.dto.response.UserResponse;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Users;
import com.riwi.simulacro_filtro_SpringBoot.domain.repositories.UsersRepository;
import com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
    @Autowired
    public final UsersRepository usersRepository;


    @Override
    public UserResponse getById(Long id) {
        return this.entityToResponse(this.find(id));
    }

    @Override
    public UserResponse create(UserRequest userRequest) {
        Users users = this.requestToEntity(userRequest);
        return this.entityToResponse(this.usersRepository.save(users));
    }

    @Override
    public UserResponse update(UserRequest userRequest, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }




    private Users find(Long id) {
        return this.usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con este id -> " + id));
    }


    private UserResponse entityToResponse(Users entity) {
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(entity, userResponse);
        return userResponse;
    }


    private Users requestToEntity (UserRequest userRequest) {
        Users users = new Users();
        BeanUtils.copyProperties(userRequest, users);
        return users;
    }
}
