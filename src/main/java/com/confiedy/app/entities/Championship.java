package com.confiedy.app.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Table(name = "championships")
public class Championship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long championshipId;

    @Column(nullable = false)
    private String championshipName;

    @ManyToOne
    @JoinColumn(name = "captain_id", nullable = false)
    private User captain;

    @Column(nullable = false)
    private LocalDate championshipDate;

    // Otros campos y relaciones

    // Constructor por defecto
    public Championship() {
    }

    // Getters y setters
    // Otros métodos
}