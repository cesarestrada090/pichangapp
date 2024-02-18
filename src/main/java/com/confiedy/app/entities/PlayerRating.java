package com.confiedy.app.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "player_ratings")
public class PlayerRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @ManyToOne
    @JoinColumn(name = "rated_player_id", nullable = false)
    private User ratedPlayer;

    @Column(nullable = false)
    private Double ratingStrength;

    @Column(nullable = false)
    private Double ratingSpeed;

    @Column(nullable = false)
    private Double ratingTechnique;

    @Column(nullable = false)
    private Double ratingDefense;

    @Column(nullable = false)
    private Double ratingFinishing;

    @Column(nullable = false)
    private LocalDateTime ratingDate;

    // Otros campos y relaciones

    // Constructor por defecto
    public PlayerRating() {
        this.ratingDate = LocalDateTime.now();
    }

    // Getters y setters
    // Otros métodos
}