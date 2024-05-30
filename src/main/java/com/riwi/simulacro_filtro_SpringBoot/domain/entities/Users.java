package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import com.riwi.simulacro_filtro_SpringBoot.util.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(length = 50, unique = true, nullable = false)
    private String userName;
    @Column(length = 255, nullable = false)
    private String password;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String fullName;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_user", nullable = false)
    private Role role;

    // Relacion Submissions
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "users",
            fetch = FetchType.LAZY
    )
    private List<Submissions> submissions;

    // Relacion Courses
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "instructor",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Courses> courses;

    // Relacion Enrollments
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            mappedBy = "users",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Enrollments> enrollments;

}
