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

    public Long getUserTeamId() {
        return userTeamId;
    }

    public void setUserTeamId(Long userTeamId) {
        this.userTeamId = userTeamId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}