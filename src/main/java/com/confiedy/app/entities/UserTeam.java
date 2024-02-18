package com.confiedy.app.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "user_teams")
public class UserTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userTeamId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    // Otros campos y relaciones

    // Constructor por defecto
    public UserTeam() {
    }

    // Getters y setters
    // Otros métodos
}