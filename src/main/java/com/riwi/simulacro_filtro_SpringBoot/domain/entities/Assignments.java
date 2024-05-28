package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "assignments")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int assignment_id;
    @Column(length = 100, nullable = false)
    private String assignment_title;
    @Lob
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date due_date;
}
