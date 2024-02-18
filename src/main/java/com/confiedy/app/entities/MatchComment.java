package com.confiedy.app.entities;

import com.confiedy.app.dto.TeamStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "match_comments")
public class MatchComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String commentText;

    @Column(nullable = false)
    private LocalDateTime commentDate;

    // Otros campos y relaciones

    // Constructor por defecto
    public MatchComment() {
        this.commentDate = LocalDateTime.now();
    }

    // Getters y setters
    // Otros métodos
}