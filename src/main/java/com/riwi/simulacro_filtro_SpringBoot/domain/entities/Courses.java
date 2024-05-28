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
    private int course_id;

    @Column(length = 100, nullable = false)
    private String course_name;

    @Lob
    @Column(nullable = false)
    private String description;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "lessons",
            fetch = FetchType.LAZY
    )
    private List<Lessons> lessons;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_user_id",
            referencedColumnName = "users"
    )
    private Users users;
}
