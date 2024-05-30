package com.riwi.simulacro_filtro_SpringBoot.domain.repositories;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
}
