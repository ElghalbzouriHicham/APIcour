package com.coursAPI.cours.Model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@EntityScan
@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chat {
    @Id
    private String id;
    private String contenueMessage;
    private String expediteur;
    private String distinateur;
    private String statutLecteur;
    private String typeMessage;





}
