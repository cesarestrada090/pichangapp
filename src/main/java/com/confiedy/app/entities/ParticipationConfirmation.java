package com.confiedy.app.entities;

import com.confiedy.app.dto.InvitationStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "participation_confirmations")
public class ParticipationConfirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long confirmationId;

    @ManyToOne
    @JoinColumn(name = "championship_id", nullable = false)
    private Championship championship;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @Column(nullable = false)
    private LocalDateTime confirmationDate;

    // Otros campos y relaciones

    // Constructor por defecto
    public ParticipationConfirmation() {
        this.confirmationDate = LocalDateTime.now();
    }

    // Getters y setters
    // Otros métodos
}