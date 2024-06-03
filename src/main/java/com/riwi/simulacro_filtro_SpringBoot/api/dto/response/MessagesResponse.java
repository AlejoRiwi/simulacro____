package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Courses;
import com.riwi.simulacro_filtro_SpringBoot.domain.entities.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessagesResponse {
    private Long message_id;
    private String message_content;
    private Date sent_date;
    private Courses courses;
    private Users sender;
    private Users reciever;
}
