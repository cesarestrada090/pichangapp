package com.confiedy.app.entities;

import com.confiedy.app.dto.TeamStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    @Column(nullable = false)
    private String teamName;

    @Column(nullable = false)
    private String country;

    @ManyToOne
    @JoinColumn(name = "captain_id", nullable = false)
    private User captain;

    @OneToMany(mappedBy = "team")
    private List<UserTeam> users;

    @OneToMany(mappedBy = "homeTeam")
    private List<Match> homeMatches;

    @OneToMany(mappedBy = "awayTeam")
    private List<Match> awayMatches;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TeamStatus teamStatus;

    // Otros campos y relaciones

    // Constructor por defecto
    public Team() {
    }

    // Getters y setters
    // Otros métodos
}