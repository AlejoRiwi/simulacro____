package com.riwi.simulacro_filtro_SpringBoot.domain.repositories;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Enrollments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentsRepository extends JpaRepository<Enrollments, Long> {
}
