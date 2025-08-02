package com.lms.model;
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // ADMIN / INSTRUCTOR / STUDENT
    // Getters and Setters
}
