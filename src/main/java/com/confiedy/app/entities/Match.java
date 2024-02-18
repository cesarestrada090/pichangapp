package com.confiedy.app.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchId;

    @ManyToOne
    @JoinColumn(name = "home_team_id", referencedColumnName = "teamId", nullable = false)
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id", referencedColumnName = "teamId", nullable = false)
    private Team awayTeam;

    @Column(nullable = false)
    private LocalDate matchDate;

    @Column(nullable = false)
    private LocalTime matchTime;

    @Column(nullable = false)
    private String location;

    @Column(name = "home_team_score")
    private Integer homeTeamScore;

    @Column(name = "away_team_score")
    private Integer awayTeamScore;

    // Otros campos y relaciones

    // Constructor por defecto
    public Match() {
    }

    // Getters y setters
    // Otras relaciones y métodos
}