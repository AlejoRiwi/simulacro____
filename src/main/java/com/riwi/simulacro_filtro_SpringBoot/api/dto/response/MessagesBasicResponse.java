package com.riwi.simulacro_filtro_SpringBoot.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessagesBasicResponse {
    private Long message_id;
    private String message_content;
    private Date sent_date;
}
