package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "lessons")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Lessons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lesson_id;

    @Column(length = 100, nullable = false)
    private String lesson_title;

    @Lob
    @Column(nullable = false)
    private String content;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "assignments",
            fetch = FetchType.LAZY
    )
    private List<Assignments> assignments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_course_id",
            referencedColumnName = "courses"
    )
    private Courses courses;

}
