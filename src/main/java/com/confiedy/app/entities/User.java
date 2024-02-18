package com.confiedy.app.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column
    private String gmailId;

    @Column
    private String facebookId;

    @Column
    private String twitterId;

    @Column
    private String instagramId;

    @Column
    private String oauthAccessToken;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    // Otros campos y relaciones

    // Constructor por defecto
    public User() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters y setters
    // Otras relaciones y métodos
}