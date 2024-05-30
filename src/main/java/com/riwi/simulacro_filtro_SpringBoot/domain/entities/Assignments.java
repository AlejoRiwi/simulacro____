package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity(name = "assignments")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assignments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignment_id;
    @Column(length = 100, nullable = false)
    private String assignment_title;
    @Lob
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date due_date;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "assignments",
            fetch = FetchType.LAZY
    )
    private List<Submissions> submissions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_lessons",
            referencedColumnName = "lesson_id"
    )
    private Lessons lessons;
}
