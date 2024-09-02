package com.example.myschedular.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Document(collection = "scheduled_tasks")
public class Model {
    @Id
    String id;

    int counter;
    Date last_updated;

}
