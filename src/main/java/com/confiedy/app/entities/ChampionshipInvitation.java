package com.confiedy.app.entities;

import com.confiedy.app.dto.InvitationStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "championship_invitations")
public class ChampionshipInvitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invitationId;

    @ManyToOne
    @JoinColumn(name = "championship_id", nullable = false)
    private Championship championship;

    @ManyToOne
    @JoinColumn(name = "invited_team_id", nullable = false)
    private Team invitedTeam;

    @Column(nullable = false)
    private LocalDateTime invitationDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InvitationStatus status;

    // Otros campos y relaciones

    // Constructor por defecto
    public ChampionshipInvitation() {
        this.invitationDate = LocalDateTime.now();
    }

    // Getters y setters
    // Otros métodos
}