package com.confiedy.app.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Table(name = "championships")
public class Championship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer championshipId;

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

    public Integer getChampionshipId() {
        return championshipId;
    }

    public void setChampionshipId(Integer championshipId) {
        this.championshipId = championshipId;
    }

    public String getChampionshipName() {
        return championshipName;
    }

    public void setChampionshipName(String championshipName) {
        this.championshipName = championshipName;
    }

    public User getCaptain() {
        return captain;
    }

    public void setCaptain(User captain) {
        this.captain = captain;
    }

    public LocalDate getChampionshipDate() {
        return championshipDate;
    }

    public void setChampionshipDate(LocalDate championshipDate) {
        this.championshipDate = championshipDate;
    }

}