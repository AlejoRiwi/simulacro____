package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "enrollment")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollment_id;

    @Column(nullable = false)
    private Date enrollment_date;

    // Relacionamiento con Users Muchos a uno Con user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_user_id",
            referencedColumnName = "user_id"
    )
    private Users users;

    // Relacionamiento con Users Muchos a uno Con Courses
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_course_id",
            referencedColumnName = "course_id"
    )
    private Courses courses;
}
