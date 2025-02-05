package org.example.noteapplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ownerUsername;
//    @Lob
    private String content;
}
