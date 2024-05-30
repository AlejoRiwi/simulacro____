package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "courses")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;

    @Column(length = 100, nullable = false)
    private String course_name;

    @Lob
    @Column(nullable = false)
    private String description;

    // Listo Relacionamiento con Lessons
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "courses",
            fetch = FetchType.LAZY
    )
    private List<Lessons> lessons;

    // Listo relacionamiento con Users
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_user_id",
            referencedColumnName = "user_id"
    )
    private Users instructor;

    // Listo relacionamiento con Enrollments

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "courses",
            fetch = FetchType.LAZY
    )
    private List<Enrollments> enrollments;

    // Listo relacionamiento con Messages
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "courses",
            fetch = FetchType.LAZY
    )
    private List<Messages> message;
}
