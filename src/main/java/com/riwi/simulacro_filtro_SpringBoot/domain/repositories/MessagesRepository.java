package com.riwi.simulacro_filtro_SpringBoot.domain.repositories;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages,Long> {
}
