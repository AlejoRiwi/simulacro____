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
    private Long lesson_id;

    @Column(length = 100, nullable = false)
    private String lesson_title;

    @Lob
    @Column(nullable = false)
    private String content;

    // Lista la relacion con assignments 1 a muchos
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "lessons",
            fetch = FetchType.LAZY
    )
    private List<Assignments> assignments;


    // Lista la relacion muchs a uno
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_course_id",
            referencedColumnName = "course_id"
    )
    private Courses courses;

}
