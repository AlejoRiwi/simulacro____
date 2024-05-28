package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
