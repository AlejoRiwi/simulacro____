package com.riwi.simulacro_filtro_SpringBoot.domain.repositories;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Submissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionsRepository extends JpaRepository<Submissions,Long> {
}
