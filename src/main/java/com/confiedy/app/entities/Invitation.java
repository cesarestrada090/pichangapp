package com.confiedy.app.entities;

import com.confiedy.app.dto.InvitationStatus;
import com.confiedy.app.dto.TeamStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "invitations")
public class Invitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invitationId;

    @ManyToOne
    @JoinColumn(name = "inviter_id", nullable = false)
    private User inviter;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private LocalDateTime invitationDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InvitationStatus status;

    // Otros campos y relaciones

    // Constructor por defecto
    public Invitation() {
        this.invitationDate = LocalDateTime.now();
    }

    // Getters y setters
    // Otros métodos
}