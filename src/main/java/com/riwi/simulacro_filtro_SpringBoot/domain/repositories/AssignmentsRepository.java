package com.riwi.simulacro_filtro_SpringBoot.domain.repositories;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentsRepository extends JpaRepository<Assignments,Long> {
}
