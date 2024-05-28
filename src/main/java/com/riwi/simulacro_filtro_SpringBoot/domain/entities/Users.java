package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column(length = 50, unique = true, nullable = false)
    private String userName;
    @Column(length = 255, nullable = false)
    private String password;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String fullName;

    @Enumerated(EnumType.STRING)
    private String role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "users",
            fetch = FetchType.LAZY
    )
    private List<Submissions> submissions;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "courses",
            fetch = FetchType.LAZY
    )
    private List<Courses> courses;
}
