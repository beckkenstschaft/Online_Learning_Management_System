package com.lms.model;
import javax.persistence.*;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url; // YouTube or local path
    private Long courseId;

    // Getters and Setters
}
