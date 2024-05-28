package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "submissions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Submissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int submission_id;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Date submission_date;

    @Column(nullable = false)
    private BigDecimal grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_user_id",
            referencedColumnName = "user_id"
    )
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_assignment_id",
            referencedColumnName = "assignment_id"
    )
    private Assignments assignments;
}
