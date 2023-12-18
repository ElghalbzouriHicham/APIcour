package com.coursAPI.cours.Model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Etudiant {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String dateEntrer;
    private String dateNaissance;
    private String status;
    private String genre;
}
