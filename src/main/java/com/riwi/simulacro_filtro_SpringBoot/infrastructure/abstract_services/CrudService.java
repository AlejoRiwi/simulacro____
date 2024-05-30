package com.riwi.simulacro_filtro_SpringBoot.infrastructure.abstract_services;

public interface CrudService <REQUEST, RESPONSE, TYPE>{
    RESPONSE getById(TYPE id);
    RESPONSE create(REQUEST request);
    RESPONSE update (REQUEST request,TYPE id);
    void delete (TYPE id);
}
