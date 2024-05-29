package com.riwi.simulacro_filtro_SpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "message")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int message_id;

    @Lob
    @Column(nullable = false)
    private String message_content;

    @Column(nullable = false)
    private Date sent_date;

    //Lista relacion de muchos a uno con Courses
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_course_id",
            referencedColumnName = "course_id"
    )
    private Courses courses;

    //Lista relacion de muchos a uno con Courses
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fk_user_id",
            referencedColumnName = "user_id"
    )
    private Users sender;
}
